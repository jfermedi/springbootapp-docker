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

## Installation and setup
1 . Docker desktop:
  Go to official docker page (https://docs.docker.com/get-started/get-docker/) and install Docker Desktop according to your system (Windows, Mac or Linux).
  Once the installation it's done , you can open the **cmd** in your system and type the following command to check the version installed : 
  `` docker --version `` .<br>
2 . Pull and Push Docker image: 
 In order to be able to pull the image of this application, we need to use **docker commands** directly in the **cmd**. There're a lot of docker commands that can be used, but in this guide we'll focus only on the **docker pull** and **docker push** commands. 
 The first command we need to use is the **docker pull** to pull the image of the application to our local environmet. The proccess of pulling a docker image is simple, but the syntax need to be followed correctly.  
 2.1 Open the docker desktop: First, ensure you've the docker desktop up and running in order to be able to execute the docker commands directly on your local environment. Apart from that, the docker desktop provides a UI more friendly to check the containers and images running.<br>
 2.2 Open the **cmd** in your desired location and, use the following command to check the docker images running in your environment : `` docker images `` <br>
 2.3 To pull a docker image you need to access the **dockerhub** and search for the repository and image inside of it that you want to pull. For this application you can enter the following docker command to pull the image : `` docker pull jfermedi2105/demo-applications:v1``<br>
 2.4 After pulling successfully the docker image, you can type the `` docker images `` command to check the new image that had been pulled.<br>
 
