# SBT-Registration-Form-AP
The **SBT Registration Form AP** is a Java-based project designed to streamline the process of user registration. Built using Spring Boot and other modern technologies, the application offers a structured approach to handling user data and registration workflows.

## Features
- **User-Friendly Interface**: Simple and intuitive form for user registration.
- **Validation**: Client-side and server-side validation to ensure data integrity.
- **Database Integration**: Stores user details securely in a database.
- **API Integration**: Provides RESTful endpoints for data access and manipulation.
- **Scalable Architecture**: Built with Spring Boot for scalability and maintainability.

## Technologies Used
- **Backend**: Java, Spring Boot, Hibernate
- **Frontend**: HTML, CSS, JavaScript, Thymeleaf
- **Database**: MySQL/MongoDB (or your preferred database)
- **Build Tool**: Maven

## Prerequisites
To set up and run the project, ensure you have the following installed:

- Java JDK 11 or later
- Maven
- MySQL/MongoDB
- IDE (e.g., IntelliJ IDEA, Eclipse)

## Installation and Setup
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/SBT-Registration-Form-AP.git
   cd SBT-Registration-Form-AP
   ```

2. **Configure the Database**:
   - Update the `application.properties` file with your database details.
     ```properties
    spring.application.name=SBT-Registration-Form-AP
    server.port=8092
    spring.data.mongodb.uri=mongodb://localhost:27017/SBT-Registration-Form-AP
    logging.level.org.springframework.web=DEBUG
    spring.thymeleaf.enabled=true
    spring.thymeleaf.prefix=classpath:/templates/
    spring.thymeleaf.suffix=.html
    spring.thymeleaf.mode=HTML

3. **Build the Project**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the Application**:
   Open your browser and go to `http://localhost:8092`.

## Usage
1. Navigate to the registration form.
2. Fill in the required details and submit.
3. The system validates the input and stores the data in the database.
4. View or manage registered users via the provided REST APIs or admin interface.

## Project Structure
```
SBT-Registration-Form-AP
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.sbtregistration
│   │   │       ├── controller
│   │   │       ├── service
│   │   │       ├── entity
│   │   │       └── repository
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   └── templates
│   │   │       ├── index.html
│   │   │       
│   └── test
├── pom.xml
└── README.md
```

## Contributing
1. Fork the repository.
2. Create a new branch: `git checkout -b feature-name`.
3. Commit your changes: `git commit -m 'Add some feature'`.
4. Push to the branch: `git push origin feature-name`.
5. Submit a pull request.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

---

Feel free to contribute, report issues, or suggest enhancements to improve the functionality of this application.
![image](https://github.com/user-attachments/assets/364b5979-15b1-453f-a2a8-7bdf40aee125)
![image](https://github.com/user-attachments/assets/40898fea-1394-4ec4-beb9-bffd07ba52de)
![image](https://github.com/user-attachments/assets/f0dad7e5-3c24-42e2-8719-e1d48fac08c2)
![image](https://github.com/user-attachments/assets/11859414-6f39-4e73-9bbd-c29a21dda6f8)




