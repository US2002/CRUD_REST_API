# # Use a base image with Maven and JDK
# FROM maven:3.8.4-openjdk-8 AS build

# # Set the working directory inside the container
# WORKDIR /app

# # Copy the Maven project files into the container
# COPY pom.xml .
# COPY src ./src

# # Build the Maven project, skipping tests
# RUN mvn clean package -DskipTests

# # Create a new stage for the runtime image
# FROM openjdk:11-jre-slim

# # Set the working directory inside the container
# WORKDIR /app

# # Copy the JAR file built in the previous stage
# COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar demo.jar

# # Expose the port that the Spring Boot application will listen on
# EXPOSE 8080

# # Define the command to run the Spring Boot application
# CMD ["java", "-jar", "demo.jar"]

FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar restapi.jar
ENTRYPOINT ["java","-jar","/restapi.jar"]
EXPOSE 8080