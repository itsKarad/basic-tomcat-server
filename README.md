# README
## Purpose
This basic tomcat server uses MySQL server as a database. The main use of this project is to create an image which can be used by a Kubernetes cluster to connect to a MySQL service.



## Dockerhub Image
https://hub.docker.com/repository/docker/akarad158/kubernetes-spring-mysql/general
## Local setup
Run K8sApplication.java with program arguments: `-Dspring.profiles.active=local`

Building image from docker file:
Run inside top-level directory:
`docker build .`

Then run
`docker run -p 8081:8081 <IMAGE_ID>`.