# Todo Management System (Spring Boot REST API)

## 📖 Overview
The **Todo Management System** is a Spring Boot REST API project designed to manage tasks efficiently with authentication and role-based authorization. The application follows a **layered architecture** (`Controller → Service → Repository`) and provides RESTful endpoints for performing CRUD operations on todos, along with task status management.

Currently, the REST API implementation is complete, and integration of **Spring Security 6** for role-based access control is in progress.

---

## 🚀 Tech Stack

- **Spring Boot 3** – Application framework
- **Spring Security 6** – Authentication & role-based authorization
- **Spring Data JPA (Hibernate 6)** – ORM and database access
- **MySQL** – Relational database
- **Maven** – Build and dependency management
- **IntelliJ IDEA** – Development IDE
- **Postman** – API testing tool

---

## ⚙️ Features

### ✅ Todo Management
- Add Todo – Create new tasks
- Get Todo – Retrieve a task by ID
- Get All Todos – Retrieve all tasks
- Update Todo – Modify existing tasks
- Delete Todo – Remove tasks
- Mark Complete/Incomplete – Update task status

### 🔐 Role-Based Access Control (In Progress)
#### Admin
- Full CRUD access

#### User
- View tasks
- Filter tasks by complete/incomplete status

---

## 🏗️ Architecture

The project follows a **layered architecture**:

- **Controller Layer** – Handles HTTP requests and responses
- **Service Layer** – Contains business logic
- **Repository Layer** – Handles database interaction using JPA

### Architecture Flow
```text
Client Request
      ↓
Controller Layer
      ↓
Service Layer
      ↓
Repository Layer
      ↓
MySQL Database
```

## 🔧 Setup & Installation

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-Shraddhabw/todo-management.git
cd todo-management
```
### 2️⃣ Configure MySQL Database

Update the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
```
### 3️⃣ Build and Run the Project

```bash
mvn spring-boot:run
```
The application will start at:

```bash
http://localhost:8080
```
### 4️⃣ Test APIs

Use **Postman** or any API testing tool to test the endpoints.

