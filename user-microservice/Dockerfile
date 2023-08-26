# Use a base image with Java runtime
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the target directory of your project into the container
COPY target/user-microservice-*.jar /app/user-microservice.jar

# Expose the port that the Spring Boot application is running on
EXPOSE 8080

# Command to run the application when the container starts
CMD ["java", "-jar", "/app/user-microservice.jar"]

