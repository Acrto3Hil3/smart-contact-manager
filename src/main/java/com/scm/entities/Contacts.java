package com.scm.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor

public class Contacts {

	@Id
	private String contactId;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	private String picture;

	@Column(length = 10000)
	private String description;
	private boolean favourite=false;
	private String website;
	private String linkedInLink;

	// private List<String> socailLinks=new ArrayList<>();

	@ManyToOne
	private User user;
	
	@OneToMany(mappedBy ="contacts",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	private List<SocialLink> links=new ArrayList<>();
}
