# What is it?
This Repository consist of simple code sample in Maven, Spring, Hibernate, AngularJS, JUnit Frameworks. 

- 'Maven-Plugin' and 'Maven-Web' together build a simple **Maven** project which takes user's first name, last name, email address and phone number and displays the same on click of a button
- 'Spring-Maven-WebAPI' project shows simple implementation of **Spring.** It contains code to transfer data from controller to JSP using spring framework. This project also contains code to create a simple RESTful WEB API which return JSON results.
- 'Maven-Oracle-Hibernate' code shows how to query oracle database using **JDBC** and **Hibernate** with Maven
- 'AngularJS-Maven' code helps in including **Bootstrap** and **AngularJS** JARS in the Maven project and run a sample code for AngularJS
- 'JUnit_With_Maven' creates a basic project structure to write JUnit test and writes a smaple JUnit Test

<b> Detailed steps to create these projects from scratch can be found from [here] (https://meelivyas.blogspot.com/2016/06/advance-java-learnings.html) </b>

# How to Set up?
## Software Requirements 
 - Git Bash: <https://git-scm.com/>
 - Eclipse Java EE IDE for Web Developers
 - Apache Tomcat: <http://apache.spinellicreations.com/tomcat/tomcat-8/v8.0.39/bin/apache-tomcat-8.0.39.zip>
 - Docker: <https://www.docker.com/products/overview> (Use the steps provided in `Get Started Tutorial` to install as Virtualization must be enabled for certain platforms)
 - Docker Toolbox: <https://www.docker.com/products/docker-toolbox>
 - SQL Developer: <http://www.oracle.com/technetwork/developer-tools/sql-developer/downloads/index.html>

## Environment Setup
 - Clone the repository using `git clone https://github.com/meelivyas11/AdvanceJavaFlavors.git` from Git Bash
 - Open the repository 'AdvanceJavaFlavors' from eclipse IDE
### Maven
 - Import 'Maven-Plugin' and 'Maven-Web' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
 - Resolve the build path erros by re-adding the jars (serlet-api.jar) present in Jars folder of the repository
 - Clean, build and run the maven project by following the steps below

### Spring with Maven
 - Import 'Spring-Maven-WebAPI' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
 - Resolve the build path erros by re-adding the jars (serlet-api.jar) present in Jars folder of the repository
 - Clean, build and run the maven project by following the steps below
  
### Hibernate with Maven
 - Import 'Maven-Oracle-Hibernate' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
 - Create a DB connection with username and password `DBUSER` using `DBUSER_ORCL_CREATION.sql` script inside 'AdvanceJavaFlavors' repository
 - Make sure the db **port number, username, password** are correct in `hibernate.cfg.xml` (\Maven-Oracle-Hibernate\src\main\resources\Hibernate) for the Hibernate configuration and `DBUtilts.java` (Maven-Oracle-Hibernate\src\main\java\com\collaborative\dataProvider) for JDBC configuration.
 - Clean and buil maven project by following the steps below (Do not Run it)
 - Run `App.Java`as a Java Application to see the data inserted in the Login table

### AngularJS with Maven
- Import 'AngularJS-Maven' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
- Creating a new Apache Tomcat v8.0 server
- Clean, build and the maven project by following the steps below (Do not Run it)
- Start the Tomcat Server

### JUnit with Maven
- Import 'JUnit_With_Maven' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
- Clean, build and the maven project by following the steps below (Do not Run it)
- Navigate to `testAccountService.java` located under '/JUnit_With_Maven/src/test/java/com/collaborative/junit/' folder of the repository and run as a JUnit Test. 

# How to Clean, Build and Run Maven Project?
- Clean and Build the Maven Project 
   * Right click project -> Run As -> Maven clean
   * Right click project -> Run As -> Maven install
   * If Build Fails
     1. Right click project -> Maven -> Update Project
     2. Check “Force update of Snapshots/Releases” checkbox
     3. Click ok
     4. Right click project -> Run As -> Maven install
 - Create a maven build using `tomcat:run -X` goal and Run it. Update configuration name and base directory path specific to the project
   ![Maven Build Configuration](https://cloud.githubusercontent.com/assets/7827378/21186067/3c9ea5da-c1e1-11e6-9e07-a5707718fe17.png)
 
# How Do I use it?
## Maven
 - Open <http://localhost:8080/Maven-Web/> from your web browser
 - Enter the First name, Last name, email address and phone numer and click Submit.
 
## Hibernate with Maven
 - Open <http://localhost:8080/Spring-Maven-WebAPI/MyController/GetMyName> to see the results of simple spring application
 - Open <http://localhost:8080/Spring-Maven-WebAPI/MyController/SendMyName> to see how data can be transferred from controller to jsp using spring
 - Open <http://localhost:8080/Spring-Maven-WebAPI/MyController/GetMyDetails> to see the JSON results retrived from WebAPI
 
## Hibernate with Maven
 - Records inserted in DBUSER's LOGIN table

## AngularJS 
 - Open <http://localhost:8080/AngularJS-Maven/> to see the results.
 - See the `View Source` of this page to checkout which versions of bootstrap and angularJS are included without mentioning it directly in index.jsp file.
 
## JUnit with Maven
 - The test will get executed and you will see the results in `JUnit` view of eclipse
