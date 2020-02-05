# MttpSeleniumTest

## Selenium

Selenium is a free (open source) automated testing suite for web applications across different browsers and platforms.

### 	Selenium WebDriver 
  Selenium WebDriver is an API that allows us to write automated tests for web applications. The automated tests that use Selenium    WebDriver are run by using a web browser. In other words, Selenium WebDriver helps us to verify that our application is working as expected when it is used by a real user.

#### 	--Simple and concise
WebDriver is simple, it is designed as a concise and compact programming interface.

#### 	--Works in all major browsers
Through a simple setup, WebDriver can be used with all major browsers. Automate real user interactions in Firefox, Safari, Edge, Chrome, Internet Explorer and more! Selenium WebDriver refers to both the language bindings and the implementations of the individual browser controlling code. This is commonly referred to as just WebDriver.


## TestNG

TestNG is a testing framework inspired from JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use, such as:

- Annotations.
- Run your tests in arbitrarily big thread pools with various policies available (all methods in their own thread, one thread per test class, etc...).
- Test that your code is multithread safe.
- Flexible test configuration.
- Support for data-driven testing (with @DataProvider).
- Support for parameters.
- Powerful execution model (no more TestSuite).
- Supported by a variety of tools and plug-ins (Eclipse, IDEA, Maven, etc...).
- Embeds BeanShell for further flexibility.
- Default JDK functions for runtime and logging (no dependencies).
- Dependent methods for application server testing.

TestNG is designed to cover all categories of tests:  unit, functional, end-to-end, integration, etc...


## Page Object Model (POM)
Page Object Model is a design pattern to create Object Repository for web UI elements. Under this model, for each web page in the application, there should be corresponding page class. This Page class will find the WebElements of that web page and also contains Page methods which perform operations on those WebElements.

<img src="https://www.softwaretestingmaterial.com/wp-content/uploads/2017/10/Page-Object-Model-Framework.png" alt="POM"/>


## WebDriverManager [![][Logo]][GitHub Repository]
WebDriverManager allows to automate the management of the binary drivers (e.g. *chromedriver*, *geckodriver*, etc.) required by Selenium WebDriver.

[Logo]: http://bonigarcia.github.io/img/webdrivermanager.png
[GitHub Repository]: https://github.com/bonigarcia/webdrivermanager
