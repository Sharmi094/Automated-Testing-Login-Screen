# Automated Testing of Login Screen
## Login Functionality Tests
Overview
This repository contains test scripts for verifying login functionality.
The tests cover two scenarios:
1. Login Successful: Verifies a successful login using valid credentials.
2. Login Unsuccessful : Verifies an unsuccessful login when incorrect credentials are provided.
Test Execution Steps
### Prerequisites
1. Java 21 or higher
2. Maven 4.24.0 or higher
3. ChromeDriver (matching your Chrome browser version)
#### Setup
1. Clone the repository: git clone https://github.com/Sharmi094/Automated-Testing-Login-Screen.git
3. Navigate to the project directory: cd login-functionality-tests
4. Install dependencies: mvn clean install
Run all tests: mvn test
Run a specific test: mvn test -Dtest=SuccessfulLoginTest or mvn test -Dtest=UnsuccessfulLoginTest
Test 1:  LoginSuccessful
Test Script: LoginSuccessful.java
##### Test Data:
Valid username: validUsername
Valid password: validPassword
Expected Result: User is redirected to the landing page
Test 2: Unsuccessful Login
Test Script: LoginUnsuccessful.java
Test Data:
Invalid username: validUsername
Invalid password: invalidPassword
Expected Result: Error message is displayed: "Invalid email or password"
###### Assumptions
1. The login page has input fields with names "username" and "password".
2. The login button has an XPath equal to "//button[@type='submit']".
3. The dashboard page has a URL equal to "https://app.germanyiscalling.com/common/login/".
4. The login page displays an error message with the text "Invalid username or password" when incorrect credentials are provided.
