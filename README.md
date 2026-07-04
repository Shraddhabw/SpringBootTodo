# Todo Management System

A REST API built with Spring Boot for managing todo tasks with authentication and role-based authorization.

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Security 6
- Spring Data JPA + Hibernate
- MySQL
- Maven
- Lombok
- ModelMapper

## Getting Started

### Prerequisites
- Java 17+
- MySQL
- Maven

### Setup

**1. Clone the repository**
```bash
git clone https://github.com/Shraddhabw/todo-management.git
cd todo-management
```

**2. Create database**
```sql
CREATE DATABASE todo_management;
```

**3. Configure `application.properties`**
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_management
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

**4. Insert roles (run once after first startup)**
```sql
INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
```

**5. Run the application**
```bash
mvn spring-boot:run
```
API runs at `http://localhost:8080`

## API Endpoints

### Auth
| Method | URL | Access |
|---|---|---|
| POST | `/api/auth/register` | Public |
| POST | `/api/auth/login` | Public |

### Todos
| Method | URL | Access |
|---|---|---|
| POST | `/api/todos` | ADMIN |
| GET | `/api/todos` | ADMIN, USER |
| GET | `/api/todos/{id}` | ADMIN, USER |
| PUT | `/api/todos/{id}` | ADMIN |
| DELETE | `/api/todos/{id}` | ADMIN |
| PATCH | `/api/todos/{id}/complete` | ADMIN, USER |
| PATCH | `/api/todos/{id}/in-complete` | ADMIN, USER |

## Authentication

This API uses **HTTP Basic Auth**. Pass credentials in the Authorization header with every request.

## Author

**Shraddha** — [GitHub](https://github.com/Shraddhabw)
