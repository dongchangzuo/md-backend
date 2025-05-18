# MD Backend

A Spring Boot backend application built with Java 8 featuring authentication and authorization.

## Project Structure

The project follows a standard Spring Boot architecture:

- `controller`: REST controllers that handle HTTP requests
- `service`: Business logic layer
- `repository`: Data access layer
- `model`: Domain model entities
- `security`: Security configuration and JWT implementation
- `dto`: Data Transfer Objects
- `config`: Application configurations

## Technologies

- Java 8
- Spring Boot 2.7.14
- Spring Security with JWT
- Spring Data JPA
- H2 Database (in-memory)
- Swagger UI for API documentation
- CORS enabled for cross-domain access
- Maven
- Lombok

## Security Features

- Email and password based authentication
- JWT (JSON Web Token) for stateless authentication
- Role-based authorization (USER, ADMIN)
- Protected endpoints that require authentication
- Password encoding with BCrypt
- Cross-Origin Resource Sharing (CORS) enabled

## Getting Started

### Prerequisites

- JDK 8
- Maven 3.x

### Running the Application

1. Clone the repository
2. Navigate to the project directory
3. Run the following command:

```bash
mvn spring-boot:run
```

The application will start on port 8080.

## API Documentation

The API documentation is available via Swagger UI at:

http://localhost:8080/swagger-ui/

This provides an interactive documentation interface where you can:
- View all available endpoints
- See required parameters and response formats
- Execute API calls directly from the browser
- Authenticate using JWT token

### API Endpoints

#### Public Endpoints
- GET `/api/hello`: Sample hello endpoint
- POST `/api/auth/signin`: Sign in and get JWT token
- POST `/api/auth/signup`: Register a new user

#### Protected Endpoints (Requires Authentication)
- GET `/api/users`: Get all users
- GET `/api/users/{id}`: Get user by ID
- POST `/api/users`: Create a new user (ADMIN only)
- DELETE `/api/users/{id}`: Delete a user by ID (ADMIN only)

### Cross-Origin Resource Sharing (CORS)

This API supports CORS for cross-domain access from any origin. The following are enabled:
- All origins via wildcard pattern
- All common HTTP methods (GET, POST, PUT, DELETE, etc.)
- Authorization headers
- Credentials (cookies, authentication)
- Pre-flight request caching for 1 hour

Frontend applications can access this API from any domain without CORS restrictions.

### H2 Console

The H2 database console is available at: http://localhost:8080/h2-console

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: `password`

### Authentication

To authenticate, send a POST request to `/api/auth/signin` with:

```json
{
  "email": "user@example.com",
  "password": "password123"
}
```

The response will include a JWT token:

```json
{
  "token": "eyJhbGciOiJIUzUxMiJ9...",
  "type": "Bearer",
  "id": 1,
  "username": "username",
  "email": "user@example.com",
  "roles": ["ROLE_USER"]
}
```

For protected endpoints, include the token in the Authorization header:
```
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9...
```

You can also use the "Authorize" button in Swagger UI to set your JWT token for testing endpoints. # md-backend
# md-backend
