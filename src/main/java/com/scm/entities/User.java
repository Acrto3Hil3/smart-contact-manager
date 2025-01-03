package com.scm.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

	@Id
	private String userId;

	@Column(name="user_name",nullable=false)
	private String name;

	@Column(nullable=false,unique=true)
	private String email;
	private String password;

	@Column(length = 10000)
	private String about;

	@Column(length = 500)
	private String profilePic;
	private String phoneNumber;
	
	//information
	private boolean enabled=false;
	private boolean emailVerified=false;
	private boolean phoneVerified=false;
	
	
	// SELF, GOOGLE, FACEBOOK, GITHUB, LINKEDIN, TWITTER
	private Providers provider=Providers.SELF;
	private String providerId;

	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	private List<Contacts> contacts=new ArrayList<>();
	
	
}
