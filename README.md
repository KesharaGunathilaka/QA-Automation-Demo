---
title: Introduction to QA Automation
author: By Srinesh Nisala
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

# Job Designations

> [!TIP]
> The most common job title in Sri Lanka is _"QA Engineer"_, but you might see _"Software Engineer in Test"_ job title by some foreign companies

> [!TIP]
> If a job vacancy is titled _"QA Engineer"_, it likely indicates they are seeking someone proficient in both manual and automated testing

> [!TIP]
> If the job vacancy specifies _"QA Automation Engineer,"_ your primary focus will likely be on automation tasks

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
> - Designation
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

# Automated test types

---

# 1. Unit Tests

Purpose: Test individual components or functions of a program to ensure they work as expected.
Tools: JUnit, Vitest, pytest.

[source](https://github.com/microsoft/calculator/blob/09a39a500e5b3dd2778df58d8ddc61e652246a24/src/CalculatorUnitTests/DateCalculatorUnitTests.cpp?plain=1#L997-L1017)

![Unit test example from ms calculator](assets/unit-test-example-from-ms-calculator.png)

---

# 2. Integration Tests

Purpose: Verify that different modules or services within an application work together as intended.
Tools: Postman, REST-assured

[source](https://github.com/neovim/neovim/blob/dde2cc65fd2ac89ad88b19df08dc03cf1da50316/test/functional/plugin/lsp/diagnostic_spec.lua?plain=1#L127-L154)

![Integration test example from Neovim](assets/integration-test-example-from-neovim.png)

---

# 3. Functional Tests

Purpose: Ensure the software behaves according to the specified requirements and that the user’s interactions perform correctly.
Example: Checking that a user can successfully log in using correct credentials.
Tools: Selenium, Cypress, Playwright.

---

# 4. Regression Tests

Purpose: Verify that new changes or features haven't broken existing functionality.
Example: Ensuring that a new feature doesn’t interfere with previous features like login, search, etc.
Tools: Selenium, TestComplete, QTP.

---

# 5. Smoke Tests

Purpose: Perform basic tests to determine if the critical functionalities of the software work after a build or release.

[source](https://github.com/microsoft/vscode/blob/6fb1f6fbdd167ca4599f6ad28323257c3704a777/test/smoke/src/areas/extensions/extensions.test.ts?plain=1#L15-L25)

![Smoke test example from VSCode](assets/smoke-test-example-from-vscode.png)

---

# 6. Performance Tests

Purpose: Evaluate the software’s performance under expected and peak load conditions.
Example: Measuring how the system performs with hundreds of simultaneous users.
Tools: JMeter, LoadRunner, Gatling.

---

# 7. Load Tests

Purpose: Test how the application performs under normal and heavy load conditions.
Example: Assessing how many users a website can handle at once without crashing.
Tools: Apache JMeter, BlazeMeter, LoadRunner.

---

# 8. Stress Tests

Purpose: Evaluate the system’s stability under extreme conditions or when it exceeds the expected load.
Example: Pushing a server to its limits to identify breaking points and failure handling.
Tools: JMeter, Gatling, LoadRunner.

---

# 9. Security Tests

Purpose: Identify vulnerabilities in the software, ensuring data protection and preventing security breaches.
Example: Testing for SQL injection, cross-site scripting (XSS), or unauthorized access attempts.
Tools: OWASP ZAP, Burp Suite, Selenium.

---

# 10. Acceptance Tests

Purpose: Validate whether the software meets the client’s requirements and is ready for production.
Example: Testing if a final feature matches the business specifications and customer expectations.
Tools: Cucumber, Selenium, FitNesse.

---

# 11. End-to-End (E2E) Tests

Purpose: Test the entire application workflow from start to finish to ensure the system works as expected in a production-like environment.
Example: A user registering, purchasing a product, and receiving an order confirmation email.
Tools: Cypress, Selenium, Playwright.

[source](https://github.com/Chocobozzz/PeerTube/blob/0b145cfc9ac2eebd3ca922a7e38cf000e7e75348/client/e2e/src/suites-local/signup.e2e-spec.ts?plain=1#L322-L407)

![e2e test example from peertube](assets/e2e-test-example-from-peertube.png)

---

# 12. UI Tests (User Interface)

Purpose: Ensure the user interface works as intended, including button clicks, form inputs, and navigation.
Example: Verifying that a "Submit" button works after entering data in a form.
Tools: Selenium, Cypress, TestCafe.

---

# 13. API Tests

Purpose: Validate that APIs return the correct data and handle requests appropriately.
Example: Ensuring a weather API returns accurate weather data based on the requested parameters.
Tools: Postman, RestAssured, SoapUI.

---

# 14. Visual Regression Tests

Purpose: Ensure the UI visually appears as intended after updates by comparing screenshots.
Example: Checking if design elements like buttons, fonts, and images appear correctly after a new release.
Tools: Percy, Applitools, BackstopJS.

---

# 15. Cross-Browser Tests

Purpose: Verify that the application works across different browsers and devices.
Example: Ensuring a website functions the same on Chrome, Firefox, and Safari.
Tools: BrowserStack, Selenium, CrossBrowserTesting.

---
