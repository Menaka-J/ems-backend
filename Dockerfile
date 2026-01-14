# Use Java 17 (required for Spring Boot 3.x)
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy Maven wrapper & config
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Download dependencies (cache layer)
RUN ./mvnw dependency:go-offline

# Copy source code
COPY src src

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose Spring Boot port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/ems-backend-0.0.1-SNAPSHOT.jar"]
