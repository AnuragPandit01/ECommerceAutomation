Name: ECommerceAutomation
Purpose: Automate testing of an e-commerce website (we'll use http://automationpractice.com/ as a sample site).
Features:
Login functionality test
Product search and add-to-cart test
Page Object Model (POM) for maintainability
TestNG for test management
Basic reporting with TestNG reports
Tools: Java, Selenium WebDriver, TestNG, Maven, ChromeDriver
Prerequisites
Java JDK 17 or later
Maven installed
IDE (IntelliJ IDEA or Eclipse recommended)
Git installed
Chrome browser and ChromeDriver compatible with your browser version
Steps to Create the Project
1. Set Up the Project Structure
Create a Maven Project:
Open your IDE and create a new Maven project named ECommerceAutomation.
Set the group ID to com.example and artifact ID to ecommerce-automation.
Configure pom.xml: Add dependencies for Selenium, TestNG, and WebDriverManager (to manage browser drivers automatically). Replace the content of pom.xml with the following:
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>ecommerce-automation</artifactId>
    <version>1.0-SNAPSHOT</version>
    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>
    <dependencies>
        <!-- Selenium WebDriver -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.17.0</version>
        </dependency>
        <!-- TestNG -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.10.2</version>
            <scope>test</scope>
        </dependency>
        <!-- WebDriverManager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.9.2</version>
        </dependency>
    </dependencies>
</project>
Project Structure: Create the following directory structure in src/main/java and src/test/java:
ECommerceAutomation/
├── src
│   ├── main
│   │   └── java
│   │       └── com.example.pages
│   │           ├── HomePage.java
│   │           ├── LoginPage.java
│   │           └── CartPage.java
│   ├── test
│   │   └── java
│   │       └── com.example.tests
│   │           ├── LoginTest.java
│   │           ├── ProductSearchTest.java
│   │           └── BaseTest.java
│   └── resources
│       └── testng.xml
├── pom.xml
├── README.md
└── .gitignore
