# ShopEasy

This is a Spring Boot-based backend application for an e-commerce platform. It includes RESTful APIs for managing products, users, orders, and more. The application uses MySQL as the database.

## Features

- User authentication and authorization
- Product catalog management
- Order placement and management
- Integration with MySQL database
- RESTful APIs for seamless communication

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MySQL Server](https://dev.mysql.com/downloads/installer/)
- [Postman](https://www.postman.com/) (optional, for testing APIs)

## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/ecommerce-backend.git
   cd ecommerce-backend
   ```

2. **Configure the Database**
   - Create a database in MySQL:
     ```sql
     CREATE DATABASE ecommerce;
     ```
   - Update the `application.properties` file in `src/main/resources` with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     ```

3. **Build the Project**
   - Navigate to the project directory and run:
     ```bash
     mvn clean install
     ```

4. **Run the Application**
   - Start the Spring Boot application:
     ```bash
     mvn spring-boot:run
     ```

5. **API Documentation**
   - Access the API documentation (e.g., Swagger UI) at:
     ```
     http://localhost:8080/swagger-ui.html
     ```

## Usage

### Testing APIs
- Use Postman or a similar tool to test the endpoints.
- Import the `postman-collection.json` file (if provided) to access predefined requests.

### Endpoints Overview

#### User Management
- **POST** `/api/users/register` - Register a new user
- **POST** `/api/users/login` - Login a user

#### Product Management
- **GET** `/api/products/all` - Get all products
- **POST** `/api/products/add` - Add a new product (Admin only)

#### Order Management
- **POST** `/api/orders/order` - Place a new order
- **GET** `/api/orders/orderID/order` - Get user orders

## Technologies Used

- **Backend Framework:** Spring Boot
- **Database:** MySQL
- **Build Tool:** Maven
- **API Documentation:** Swagger


## Contact

For any questions or support, feel free to reach out:

- Email: prasathhari972@gmail.com
- GitHub: [hari-vk18](https://github.com/hari-vk18)
