# RUN JAVA IMAGE 

> This Dockyjava is a application that runs the <b> Hello World program of java </b> in container.
  - You no need to install any JDK or JRE packs to run the program. 
  - Follow the steps give below have a <b> Demo </b> on it. 
  
### Prerequisites:
    
    Only one-Install Docker on your Machine.
    
  ## STEPS :
  
> Using command prompt (or) Terminal :
 
 Login with your Docker ID to push and pull images from Docker Hub. 
 
 - If you don't have a Docker ID, head over to 'create Account' [https://hub.docker.com]

  ```
cb@123:~$ sudo docker login
Username: <Docker User name> 
Password: <PassWord>
Login Succeeded ```

>Pull the Image from the Docker hub.

```
cb@123:~$ sudo docker pull sripadaraj77/dockyjava
```

>Check your Images 


``` cb@123:~$ sudo docker images

REPOSITORY                  TAG                 IMAGE ID            CREATED             SIZE

sri                         latest              8e6d4f58b0be        3 hours ago         594 MB

sripadaraj77/dockyjava      latest              8e6d4f58b0be        3 hours ago         594 MB

<none>                      <none>              6f34ea4ca072        3 hours ago         584 MB

<none>                      <none>              c8b01dbe41b8        3 hours ago         584 MB

<none>                      <none>              b0707a51c7e0        3 hours ago         584 MB

<none>                      <none>              643177734773        3 hours ago         584 MB

<none>                      <none>              617343bf519f        3 hours ago         584 MB

<none>                      <none>              212b0eb0485e        3 hours ago         584 MB

<none>                      <none>              790964eccc4e        3 hours ago         584 MB

<none>                      <none>              f18fa3b303c6        3 hours ago         584 MB

<none>                      <none>              0941b7a37f44        3 hours ago         584 MB

<none>                      <none>              8a98dd303ab9        3 hours ago         584 MB

<none>                      <none>              42863ddbac58        3 hours ago         584 MB

<none>                      <none>              207b7ef5dcca        3 hours ago         584 MB


```

>You will be getting the Image that have been pulled into your machine from the Docker-hub 

<b> Now you are able to see the list of images and the image "sripadaraj77/dockyjava" </b>

>Now run the image 

```
cb@123:~$ sudo docker run sripadaraj77/dockyjava
Hello OPENEBS!!!!
```
<b> You have sucessfully able to Run the docker image of java with out any pre-installations of java on your host </b>

```Future things will be updated soon```

