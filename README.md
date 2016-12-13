# What is it?
This Repository consist of simple code sample in Maven, Spring, Hibernate, AngularJS, JUnit Frameworks

# Software Requirements 
 - Git Bash: <https://git-scm.com/>
 - Eclipse Java EE IDE for Web Developers
 - Apache Tomcat: <http://apache.spinellicreations.com/tomcat/tomcat-8/v8.0.39/bin/apache-tomcat-8.0.39.zip>

# Maven
'Maven-Plugin' and 'Maven-Web' together build a simple <b>Maven<b> project which takes user's first name, last name, email address and phone number and displays the same on click of a button

## Environment Setup
 - Clone the repository using `git clone https://github.com/meelivyas11/AdvanceJavaFlavors.git` from Git Bash
 - Open the repository 'AdvanceJavaFlavors' from eclipse IDE
 - Import 'Maven-Plugin' and 'Maven-Web' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
 - Resolve the build path erros by re-adding the jars (serlet-api.jar) present in Jars folder of the repository
 - Clean and Build the Maven Project 
   * Right click project -> Run As -> Maven clean
   * Right click project -> Run As -> Maven install
   * If Build Fails
     1. Right click project -> Maven -> Update Project
     2. Check “Force update of Snapshots/Releases” checkbox
     3. Click ok
     4. Right click project -> Run As -> Maven install
 - Create a maven build using `tomcat:run -X` goal and Run it
 
## Results
 - Open <http://localhost:8080/Maven-Web/> from your web browser
 - Enter the First name, Last name, email address and phone numer and click Submit.

# Spring
'Spring-Maven-WebAPI' project shows simple implementation of <b>Spring.<b> It contains code to transfer data from controller to JSP using spring framework. This project also contains code to create a simple RESTful WEB API which return JSON results.

## Environment Setup
 - Clone the repository using `git clone https://github.com/meelivyas11/AdvanceJavaFlavors.git` from Git Bash
 - Open the repository 'AdvanceJavaFlavors' from eclipse IDE
 - Import 'Spring-Maven-WebAPI' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
 - Resolve the build path erros by re-adding the jars (serlet-api.jar) present in Jars folder of the repository
 - Clean and Build the Maven Project 
   * Right click project -> Run As -> Maven clean
   * Right click project -> Run As -> Maven install
   * If Build Fails
     1. Right click project -> Maven -> Update Project
     2. Check “Force update of Snapshots/Releases” checkbox
     3. Click ok
     4. Right click project -> Run As -> Maven install
 - Create a maven build using `tomcat:run -X` goal and Run it
 
## Results
 - Open <http://localhost:8080/Spring-Maven-WebAPI/MyController/GetMyName> to see the results of simple spring application
 - Open <http://localhost:8080/Spring-Maven-WebAPI/MyController/SendMyName> to see how data can be transferred from controller to jsp using spring
 - Open <http://localhost:8080/Spring-Maven-WebAPI/MyController/GetMyDetails> to see the JSON results retrived from WebAPI

  
# Hibernate 

# AngularJS 

# JUnit 

