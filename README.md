# WorkWise

## Overview
This repository contains an automated testing framework for an e-commerce website using Selenium, Cucumber, and TestNG. This document outlines the testing strategies and scope for the Tec Technico. Testing ensures proper functionality, UI/UX, compatibility, and performance for key features such as registration, login, Dashboard,Todo,All notes, profile.

## Project Structure
```
mrrajak1296-Workwise/
│-- Bug Report (3).xlsx          # Report on identified bugs
│-- pom.xml                      # Maven dependencies and configurations
│-- Test Cases (6).xlsx          # Test case documentation
│-- TEST_PLAN (7).docx           # Detailed test plan document
│-- The Summary Report (6).docx  # Summary report of test executions
│
├── src/
│   └── test/
│       ├── java/
│       │   ├── Steps/            # Step definitions for Cucumber feature files
│       │   │   ├── loginSteps.java
│       │   │   └── registerSteps.java
│       │   └── TestRunner/       # Test runner for executing Cucumber tests
│       │       └── runnertest.java
│       └── resources/
│           └── Features/         # Cucumber feature files
│               ├── declogin.feature
│               └── register.feature
│
└── test-output/
    ├── emailable-report.html     # TestNG report for email sharing
    ├── index.html                # Main test report
    ├── testng-results.xml        # TestNG results
    ├── Default suite/            # Default test suite reports
    └── junitreports/             # JUnit-compatible test reports
```

## Setup and Installation
1. **Install dependencies:**
   Ensure you have Maven installed and run:
   ```sh
   mvn clean install
   ```
2. **Run Tests:**
   ```sh
   mvn test
   ```
## Project Explanation
Video Link : - https://drive.google.com/file/d/1X9xm-c7geSo9fBRCstUpv9M-Gy34Dic2/view?usp=drive_link

## Technologies Used
- **Java** - Programming language for test automation
- **Selenium WebDriver** - Browser automation tool
- **Cucumber** - BDD framework for test scenarios
- **TestNG** - Testing framework for execution and reporting
- **Maven** - Dependency and project management

## Test Execution Reports
- After running the tests, reports are generated in the `test-output/` folder.
- Open `test-output/index.html` in a browser to view detailed reports.

  
