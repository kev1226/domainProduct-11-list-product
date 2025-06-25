# Etapa 1: Compilación del JAR
FROM maven:3.9.5-eclipse-temurin-17-alpine AS builder

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Imagen final
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

EXPOSE 3021

ENTRYPOINT ["java", "-jar", "app.jar"]
