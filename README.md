# Smart Contact Manager

Welcome to the Smart Contact Manager repository! This project serves as a practical application of Spring Boot, combining user management and contact storage functionality with modern web development technologies.

---

## Highlights

- **🚀 Introduction to Spring Boot Project:** Designed as a foundational module for larger applications.
- **📚 Learning Objective:** Enhance practical skills with Spring Boot and its ecosystem through real-world projects.
- **🖥️ Features:**
  - User management (registration, login, and profile creation)
  - Contact storage with options for adding, updating, and deleting contacts
- **🔒 Security:** Implementation of Spring Security for user authentication and authorization.
- **💻 Frontend:** Utilization of Thymeleaf for server-side rendering of dynamic content.
- **🌐 Modern Technologies:** A comprehensive approach to streamline development and future scalability.

---

## Key Features

### 1. Project-Based Learning
Engaging in this project enhances understanding of Spring Boot and its ecosystem, focusing on practical application.

### 2. Security Integration
The application uses **Spring Security** to safeguard user data and ensure secure access.

### 3. User Management
Dynamic features for user engagement, including registration, login, and profile creation.

### 4. Thymeleaf Advantage
Simplifies the rendering of dynamic web content for building intuitive user interfaces.

### 5. Contact Management
Comprehensive CRUD operations to manage contacts:
- Add new contacts
- Update existing contacts
- Delete unwanted contacts

### 6. Scalability
The project lays a solid foundation for developing larger, scalable applications with potential for future enhancements.

---

## Technologies Used

- **Backend:** Spring Boot
- **Frontend:** Thymeleaf, HTML, CSS,JavaSript,tailwindcss
- **Security:** Spring Security
- **Database:** MySQL Database (default), configurable for others like Oracle
- **Others:** Maven, Java 17/21

---

## Requirements

1. **Java Development Kit (JDK):** Ensure you have JDK 11,17 or 21 installed.
2. **Apache Maven:** Required for building and managing the project dependencies.
3. **Database Configuration:**
   - Default: MySQL Database (pre-configured)
   - Optional: Update `application.properties` for other databases like Oracle.
4. **IDE:** IntelliJ IDEA, Eclipse, or any other preferred IDE with Spring Boot support.

---

## Installation and Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/smart-contact-manager.git
   cd smart-contact-manager
   ```

2. **Build the Project:**
   ```bash
   mvn clean install
   ```

3. **Run the Application:**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application:**
   - Navigate to `http://localhost:8080` in your web browser.

5. **Database Console (MySQL):**
   - Access via `http://localhost:8080`
   - Default credentials:
     - Username: `username`
     - Password: (password)

---

## Project Structure

```plaintext
smart-contact-manager/
├── src/main/java
│   ├── com.example.smartcontactmanager
│   │   ├── config/         # Spring Security and application configurations
│   │   ├── controller/     # Controllers for handling HTTP requests
│   │   ├── model/          # Entity classes for User and Contact
│   │   ├── repository/     # JPA repositories
│   │   ├── service/        # Service layer for business logic
├── src/main/resources
│   ├── templates/          # Thymeleaf templates for views
│   ├── application.properties  # Application-specific properties
├── pom.xml                  # Maven dependencies
```

---

## Contributing

Contributions are welcome! If you'd like to contribute to the project, follow these steps:

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push to your branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a pull request.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---

## Acknowledgements

- Spring Boot Documentation: [Spring Boot](https://spring.io/projects/spring-boot)
- Thymeleaf Documentation: [Thymeleaf](https://www.thymeleaf.org/)


