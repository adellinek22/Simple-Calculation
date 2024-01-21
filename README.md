# Simple Calculation Application

Implement a program that calculates the function A(a, b, c, d) = (a + b) / (c + d), where a, b, c, d are real numbers. Input the numbers through the console. The program should be implemented so that it is robust to different types of input data. Consider how you would test such a program and describe 10-15 test cases. Recommended technology for implementation: Java programming language and testNG framework for test organization.

## Requirements
- Java v20
- Apache Maven v3.9.2
- TestNgx v7.9.0

## How to run the application
-  Clone this repository

    ```bash
    git clone https://github.com/adellinek22/Simple-Calculation.git
    cd Simple-Calculation
    ```
- Run the application
  ```bash
  mvn package
  java -jar .\target\simple-calculation-1.0-SNAPSHOT.jar
  ```
- Run the test cases
  ```bash
  mvn test
  ```
