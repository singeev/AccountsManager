README

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

Other option to run this application - is to import these source code files to IDE
and run it with embedded (or working via plugin) Tomcat server.