# Spring Boot Authentication API

This is a simple Spring Boot application that provides authentication functionalities including user registration and login. It uses JWT for securing the API endpoints.

## Features

- **User Registration**: Allows new users to register with a username and password.
- **User Login**: Authenticates users and returns a JWT token for accessing secured endpoints.
- **JWT Token**: Generates and validates JWT tokens for securing API endpoints.

## Technologies Used

- **Spring Boot**: Framework for building the REST API.
- **Spring Security**: Used for authentication and securing endpoints.
- **JWT**: JSON Web Token for securing API endpoints.
- **Hibernate/JPA**: ORM tool for database interaction.
- **MySQL**: Relational database used for storing user data.
- **Maven**: Build and dependency management tool.

## Project Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com.demo/
│   │       ├── controller/        # Controllers (e.g., AuthController)
│   │       ├── dto/               # Data Transfer Objects (e.g., RegisterRequest, LoginRequest)
│   │       ├── jwt/               # JWT Utility classes (e.g., JwtTokenProvider)
│   │       ├── model/             # Entity classes (e.g., User)
│   │       ├── repository/        # Repository interfaces (e.g., UserRepository)
│   │       ├── service/           # Service classes (e.g., UserService)
│   │       └── Application.java   # Main application class
│   └── resources/
│       ├── application.properties # Application configuration
│       └── data.sql               # Initial SQL script for database setup (optional)
└── test/                          # Unit and integration tests
