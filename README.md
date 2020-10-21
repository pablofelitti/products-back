# Products Backend

This project offers a simple CRUD backend API for products 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

No prerequisites to test locally

To test deployments have Minikube, Docker and HELM installed

### Running in local environment

```./gradlew bootRun```

To check if the app is running try

```curl localhost:8080```

## Deployment

This involves creating a Docker image and deploying it to a local Minikube Kubernetes instance using HELM

### Creating Docker image

```docker build .```

### Pushing image to Docker Hub

```docker tag <image_id> pablofelitti/products-back:<next_version>```

```docker push pablofelitti/products-back:<next_version>```

### Deploying to Kubernetes via HELM

Run this command in the root of the project

```helm install products-back products-back-chart/```

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
* [Gradle](https://gradle.org/) - Dependency Management
* [H2](https://www.h2database.com/html/main.html) - In memory database
* [Docker](https://www.docker.com/) - Containers to deploy the app
* [Kubernetes](https://kubernetes.io/) - Platform to host containers
* [HELM](https://helm.sh/) - Package manager for Kubernetes
