# Instruments and instructions

Code written on Java 8. For building and testing project used Apache Maven 3.3.9.
All java files in ```golang``` directory generated by ANTLR (http://www.antlr.org/)

github repository https://github.com/ilshatus/cc_assignment3

### Maven dependencies
- ```junit``` for unit tests
- ```org.antlr.antlr4-runtime``` for working with ANTLR parser and lexer
- ```com.google.code.gson``` for json serialization
### Maven plugins
- ```maven-compiler-plugin``` for compilation
- ```org.codehaus.mojo.exec-maven-plugin``` for execution
- ```maven-surefire-plugin``` for testing
### Instruction
- install maven
- unzip archive with project
- go to directory where you unzipped project using terminal
- ```mvn clean compile exec:java``` run this command to build and execute (input will be read from input.txt, result will be printed in output.txt)
- ```mvn test``` run this command to run all tests (result of testing will be shown on console)
- All test cases in directory ```tests/```
### Instruction (using Intellij Idea) 
- open ```pom.xml``` in new project from existing source in Intellij Idea
- run ```src/main/java/Main``` to build and run
- run ```src/test/java/Tests``` to run test
