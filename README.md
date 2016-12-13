# What is it?
This Repository consist of simple code sample in Maven, Spring, Hibernate, AngularJS, JUnit Frameworks. Detailed steps to create these projects from scratch can be found from [here] (https://meelivyas.blogspot.com/2016/06/advance-java-learnings.html)

- 'Maven-Plugin' and 'Maven-Web' together build a simple **Maven** project which takes user's first name, last name, email address and phone number and displays the same on click of a button
- 'Spring-Maven-WebAPI' project shows simple implementation of **Spring.** It contains code to transfer data from controller to JSP using spring framework. This project also contains code to create a simple RESTful WEB API which return JSON results.
- 'Maven-Oracle-Hibernate' code shows how to query oracle database using **JDBC** and **Hibernate** with Maven

# How to Set up?
## Software Requirements 
 - Git Bash: <https://git-scm.com/>
 - Eclipse Java EE IDE for Web Developers
 - Apache Tomcat: <http://apache.spinellicreations.com/tomcat/tomcat-8/v8.0.39/bin/apache-tomcat-8.0.39.zip>

## Environment Setup
### Maven
 - Clone the repository using `git clone https://github.com/meelivyas11/AdvanceJavaFlavors.git` from Git Bash
 - Open the repository 'AdvanceJavaFlavors' from eclipse IDE
 - Import 'Maven-Plugin' and 'Maven-Web' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
 - Resolve the build path erros by re-adding the jars (serlet-api.jar) present in Jars folder of the repository

### Spring with Maven
 - Clone the repository using `git clone https://github.com/meelivyas11/AdvanceJavaFlavors.git` from Git Bash
 - Open the repository 'AdvanceJavaFlavors' from eclipse IDE
 - Import 'Spring-Maven-WebAPI' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
 - Resolve the build path erros by re-adding the jars (serlet-api.jar) present in Jars folder of the repository
  
### Hibernate with Maven
 - Clone the repository using `git clone https://github.com/meelivyas11/AdvanceJavaFlavors.git` from Git Bash
 - Open the repository 'AdvanceJavaFlavors' from eclipse IDE
 - Import 'Maven-Oracle-Hibernate' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
 - Create a DB connection with username and password `DBUSER` using `DBUSER_ORCL_CREATION.sql` script inside 'AdvanceJavaFlavors' repository
 - Make sure the db PORT Number, Username, Password are correct in hibernate.cfg.xml (\Maven-Oracle-Hibernate\src\main\resources\Hibernate) for the Hibernate configuration and DBUtilts.java (Maven-Oracle-Hibernate\src\main\java\com\collaborative\dataProvider) for JDBC configuration.

### AngularJS 

### JUnit 

# How to Clean, Build and Run Maven Project?
- Clean and Build the Maven Project 
   * Right click project -> Run As -> Maven clean
   * Right click project -> Run As -> Maven install
   * If Build Fails
     1. Right click project -> Maven -> Update Project
     2. Check “Force update of Snapshots/Releases” checkbox
     3. Click ok
     4. Right click project -> Run As -> Maven install
 - Create a maven build using `tomcat:run -X` goal and Run it
 
# How Do I use it?
## Maven
 - Open <http://localhost:8080/Maven-Web/> from your web browser
 - Enter the First name, Last name, email address and phone numer and click Submit.
 
## Hibernate with Maven
 - Open <http://localhost:8080/Spring-Maven-WebAPI/MyController/GetMyName> to see the results of simple spring application
 - Open <http://localhost:8080/Spring-Maven-WebAPI/MyController/SendMyName> to see how data can be transferred from controller to jsp using spring
 - Open <http://localhost:8080/Spring-Maven-WebAPI/MyController/GetMyDetails> to see the JSON results retrived from WebAPI
 
## Results
 - Run `App.Java` to see the records inserted in DB
