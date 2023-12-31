# Spring Boot REST API Example

This is a Spring Boot application that demonstrates a simple REST API for managing user data.
** Server is Live on ** : https://crud-rest-api-gh0x.onrender.com
Can access various endpoints using this URL

## Table of Contents

- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Endpoints](#endpoints)
  - [ScreenShots](#screenshots)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
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

## EndPoints

1. **localhost:8080/** ==> HomePage
2. **localhost:8080/save** ==> Insert | Put | Create user
3. **localhost:8080/users** ==> Select | Get | Read all users
4. **localhost:8080/user/{id}** ==> Select | Get | Read user from ID
5. **localhost:8080/update/{id}** ==> Update | Post | Update user with ID
6. **localhost:8080/delete/{id}** ==> Delete | Delete | Delete user with ID

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

- git clone https://github.com/US2002/CRUD_REST_API.git
- cd your-repo

2. Configure the database:

- Create a MySQL database named `restapi`.
- Update the database connection settings in `src/main/resources/application.properties`.

3. Build and run the application:

- ./mvnw spring-boot:run

## Usage

- Access the application at http://localhost:8080.
- Use Postman or any API testing tool to interact with the API.

## Running the project with MySQL

This project uses an in-memory database so that you don't have to install a database in order to run it. However, converting it to run with another relational database such as MySQL or PostgreSQL is very easy. Since the project uses Spring Data and the Repository pattern, it's even fairly easy to back the same service with MongoDB.

Here is what you would do to back the services with MySQL, for example:

### In pom.xml add:

```
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
```

### Append this to the end of application.properties:

```
---
spring.datasource.url=jdbc:mysql://localhost:3306/crudusers?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=2580
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLDialect

#!For SQL Server
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### Then run is using the 'mysql' profile:

```
        java -jar -Dspring.profiles.active=mysql target/spring-boot-rest-example-0.5.0.war
or
        mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=mysql"
```

## Running the project with MongoDB

This guide will walk you through the process of setting up and running a Spring Boot project that uses a MongoDB database for data storage.

### In pom.xml add:

```
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-data-mongodb</artifactId>
		    </dependency>
```

### Append this to the end of application.properties:

```
---
#!For Spring LocalHost
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=userDB

#!For Spring Cloud Host
spring.data.mongodb.uri=mongodb+srv://<UserName>:<Password>@<ClusterName>.mongodb.net/<DataBaseName>?retryWrites=true&w=majority
```

## Contributing

Contributions are welcome! If you find any issues or improvements, please feel free to open a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
