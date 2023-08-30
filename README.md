# Spring Boot REST API Example

This is a Spring Boot application that demonstrates a simple REST API for managing user data.

## Table of Contents
- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [ScreenShots](#screenshots)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [License](#license)

## Overview

This Spring Boot application provides a REST API for managing user data. It lets you perform CRUD (Create, Read, Update, Delete) operations on user records. The application uses a MySQL database to store user information and employs basic security measures.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Spring Security
- BCryptPasswordEncoder

## Getting Started


## Screenshots

- Home Page
![App Screenshot](https://github.com/US2002/CRUD_REST_API/blob/main/assets/HomePage.png)
- Save User
![App Screenshot](https://github.com/US2002/CRUD_REST_API/blob/main/assets/save.png)
- Get all Users
![App Screenshot](https://github.com/US2002/CRUD_REST_API/blob/main/assets/users.png)
- Get User by ID
![App Screenshot](https://github.com/US2002/CRUD_REST_API/blob/main/assets/user_id.png)
- Update user with ID
![App Screenshot](https://github.com/US2002/CRUD_REST_API/blob/main/assets/update.png)
- Delete user with ID
![App Screenshot](https://github.com/US2002/CRUD_REST_API/blob/main/assets/delete.png)



### Prerequisites

- Java 17
- MySQL database
- Postman (or any API testing tool)

### Installation

1. Clone the repository:
- git clone https://github.com/your-username/your-repo.git
- cd your-repo

2. Configure the database:
- Create a MySQL database named `restapi`.
- Update the database connection settings in `src/main/resources/application.properties`.

3. Build and run the application:
- ./mvnw spring-boot:run


## Usage

- Access the application at http://localhost:8080.
- Use Postman or any API testing tool to interact with the API.

## Endpoints

- **GET /users**: Get a list of all users.
- **GET /users/{id}**: Get details of a specific user.
- **POST /save**: Create a new user.
- **PUT /update/{id}**: Update user details.
- **DELETE /delete/{id}**: Delete a user.

## Contributing

Contributions are welcome! If you find any issues or improvements, please feel free to open a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
