# WebSpring - Product CRUD Application

A modern Spring Boot REST API application with an interactive web interface for managing products. This application demonstrates CRUD (Create, Read, Update, Delete) operations using Spring Boot and vanilla JavaScript.

## 🚀 Features

- **RESTful API** - Complete REST API for product management
- **Interactive UI** - Beautiful web interface for managing products
- **In-Memory Storage** - Simple ArrayList-based data storage
- **CORS Enabled** - Cross-Origin Resource Sharing configured
- **Responsive Design** - Modern, gradient-styled user interface
- **Spring Boot 4.0.0** - Built with the latest Spring Boot version
- **Lombok Integration** - Reduced boilerplate code with Lombok

## 📋 Prerequisites

- Java 25 or higher
- Gradle (wrapper included)
- A modern web browser

## 🛠️ Technology Stack

- **Backend Framework:** Spring Boot 4.0.0
- **Build Tool:** Gradle
- **Java Version:** 25
- **Dependencies:**
  - Spring Boot Starter Web
  - Spring Boot DevTools
  - Lombok
  - JUnit 5 (for testing)

## 📁 Project Structure

```
WebSpring/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/WebSpring/
│   │   │       ├── WebSpringApplication.java
│   │   │       ├── config/
│   │   │       │   └── WebConfig.java
│   │   │       ├── Controller/
│   │   │       │   ├── HomeClass.java
│   │   │       │   └── ProductController.java
│   │   │       ├── model/
│   │   │       │   └── Product.java
│   │   │       └── service/
│   │   │           └── ProductService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           └── index.html
│   └── test/
│       └── java/
│           └── com/example/WebSpring/
│               └── WebSpringApplicationTests.java
├── build.gradle
└── README.md
```

## 🚦 Getting Started

### 1. Clone or Download the Project

```bash
cd /Users/musaib.maqbool/Downloads/WebSpring
```

### 2. Build the Project

```bash
./gradlew build
```

### 3. Run the Application

```bash
./gradlew bootRun
```

Or run the JAR file:

```bash
java -jar build/libs/WebSpring-1.0.0.jar
```

### 4. Access the Application

The application will start on **port 8080** by default.

## 🌐 Available URLs

### Web Interface
- **http://localhost:8080/index.html** - Interactive Product CRUD UI

### API Endpoints

#### General Endpoints
- `GET /` - Welcome message
- `GET /about` - About page information

#### Product API Endpoints

| Method | Endpoint | Description | Request Body |
|--------|----------|-------------|--------------|
| GET | `/products` | Get all products | - |
| GET | `/products/{id}` | Get product by ID | - |
| POST | `/products` | Create new product | JSON |
| PUT | `/products/{id}` | Update product | JSON |
| DELETE | `/products/{id}` | Delete product | - |

## 📝 API Usage Examples

### Get All Products

```bash
curl http://localhost:8080/products
```

### Get Product by ID

```bash
curl http://localhost:8080/products/1011
```

### Create New Product

```bash
curl -X POST http://localhost:8080/products \
  -H "Content-Type: application/json" \
  -d '{
    "id": 1014,
    "name": "Headphones",
    "price": 5000
  }'
```

### Update Product

```bash
curl -X PUT http://localhost:8080/products/1014 \
  -H "Content-Type: application/json" \
  -d '{
    "id": 1014,
    "name": "Wireless Headphones",
    "price": 7000
  }'
```

### Delete Product

```bash
curl -X DELETE http://localhost:8080/products/1014
```

## 📊 Default Products

The application comes pre-loaded with three sample products:

| ID | Name | Price |
|----|------|-------|
| 1011 | Laptop | 45000 |
| 1012 | Smartphone | 25000 |
| 1013 | Tablet | 15000 |

## 🎨 Web Interface Features

The interactive HTML interface provides:
- **View All Products** - Display products in a clean table format
- **Add Product** - Form to create new products
- **Update Product** - Update existing product details
- **Delete Product** - Remove products by ID
- **Real-time Updates** - Instant feedback on all operations
- **Modern UI** - Gradient background with smooth animations

## 🔧 Configuration

### Application Properties

Located at: `src/main/resources/application.properties`

```properties
spring.application.name=WebSpring
```

### CORS Configuration

CORS is configured in `WebConfig.java` to allow:
- All origins
- All HTTP methods
- All headers

## 🧪 Testing

Run tests using:

```bash
./gradlew test
```

## 📦 Building for Production

Create a production-ready JAR:

```bash
./gradlew clean build
```

The JAR file will be created at: `build/libs/WebSpring-1.0.0.jar`

## 🐛 Troubleshooting

### Port Already in Use

If port 8080 is already in use, change it in `application.properties`:

```properties
server.port=8081
```

### Build Errors

Clean and rebuild:

```bash
./gradlew clean build --refresh-dependencies
```

## 📚 API Response Formats

### Success Response (200 OK)

```json
{
  "id": 1011,
  "name": "Laptop",
  "price": 45000.0
}
```

### Created Response (201 Created)

```json
{
  "id": 1014,
  "name": "Headphones",
  "price": 5000.0
}
```

### Not Found Response (404)

No content with 404 status code

### Delete Success (204 No Content)

No content with 204 status code

## 🤝 Contributing

1. Fork the project
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Open a Pull Request

## 📄 License

This project is created for educational and demonstration purposes.

## 👨‍💻 Author

Built with Spring Boot and ❤️

## 🔗 Additional Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring REST API Guide](https://spring.io/guides/gs/rest-service/)
- [Lombok Documentation](https://projectlombok.org/)

---

**Note:** This application uses in-memory storage. All data will be lost when the application is restarted. For persistent storage, consider integrating a database like H2, MySQL, or PostgreSQL.

