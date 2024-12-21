package org.example;

import org.example.pages.DemoQATextboxOutputPage;
import org.example.pages.DemoQATextboxPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DemoQATest {
    WebDriver browser;

    @BeforeEach
    public void beforeEach() {
        var options = new FirefoxOptions();
        options.addArguments("--safe-mode");
        options.setCapability("webSocketUrl", true);
        browser = new FirefoxDriver(options);
    }

    @Test
    void test() {
        browser.get("https://demoqa.com/text-box");

        var fullName = "Srinesh Nisala";
        var email = "random@gmail.com";

        DemoQATextboxPage.init(browser).fillForm(fullName, email);
        DemoQATextboxOutputPage.init(browser).validateForm(fullName, email);
    }

    @AfterEach
    void afterEach() throws InterruptedException {
        Thread.sleep(2000);
        browser.close();
    }
}
