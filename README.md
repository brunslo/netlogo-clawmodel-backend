# Netlogo CLAW Model Backend
## Overview
This project provides a RESTful backend to make the [CLAW Netlogo model](https://github.com/JTHooker/CLAW-Model) interactive via a web interface.

## Usage
The project can be built directly using the Java 1.8 SDK and Maven to package into an executable JAR:
```
mvn clean package
``` 
It can also be built and packaged into a Docker container directly, without any Java/Maven specific dependencies:
```docker
docker build -t netlogo-clawmodel-backend-<version>
```