---
title: Introduction to QA Automation
sub_title: (Quality Assurance)
theme:
  name: catppuccin-mocha
options:
  end_slide_shorthand: true
---

# I'm Srinesh Nisala

- Senior software engineer at Orli tech
- You can find me on these platforms
  - [github.com/s1n7ax](https://github.com/s1n7ax)
  - [linkedin.com/in/srinesh-nisala](https://www.linkedin.com/in/srinesh-nisala)
  - [s1n7ax.com](https://s1n7ax.com)

---

# Heads up

- This is my first time giving a lecture, so I hope you'll be patient with me!
- This includes my opinion + experience and some of the things might be different from the theory you have learnt
- Anything that has the potential to go wrong is likely to do so during a live demo

---

# Job Designations

> [!TIP]
> The most common job title in Sri Lanka is _"QA Engineer"_, but you might see _"Software Engineer in Test"_ job title by some foreign companies

> [!TIP]
> If a job vacancy is titled _"QA Engineer"_, it likely indicates they are seeking someone proficient in both manual and automated testing

> [!TIP]
> If the job vacancy specifies _"QA Automation Engineer"_, your primary focus will likely be on automation tasks

- **Manual QA Engineer** - _No programming knowledge needed_
- **QA Automation Engineer** - _Need basic programming knowledge_
- **Software Developer** - _Need good programming knowledge_

---

# Salaries of QAs & Senior QAs

> [!TIP]
> If you’ve got what it takes, why not start your own company and be an entrepreneur

> [!NOTE]
> Salary varies based on various different things
>
> - Your performance & skills
> - Experience
> - \* Designation \*
> - Based on the company
> - Company politics (You could see this in very few work places)

<!-- column_layout: [1, 1] -->

<!-- column: 0 -->

## QA Engineer Salary

![QA Engineer Salary](assets/qa-engineer-salary.png)

<!-- column: 1 -->

## Senior QA Engineer Salary

![Senior QA Engineer Salary](assets/sqa-engineer-salary.png)

<!-- reset_layout -->

---

# Final Tips

- Don't be afraid to ask an increment, change in responsibility etc...
- Make sure you’re not staying in one place for too long without growth

---

<!-- jump_to_middle -->
<!-- column_layout: [1, 1, 1] -->
<!-- column: 1 -->

# Questions?

---

# Test types

> [!TIP]
> Don't automate everything, but don't do everything manually either

> [!TIP]
> No company has enough budget to do all these tests

> [!NOTE]
> There may not be strict guidelines on who is responsible for which tests

- Unit Tests
- Integration Tests
- Functional Tests
- Regression Tests
- Smoke Tests
- Performance Tests
- Load Tests
- Security Tests
- Acceptance Tests
- End-to-End Tests
- UI Tests
- API Tests
- Visual Regression Tests

---

# Unit Tests (By Developer)

Purpose: Test individual components or functions of a program to ensure they work as expected.
Tools: JUnit, Vitest, pytest.

[source](https://github.com/microsoft/calculator/blob/09a39a500e5b3dd2778df58d8ddc61e652246a24/src/CalculatorUnitTests/DateCalculatorUnitTests.cpp?plain=1#L997-L1017)

![Unit test example from ms calculator](assets/unit-test-example-from-ms-calculator.png)

---

# Integration Tests (By Developer)

Purpose: Verify that different modules or services within an application work together as intended.
Tools: Postman, REST-assured

[source](https://github.com/neovim/neovim/blob/dde2cc65fd2ac89ad88b19df08dc03cf1da50316/test/functional/plugin/lsp/diagnostic_spec.lua?plain=1#L127-L154)

![Integration test example from Neovim](assets/integration-test-example-from-neovim.png)

---

# Functional Tests (By QA)

Purpose: Ensure the software behaves according to the specified requirements and that the user’s interactions perform correctly.
Example: Checking that a user can successfully log in using correct credentials.
Tools: Selenium, Cypress, Playwright.

---

# Regression Tests (By QA)

Purpose: Verify that new changes or features haven't broken existing functionality.
Example: Ensuring that a new feature doesn’t interfere with previous features like login, search, etc.
Tools: Selenium, TestComplete, QTP.

---

# Smoke Tests (By QA)

Purpose: Perform basic tests to determine if the critical functionalities of the software work after a build or release.

[source](https://github.com/microsoft/vscode/blob/6fb1f6fbdd167ca4599f6ad28323257c3704a777/test/smoke/src/areas/extensions/extensions.test.ts?plain=1#L15-L25)

![Smoke test example from VSCode](assets/smoke-test-example-from-vscode.png)

---

# Performance Tests (By QA Maybe)

Purpose: Evaluate the software’s performance & condition.

![Performance test from chrome lighthouse for google](assets/performance-test-from-chrome-lighthouse-for-google.png)

---

# Load Tests (By QA Maybe)

Purpose: Test how the application performs under normal and heavy load conditions.
Example: Assessing how many users a website can handle at once without crashing.
Tools: Apache JMeter, BlazeMeter, LoadRunner.

[source](https://github.com/antonputra/tutorials/blob/5098b4b9738a920a8a5708f7721faa843449855f/lessons/145/tests/go-app-1.js?plain=1#L4-L31)

![Load test from Anton Putra's Youtube](assets/load-test-example-from-Anton-Putra-youtube.png)

---

# Security Tests (By Security Testers & maybe by QA)

Purpose: Identify vulnerabilities in the software, ensuring data protection and preventing security breaches.

![Security test example with zap](assets/security-test-example-with-zap.png)

---

# Acceptance Tests (By Client)

Purpose: Validate whether the software meets the client’s requirements and is ready for production.

---

# End-to-End Tests (By QA)

Purpose: Test the entire application workflow from start to finish to ensure the system works as expected in a production-like environment.

[source](https://github.com/Chocobozzz/PeerTube/blob/0b145cfc9ac2eebd3ca922a7e38cf000e7e75348/client/e2e/src/suites-local/signup.e2e-spec.ts?plain=1#L322-L407)

![e2e test example from peertube](assets/e2e-test-example-from-peertube.png)

---

# UI Tests (By QA)

Purpose: Ensure the user interface works as intended, including button clicks, form inputs, and navigation.
Example: Verifying that a "Submit" button works after entering data in a form.
Tools: Selenium, Cypress, TestCafe.

---

# API Tests (By QA)

Purpose: Validate that APIs return the correct data and handle requests appropriately.
Example: Ensuring a weather API returns accurate weather data based on the requested parameters.
Tools: Postman, RestAssured, SoapUI.

[source](https://github.com/typicode/json-server/blob/6aa56d9581488d9bcd1baf42c4c97b293cd9ee99/src/app.test.ts?plain=1#L109-L128)

![API test example from json placeholder](assets/api-test-example-from-jsonplaceholder.png)

---

# Visual Regression Tests (By QA)

Purpose: Ensure the UI visually appears as intended after updates by comparing screenshots.

[source](https://github.com/rsmbl/Resemble.js/blob/581c1bb757e3fdd7f151c47ad8ca6eafcce5019a/nodejs-tests/compareImages.test.js?plain=1#L9-L23)

![visual regression test example from resemblejs](assets/visual-regression-test-example-from-resemblejs.png)

---

<!-- jump_to_middle -->
<!-- column_layout: [1, 1, 1] -->
<!-- column: 1 -->

# Questions?

---

# Why UI testing? (Manual / Automated)

- Validate User Experience
- Cross-Browser and Cross-Device Compatibility
- Detect Visual Defects
- Test Integration with Back-End
- Accessibility Compliance

# Why automated testing

- Saves time and effort
- Improves accuracy
- Detects regression issues quickly
- Reduces costs in the long run
- Supports agile and devops practices

---

# Selenium

## Major components of Selenium

ELI5 description

- **Web Driver** - tldr; jar file with bunch of classes to automate browser
- **Selenium IDE** - tldr; records actions you perform on browser and creates an automation script
- **Selenium Grid** - tldr; Run tests remotely

![Selenium components](assets/selenium-components.png)

---

## Selenium IDE hands on

> [!NOTE]
> Scrips created by this plugin is pretty terrible
> Not necessarily because it's bad engineering
> It's genuinely a hard problem

- Download and install the [Selenium IDE](https://www.selenium.dev/selenium-ide/) (4MB)
- Create a new project
- Start a new recording with [https://demoqa.com/text-box](https://demoqa.com/text-box)
- Export the recorded script to a Java JUnit file

> [!NOTE]
> Generated code is using JUnit 4

---

## Selenium Web Driver hands on

## Pre-requisites

- Java 21
- Gradle 8
- Firefox
- VSCode with **Extension Pack for Java** (or any other Java IDE)

---

## Step 1 - Setting up Java project for test

[changes](https://github.com/s1n7ax/lecture-intro-to-qa-automation/compare/main...step-1)

- Create a new Java project

```bash
gradle init
```

---

## Step 2 - Google page load test

[changes](https://github.com/s1n7ax/lecture-intro-to-qa-automation/compare/step-1...step-2)

- Add selenium as dependency

```groovy
# app/build.gradle
testImplementation 'org.seleniumhq.selenium:selenium-java:4.27.0'
```

- Add a sample test

```java
@Test
void appHasAGreeting() {
  var browser = new FirefoxDriver();
  browser.get("https://www.google.com");

  // this is the test
  assertEquals(browser.getTitle(), "Google");
  browser.close();
}
```

---

## Webdriver classic, WebDriver BiDi

```shell
Dec 21, 2024 9:12:29 AM org.openqa.selenium.firefox.FirefoxDriver <init>
WARNING: CDP support for Firefox is deprecated and will be removed in future versions. Please switch to WebDriver BiDi.
```

### WebDriver classic architecture

![webdriver classic architecture](assets/webdriver-classic-architecture.png)

### WebDriver BiDi architecture

![webdriver bidi architecture](assets/webdriver-bidi-architecture.png)

To enable BiDi all you have to do is,

```java
var options = new FirefoxOptions();
options.setCapability("webSocketUrl", true);
browser = new FirefoxDriver(options);
```

---

## Remove extensions

> [!NOTE]
> While most Selenium commands are included in the specification, some things are browser specific

### On Chrome

```java
var options = new ChromeOptions();
options.addArguments("--disable-extensions");
browser = new ChromeDriver(options);
```

### On Firefox

```java
var options = new FirefoxOptions();
options.addArguments("--safe-mode");
browser = new FirefoxDriver(options);
```

> [!NOTE]
> --safe-mode flag in Firefox disables multiple features including extensions
> Such as Hardware Acceleration & Themes etc

---

## Step 3 - DemoQA form validation

```java
@BeforeEach
public void beforeEach() {
  var options = new FirefoxOptions();
  options.addArguments("--safe-mode");
  options.setCapability("webSocketUrl", true);
  browser = new FirefoxDriver(options);
}
```

```java
browser.get("https://demoqa.com/text-box");
var pageHeader = browser.findElement(By.tagName("h1"));
assertEquals(pageHeader.getText(), "Text Box");

browser.findElement(By.id("userName")).sendKeys("Srinesh Nisala");
browser.findElement(By.id("userEmail")).sendKeys("random@gmail.com");

var submitBtn = browser.findElement(By.id("submit"));
((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
submitBtn.click();

var output = browser.findElement(By.id("output"));
var acName = output.findElement(By.id("name")).getText();
var acEmail = output.findElement(By.id("email")).getText();

assertTrue(acName.endsWith("Srinesh Nisala"));
assertTrue(acEmail.endsWith("random@gmail.com"));
```

---

## Common Exceptions

ELI5 description;

- `NoSuchElementException` - Element you are looking for is not in the webpage. If selector is correct, see if it's inside an iframe
- `StaleElementReferenceException` - Element was there but not right now
- `ElementClickInterceptedException` - Popup probably covering the element or not in the view

> [!TIP]
> Looking for info? Search in [documentation](https://www.selenium.dev/documentation) first
> Then try GPTing it or try Stackoverflow

---

## Step 4 - Page object model design pattern

<!-- column_layout: [1, 1] -->

<!-- column: 0 -->

```java
public class DemoQATextboxPage {
  private WebDriver browser;

  @FindBy(id = "userName")
  private WebElement fullName;

  @FindBy(id = "userEmail")
  private WebElement email;

  @FindBy(id = "submit")
  private WebElement submit;

  DemoQATextboxPage(WebDriver browser) {
    this.browser = browser;
    PageFactory.initElements(browser, this);
  }

  public void fillForm(String fullName, String email) {
    this.fullName.sendKeys(fullName);
    this.email.sendKeys(email);
    ((JavascriptExecutor) this.browser).executeScript("arguments[0].scrollIntoView(true);", this.submit);
    this.submit.click();
  }
}
```

<!-- column: 1 -->

```java
public class DemoQATextboxOutputPage {
  @FindBy(id = "name")
  private WebElement name;

  @FindBy(id = "email")
  private WebElement email;

  DemoQATextboxOutputPage(WebDriver browser) {
    var output = browser.findElement(By.id("output"));
    PageFactory.initElements(output, this);
  }

  public void validateForm(String expFullName, String expEmail) {
    assertTrue(this.name.getText().endsWith(expFullName));
    assertTrue(this.email.getText().endsWith(expEmail));
  }
}
```

---

## test
