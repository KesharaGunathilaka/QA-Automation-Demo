package org.example;

import org.example.pages.DemoQATextboxOutputPage;
import org.example.pages.DemoQATextboxPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DemoQATest {
    WebDriver browser;

    @BeforeEach
    public void beforeEach() {
        var options = new FirefoxOptions();
        options.addArguments("--safe-mode");
        options.addArguments("--headless");
        options.setCapability("webSocketUrl", true);
        browser = new FirefoxDriver(options);
    }

    @ParameterizedTest
    @ValueSource(strings = { "Srinesh,srinesh@email.com", "Nisala,nisala@email.com" })
    void test(String detils) {
        browser.get("https://demoqa.com/text-box");

        var splitDetails = detils.split(",");
        var fullName = splitDetails[0];
        var email = splitDetails[1];

        DemoQATextboxPage.init(browser).fillForm(fullName, email);
        DemoQATextboxOutputPage.init(browser).validateForm(fullName, email);
    }

    @AfterEach
    void afterEach() throws InterruptedException {
        Thread.sleep(2000);
        browser.close();
    }
}
