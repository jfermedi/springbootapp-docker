# Springbootapp-docker
This is a simple springboot application with usage of docker. There's only a GET endpoint to return a simple message, the main goal of this project is to "dockeraise" the application and to be able to pull the image of this application and run it , without needing to clone the project and run it on a local IDE.

## Features
- Creation of REST API with a GET endpoint to return a message when executed
- Usage of docker to create a image of the application
- Make the image available at the DockerHub repository

## Technologies used
- **Java 17** : Programming language
- **Springboot** : Back-end framework
- **Docker** : For creating container of the application

## Pre-requisites
- Docker desktop (for creating the image of the application and being able to pull or push images on DockerHub)
- Java 17 or later (optional, needed only for cloning the project into your local environment)
- Maven (for dependency management, optional needed only for cloning the project into your local environment)
- Postman (optional, for testing the API endpoint using a collection)
- Git (for cloning the project files and resources, optional)
