# Build stage
FROM maven:3.9-eclipse-temurin-21-alpine AS build
WORKDIR /app
RUN apk add --no-cache tzdata
ENV TZ=Asia/Ho_Chi_Minh

# Copy only pom.xml first to cache dependencies
COPY pom.xml .
# Kiem tra xem co file pom.xml moi hay khong, neu khong thi su dung cac lop cache
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Check if pom.xml has changed, if not use cached layers
RUN mvn clean package -DskipTests

# Sử dụng OpenJDK 21 làm base image
FROM openjdk:21-slim AS base

# Đặt biến môi trường để giảm thông tin log không cần thiết
#ENV JAVA_OPTS=""

# Tạo thư mục làm việc cho ứng dụng
WORKDIR /app

# Copy file jar của ứng dụng Spring Boot vào container
COPY --from=build /app/target/*.jar app.jar

# Expose cổng mà ứng dụng Spring Boot sẽ chạy (mặc định là 8080)
EXPOSE 8081

# Lệnh để chạy ứng dụng Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]