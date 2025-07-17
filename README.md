# ECommerceAutomation

A Selenium WebDriver project for automating tests on an e-commerce website using Java, TestNG, and the Page Object Model (POM).

## Features
- Automates login functionality
- Automates product search
- Uses Page Object Model for maintainability
- Generates TestNG reports

## Prerequisites
- Java JDK 17 or later
- Maven
- Chrome browser
- Git

## Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/AnuragPandit01/ECommerceAutomation.git
Navigate to the project directory:
cd ECommerceAutomation
Install dependencies:
mvn clean install
Run tests:
mvn test
Project Structure
src/main/java/com/example/pages: Page Object classes
src/test/java/com/example/tests: TestNG test classes
src/test/resources/testng.xml: TestNG configuration
Test Cases
LoginTest: Verifies successful login
ProductSearchTest: Tests product search functionality
Reports
TestNG generates reports in the test-output directory after running tests.
Contributing
Feel free to fork and submit pull requests!
License
MIT License

.gitignore: Create a .gitignore file to exclude unnecessary files.
target/
*.iml
.idea/
test-output/
4. Initialize Git and Push to GitHub
Initialize Git: In the project root, run:
git init
git add .
git commit -m "Initial commit: Selenium automation project setup"
Create a GitHub Repository:
Go to GitHub and create a new repository named ECommerceAutomation.
Follow the instructions to push your local repository:
git remote add origin https://github.com/yourusername/ECommerceAutomation.git
git branch -M main
git push -u origin main
5. Run the Tests
Run the tests using Maven:
mvn test
Check the test-output directory for TestNG reports.
6. Enhance Your GitHub Profile
Add a Description: On GitHub, edit the repository description to highlight that this is a Selenium automation project using Java and TestNG.
Pin the Repository: Pin the repository to your GitHub profile to make it visible to visitors.
Add Topics/Tags: Add tags like selenium, java, testng, automation, and testing to improve discoverability.
Notes
Test Data: The login test uses dummy credentials (testuser@example.com, password123). For a real test, create an account on http://automationpractice.com/ or use another test site. Update the credentials in LoginTest.java.
Extend the Project: To make it more impressive, consider adding:
More test cases (e.g., checkout process, negative login scenarios)
Logging with Log4j
ExtentReports for better reporting
CI/CD integration with GitHub Actions
Browser Compatibility: This project uses ChromeDriver. You can extend it to support Firefox or Edge using WebDriverManager.
