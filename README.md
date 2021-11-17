# ColorLovers
This is a simple project for Api testing using REST Assured with Java and Cucumber BDD
## Tech
* Java
* REST Assured 
* Cucumber 
* TestNG
* Maven

## About this project

* Provides Api testing solution using REST Assured with Java and Cucumber BDD. 
* Provides support for Data-Driven.
* Provides running tests from Maven.
* Provides human readable reporting.
* Provides JavaDocs.

## Running Tests
* Running All Tests :
  > mvn test
* Running regression.xml file from regression-tests profile in pom.xml
  > mvn test -Pregression-tests
* Running CucumberIntegrationTest class 
  > mvn test -Dtest=CucumberIntegrationTest
## Reporting 
   Path of the report : target/cucumber-reports/PatternsReport.html
