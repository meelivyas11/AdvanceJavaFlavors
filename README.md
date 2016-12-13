# What is it?

# How do I set up?
## Software Requirements
 - Git Bash: https://git-scm.com/
 - Eclipse Java EE IDE for Web Developers
 - Apache Tomcat: http://apache.spinellicreations.com/tomcat/tomcat-8/v8.0.39/bin/apache-tomcat-8.0.39.zip
 
## Environment Setup
### Maven
 - Clone the repository using `git clone https://github.com/meelivyas11/AdvanceJavaFlavors.git` from Git Bash
 - Open the repository 'AdvanceJavaFlavors' from eclipse IDE
 - Import 'Maven-Plugin' and 'Maven-Web' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
 - Resolve the build path erros by re-adding the jars (serlet-api.jar) present in Jars folder of the repository
 - Build the maven project and start the Server (See Below Steps)
  
### Spring & Maven

### Hibernate & Maven

### AngularJS & Maven

### JUnit & Maven

## Build Maven Project, Create a Maven Build and Run it 
- Creating a new Apache Tomcat v8.0 server
- Clean and Build the Maven Project 
  * Right click project -> Run As -> Maven clean
  * Right click project -> Run As -> Maven install
  * If Build Fails
    1. Right click project -> Maven -> Update Project
    2. Check “Force update of Snapshots/Releases” checkbox
    3. Click ok
    4. Right click project -> Run As -> Maven install
- Create a maven build using `tomcat:run -X` goal

# How do I use it?
### Maven
 - Open `http://localhost:8080/Maven-Web/` from your web browser
 - Enter the First name, Last name, email address and phone numer and click Submit.
 
### Spring & Maven
 - Open http://localhost:8080/Spring-Maven-WebAPI/MyController/GetMyName results of simple spring application
 - Open http://localhost:8080/Spring-Maven-WebAPI/MyController/SendMyName to see data returned by the controller to jsp in spring
 - Open http://localhost:8080/Spring-Maven-WebAPI/MyController/GetMyDetails to see the JSON results returned by a webAPI

### Hibernate & Maven

### AngularJS & Maven

### JUnit & Maven
 
