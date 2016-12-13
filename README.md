# What is it?

# How do I set up?
## Software Requirements
 - Git Bash: https://git-scm.com/
 - Eclipse Java EE IDE for Web Developers
 - Apache Tomcat: http://apache.spinellicreations.com/tomcat/tomcat-8/v8.0.39/bin/apache-tomcat-8.0.39.zip
 
## Environment Setup
 - Clone the repository using `git clone https://github.com/meelivyas11/AdvanceJavaFlavors.git` from Git Bash
 - Open the repository 'AdvanceJavaFlavors' from eclipse IDE
 
### Maven
 - Import 'Maven-Plugin' and 'Maven-Web' Project (`File->Import->General->Existing Project into Workspace`) from eclipse IDE
 - Resolve the build path erros by re-adding the jars (serlet-api.jar) present in Jars folder of the repository
 - Create a new `Apache Tomcat v8.0` server
 - Build the maven project and start the Server (See Below Steps)
  
### Spring & Maven

### Hibernate & Maven

### AngularJS & Maven

### JUnit & Maven

## Build Maven Project and Start the Server
- Creating a new Apache Tomcat v8.0 server
- Clean and Build the Maven Project 
  * Right click project -> Run As -> Maven clean
  * Right click project -> Run As -> Maven install
  * If Build Fails
    1. Right click project -> Maven -> Update Project
    2. Check “Force update of Snapshots/Releases” checkbox
    3. Click ok
    4. Right click project -> Run As -> Maven install
- Start the Server    
#
How do I use it?
### Maven
 - Open `http://localhost:8080/SearchApp/` from your web browser
 - Enter the name of the any actor, actress or movie and Search
 - Once you get some search results, you can click the link in the result to redirect to the wiki pages associated to the result
 
