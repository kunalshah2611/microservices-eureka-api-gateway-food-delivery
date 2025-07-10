# Microservices Project: Eureka Server, API Gateway, and Food Delivery Service

## Overview

This project consists of three main components:
- **Eureka Server**: Service registry for service discovery.
- **API Gateway**: Gateway to route requests to backend services.
- **Food Delivery Service**: A microservice providing food delivery functionalities.

## Prerequisites

- Java 17 or later installed
- Maven installed
- Internet connection to download dependencies

## Project Structure

- `eureka-server/`: Eureka service registry
- `api-gateway/`: API Gateway service
- `food-delivery-service/`: Food Delivery microservice

## Running the Services

### 1. Start Eureka Server

The Eureka server runs on port 8761.

```bash
cd eureka-server
mvn clean install
mvn spring-boot:run
```

Verify Eureka server is running by visiting: `http://localhost:8761`

### 2. Start API Gateway

The API Gateway routes requests to backend services.

```bash
cd api-gateway
mvn clean install
mvn spring-boot:run
```

### 3. Start Food Delivery Service

The Food Delivery service registers itself with Eureka and provides APIs.

```bash
cd food-delivery-service
mvn clean install
mvn spring-boot:run
```

## Notes

- Ensure Eureka server is running before starting other services.
- The services use default ports configured in their respective `application.properties`.
- You can customize ports and other settings in the `application.properties` files.

## Troubleshooting

- If a service fails to start, check the logs for errors.
- Make sure ports 8761 (Eureka), and other service ports are free.
- Verify Java and Maven installations.
