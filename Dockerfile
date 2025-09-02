# Use official lightweight Java image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file (make sure you build with mvn or gradle before deploy)
COPY target/eureka-server-0.0.1-SNAPSHOT.jar app.jar

# Expose port (Render sets PORT env var dynamically, so we don’t hardcode it)
EXPOSE 8050

# Run the Spring Boot app
CMD ["java", "-jar", "app.jar"]
