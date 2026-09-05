# Kobakha Project

## Overview
Kobakha is a Java application that serves as a template for building Java projects using Maven. This project includes a main application class and a corresponding test class.

## Project Structure
```
kobakha
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── kobakha
│   │               └── Main.java
│   └── test
│       └── java
│           └── com
│               └── kobakha
│                   └── MainTest.java
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Maven

### Building the Project
To build the project, navigate to the project directory and run the following command:
```
mvn clean install
```

### Running the Application
To run the application, use the following command:
```
mvn exec:java -Dexec.mainClass="com.kobakha.Main"
```

### Running Tests
To run the tests, execute the following command:
```
mvn test
```

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue for any suggestions or improvements.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.