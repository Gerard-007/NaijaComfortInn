# NaijaComfortInn API

## Overview
NaijaComfortInn is a hotel management API that allows users to manage hotel rooms, bookings, customers, and staff. This API provides a RESTful interface to interact with the hotel’s database and streamline operations.

## Tech Stack
- **Backend:** Spring Boot (Java)
- **Database:** MongoDB (Atlas)
- **Authentication:** JWT
- **Deployment:** Docker, AWS

## Features
- User Authentication (JWT-based)
- CRUD operations for hotel rooms
- Booking management
- Customer management
- Staff management
- Secure API endpoints

## Installation & Setup

### Prerequisites
- Java 17+
- Maven
- MongoDB (Atlas or Local)

### Clone the Repository
```sh
$ git clone https://github.com/Gerard-007/NaijaComfortInn.git
$ cd NaijaComfortInn
```

### Configure Environment Variables
Create an `/resources/application.properties` file and update the following variables:
```application.properties
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<your_cluster>.tvycbjn.mongodb.net/naijacomfortinn?retryWrites=true&w=majority
server.port=8080
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your_email@gmail.com
spring.mail.password=your_password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

### Build and Run
```sh
$ mvn clean install
$ mvn spring-boot:run
```

## API Endpoints

### Authentication
| Method | Endpoint           | Description          |
|--------|--------------------|----------------------|
| POST   | `/register`    | Register a new Admin |
| POST   | `/login`      | Authenticate a Admin |

### Rooms
| Method | Endpoint          | Description             |
|--------|------------------|-------------------------|
| GET    | `/rooms`         | Get all rooms           |
| GET    | `/rooms/{id}`    | Get room by ID          |
| POST   | `/rooms`         | Create a new room       |
| PUT    | `/rooms/{id}`    | Update room details     |
| DELETE | `/rooms/{id}`    | Delete a room           |

### Bookings
| Method | Endpoint          | Description               |
|--------|------------------|---------------------------|
| GET    | `/bookings`      | Get all bookings          |
| GET    | `/bookings/{id}` | Get booking by ID         |
| POST   | `/bookings`      | Create a new booking      |
| PUT    | `/bookings/{id}` | Update booking details    |
| DELETE | `/bookings/{id}` | Cancel a booking         |

## Security
- All endpoints (except authentication) require a Bearer Token.
- Role-based access control (Admin, Guests).

## Deployment (Docker)
```sh
$ docker build -t naijacomfortinn .
$ docker run -p 8080:8080 naijacomfortinn
```

## License
MIT License

## Contact
For support, contact [gerardnwazk@gmail.com](mailto:gerardnwazk@gmail.com).
