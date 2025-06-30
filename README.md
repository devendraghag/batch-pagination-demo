# Batch Pagination Demo

A Spring Boot demo project showcasing Hibernate batching and pagination with an H2 in-memory database.

## 🚀 Features

- REST API for paginated user data
- Hibernate batch insert/update support
- H2 in-memory database with web console
- Clean Spring Boot structure

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Hibernate ORM

## 📦 Hibernate Batching Configuration

```properties
spring.jpa.properties.hibernate.jdbc.batch_size=30
spring.jpa.properties.hibernate.order_inserts=true
spring.jpa.properties.hibernate.order_updates=true
