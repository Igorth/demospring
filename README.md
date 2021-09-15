## API Student

I am creating an example of an API (microservice) for studying both programming and automated testing.

The goal is to study how to create an API with Postman and Java.

The course is from **amigoscode** it is available [here](https://amigoscode.com/p/spring-boot).
### Requirements

Install [INTELIJ](https://www.jetbrains.com/idea/)

Download and install the latest JDK [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

### Run

Clone or download the project.

Navigate to the demoSpring folder and open the DemoSpringApplication class.

A green button (a play) should appear next to it on line 9, just press it.

The program will start the application, and a server will be running and accessible at the address:

        http://localhost:8080

### API

Endpoints:

    /api/v1/student --> GET student
    /api/v1/student --> POST student
    /api/v1/student/{studentId} --> DELETE student by ID 
    /api/v1/student/{studentId} --> PUT student

To register a student, go to POSTMAN and create a POST method.
The body of the POST method is a JSON and must contain:

            {
                "name": "Doe",
                "email": "doe@gmail.com",
                "dateOfBirth": "2000-10-12"
            }




[Site]( https://igordiasth.dev)

[Instagram](https://www.instagram.com/uaiboraviajar)
