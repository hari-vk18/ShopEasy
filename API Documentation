# ShopEasy API Documentation

This document describes the API endpoints for the ShopEasy e-commerce platform backend.

---

## **Product Endpoints**

### 1. Get All Products
**Endpoint:** `GET /api/v1/products/all`
- **Description:** Retrieves all products from the database.
- **Authentication:** Required.
- **Response Example:**
  ```json
  {
      "message": "Found!",
      "data": [
          {
              "id": 1,
              "name": "Tv",
              "brand": "Apple",
              "price": 359,
              "description": "Apple Smart Tv",
              "category": { "id": 1, "name": "Electronics" },
              "images": []
          },
          {
              "id": 2,
              "name": "Watch",
              "brand": "Apple",
              "price": 359,
              "description": "Apple Smart Watch",
              "category": { "id": 1, "name": "Electronics" },
              "images": []
          }
      ]
  }
  ```

### 2. Add Product
**Endpoint:** `POST /api/v1/products/add`
- **Description:** Adds a new product to the database.
- **Authentication:** Bearer Token required.
- **Request Body Example:**
  ```json
  {
      "name": "Phone",
      "brand": "Apple",
      "price": 359,
      "inventory": 25,
      "description": "Apple Smart Phone",
      "category": "Electronics"
  }
  ```
- **Response Example:**
  - **200 OK:**
    ```json
    {
        "message": "Add Product Success!",
        "data": {
            "id": 4,
            "name": "IPhone",
            "brand": "Apple",
            "price": 359,
            "description": "Apple Smart IPhone",
            "category": { "id": 1, "name": "Electronics" },
            "images": []
        }
    }
    ```
  - **409 Conflict:**
    ```json
    {
        "message": "Apple IPhone already exists",
        "data": null
    }
    ```

---

## **Image Endpoints**

### 1. Upload Image
**Endpoint:** `POST /api/v1/images/upload`
- **Query Parameters:**
  - `prodId` (required): ID of the product to associate the image with.
- **Description:** Uploads one or more images for a product.
- **Request Example:** Form-data with file uploads.

---

## **Cart Endpoints**

### 1. Add Item to Cart
**Endpoint:** `POST /api/v1/cartItems/item/add`
- **Query Parameters:**
  - `cartId` (optional): ID of the cart.
  - `productId` (required): ID of the product.
  - `quantity` (required): Quantity to add.
- **Description:** Adds an item to the cart.
- **Response Example:**
  ```json
  {
      "message": "Add Item Success",
      "data": null
  }
  ```

### 2. Get Cart Details
**Endpoint:** `GET /api/v1/carts/{cartId}/my-cart`
- **Description:** Retrieves details of a specific cart.
- **Response Example:**
  ```json
  {
      "message": "Cart found",
      "data": {
          "id": 1,
          "totalAmount": 3590,
          "items": [
              {
                  "id": 3,
                  "quantity": 10,
                  "unitPrice": 359,
                  "totalPrice": 3590,
                  "product": {
                      "id": 1,
                      "name": "Tv",
                      "brand": "Apple",
                      "price": 359,
                      "description": "Apple Smart Tv",
                      "category": { "id": 1, "name": "Electronics" },
                      "images": []
                  }
              }
          ]
      }
  }
  ```

---

## **User Endpoints**

### 1. Register User
**Endpoint:** `POST /api/v1/user/add`
- **Description:** Registers a new user.
- **Request Body Example:**
  ```json
  {
      "firstName": "Hari",
      "lastName": "Prasath",
      "email": "prasathhari972@gmail.com",
      "password": "hello"
  }
  ```
- **Response Example:**
  ```json
  {
      "message": "Create Success!",
      "data": {
          "id": 8,
          "firstName": "Hari",
          "lastName": "Prasath",
          "email": "prasathhari972@gmail.com",
          "cart": null,
          "orders": null
      }
  }
  ```

---

## **Authentication Endpoints**

### 1. Login
**Endpoint:** `POST /api/v1/auth/login`
- **Description:** Authenticates a user and generates a token.
- **Request Body Example:**
  ```json
  {
      "email": "user1@email.com",
      "password": "123456"
  }
  ```
- **Response Example:**
  ```json
  {
      "message": "Login Success!",
      "data": {
          "id": 1,
          "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMUBlbWFpbC5jb20iLCJpZCI6MSwicm9sZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTczNDkzNjY0OSwiZXhwIjoxNzM0OTQwMjQ5fQ.ZHRPBmlxafjOlznS_Fswo4hldNdSZCDT73UzCDdurOg"
      }
  }
  ```

---
