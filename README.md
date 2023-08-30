# Spring Boot REST API Example

This is a Spring Boot application that demonstrates a simple REST API for managing user data.

## Table of Contents
- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [License](#license)

## Overview

This Spring Boot application provides a REST API for managing user data. It allows you to perform CRUD (Create, Read, Update, Delete) operations on user records. The application uses a MySQL database to store user information, and it employs basic security measures.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Spring Security
- BCryptPasswordEncoder

## Getting Started


## Screenshots

![App Screenshot](https://github.com/US2002/Temperature_Conversion/blob/main/assets/Screenshot%20(19).png)
![App Screenshot](https://github.com/US2002/Temperature_Conversion/blob/main/assets/2023-07-20%2004-21-09.mkv)


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
