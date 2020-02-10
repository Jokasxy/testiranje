# Yahoo Finance testing framework
##Overview
Repository contains 5 crossplatform Selenium webdriver UI tests.
Tests run in Chrome and Edge. Testing engine is TestNG.
WebDriverManager is external driver manager which downloads latest versions of 
browser drivers. Waits are implemented explicitly in test classes, 
while WebElements are fetched from page classes with full POM utilization.
##Environment setup
1. Install Java [JDK](https://java.com/en/download/win10.jsp) 
or [JRE](https://java.com/en/download/manual.jsp).
2. Install [IntelliJ](https://www.jetbrains.com/idea/download) 
or other preferred IDE.
3. Pull repository.
4. Open project as maven project.
5. Allow auto-import in your IDE.
##Running tests
Run testng.xml with TestNg.
##Test description
###Market summary
Testing market summary carousel. By clicking on the "S&P 500" carousel card,
S&P 500 quote should open.
###Search
Testing main Yahoo search bar. By typing "amd" in the search bar and submitting
request, AMD stock quote should open.
###Login fail
Testing login with unregistered email. By clicking "Sign in", login form should open.
Typing in wrong email address and submitting it, the system should return message
"Sorry, we don't recognize this email.".
###Stock gainers
Testing Stocks: Gainers option from Customize dropdown button in
My Portfolio & Markets section. By clicking "Customize" button, dropdown should open.
By clicking "Stocks: Gainers" option, Gainers page should open.
###Getting started
Testing Getting Started section of Help. By clicking "Help" button in footer 
Help page should open. By clicking "Getting started with Yahoo Finance",
Getting started page should open.
##Known issues
- Cookies in Edge must be cleared for Yahoo Finance before running the tests.
- Sign in button does not always show up in header on Edge.