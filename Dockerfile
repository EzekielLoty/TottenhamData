# Use an official Maven image with OpenJDK 21 to build the Spring Boot app
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Set app directory
WORKDIR /app

# Copy the pom.xml and install dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code and build the application
COPY src ./src
RUN mvn clean package -DskipTests

# Use an official Eclipse Temurin OpenJDK 21 image to run the application
FROM eclipse-temurin:21-jdk

# Set the working directory
WORKDIR /app

# Copy the build JAR file from the build stage
COPY --from=build /app/target/Spurs-Stats-0.0.1-SNAPSHOT.jar .

# Expose port 8080
EXPOSE 8080

# Specify the command to run the application
ENTRYPOINT ["java", "-jar", "/app/Spurs-Stats-0.0.1-SNAPSHOT.jar"]