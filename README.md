README

This project is the test task for the Java Developer position in OSTDLabs.
This is a simple bank accounts manager providing basic CRUD operations.
It consists of GUI (JSP's), back-end and several unit tests.
Back-end provides data storage in a HashMap collection, some business logic
for CRUD operations and controllers to interact with front-end.

Used libraries and technologies:
- Maven
- Spring
- Spring MVC
- JQuery
- Bootstrap
- Log4j
- JUnit
- Mockito
- Tomcat 7
- JSP + JSTL
- Jackson

INSTALL AND RUN

To install this application you need to run "mvn clean install" command in a root folder.
As a result, in a /target folder, you'll get a "mybank-0.1.war" file ready to deploy to server.
After deploy, you need to go to /accounts page in your browser to get to the start page.
Probably you'll need to rename *.war file to "ROOT.war" to avoid appearance of project name
in an URI.

Other option to run this application - is to import these source code files to IDE
and run it with embedded (or working via plugin) Tomcat server.

BUGS AND COMMENTS

- I've not finished work on ControllerTest - it throws an exception i haven't fix yet.
- Class AccountDaoHsql - is just an empty interface implementation without any
particular logic, i haven't done it as well as Hsql DB implementation.
- For the beginning i've made all CRUD operations via regular Spring controllers
and started to work on REST controllers after that. For now application has
only one request handling with the REST controller.