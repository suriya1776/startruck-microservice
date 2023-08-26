# Use a base image with Java runtime
FROM openjdk:20-ea-17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the target directory of your project into the container
COPY target/email-microservice-*.jar /app/email-microservice.jar

# Expose the port that the Spring Boot application is running on
EXPOSE 8081

# Command to run the application when the container starts
CMD ["java", "-jar", "/app/email-microservice.jar"]
