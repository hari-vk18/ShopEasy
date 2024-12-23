# ShopEasy

ShopEasy is an e-commerce application that allows users to browse and purchase products online. It provides features such as product catalog, user authentication, shopping cart, and order management.

## Features

- **Product Catalog:** Browse a variety of products with detailed information.
- **User Authentication:** User registration, login, and authentication.
- **Shopping Cart:** Add, update, and remove items from the cart.
- **Order Management:** Place orders and view order history.

## Tech Stack

- **Backend:**
  - Spring Boot
  - Java
  - Hibernate / JPA for database interaction

- **Database:**
  - MySQL (or your chosen database)

- **Authentication:**
  - JWT (JSON Web Tokens) for secure authentication

## Setup Instructions

### Prerequisites

- Java 17 or higher
- Spring Boot
- MySQL
- IDE (e.g., IntelliJ IDEA, Eclipse for Java; VS Code for frontend)

### Clone the repository

```bash
git clone https://github.com/hari-vk18/ShopEasy.git
cd ShopEasy
```
##Folder Structure
###Backend

- **src/main/java/com/shopeasy:**
  - controller: Contains REST controllers for handling requests.
  - service: Contains service classes with business logic.
  - repository: Contains repository interfaces for database operations.
  - model: Contains JPA entities (e.g., Product, Cart, Order).
  - config: Configuration classes, such as for JWT authentication.
  - src/main/resources/application.properties: Configuration for the backend (e.g., database, server, logging).


##Acknowledgements

  - Spring Boot Documentation
  - JWT.io
  - MySQL Documentation
