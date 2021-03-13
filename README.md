# QUARKUS - DOCKER DEMO

## Description
This application consists of a REST API with the following endpoints:

1. /api/hello
2. /api/convertStr

More information on quarkus can be found here: https://quarkus.io/guides/getting-started

### /api/hello
A sample endpoint to display the string "Hello World!". 

Request Type: Get

Response: "Hello World!" as string.

### /api/convertStr
Converts a given string in the following format:
- Splits the string by space characters.
- Replaces all non-alpha numeric characters to "_" character.
- Converts the string to upper case.

The result of the conversion is logged as an information message in the application. A warning will be displayed in the application logs if the
  inputStr is given as empty string or the request json is invalid.
  
Request Type: POST
Request Body:
```
   {
      "inputStr": "sample stri2ngs separated2 with spaces."
   }
```
Response: Success! Please see application logs.
Application Log: INFO: SAMPLE STRI2NGS SEPARATED2 WITH SPACES_

## Installation & Setup

Be sure to have maven and Java (JDK 11) installed.

### Run with Maven

Run the following command to run the application while enabling hot-reloading:
```
./mvnw quarkus:dev
```
The application will start in http://localhost:8080 by default.

### Run with Docker

Make sure to have docker desktop installed and running before proceeding with the next steps.

Run the following command to generate the jar file of the application.
```
./mvnw package
```

Build the docker image tagged as `quarkus/demo` and run the container with the commands:

```
docker build -f src/main/docker/Dockerfile.jvm -t quarkus/demo .

docker run -i --rm -p 8080:8080 quarkus/demo

```

The application will start in http://localhost:8080 by default.





