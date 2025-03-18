package org.example;

import org.example.pages.UserInfoForm;
import org.example.pages.UserInfoOutput;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DemoQATest {

    WebDriver browser;

    @BeforeEach
    public void beforeEach(){
        var options = new FirefoxOptions();
        options.addArguments("--safe-mode");
        //options.addArguments("--headless");
        options.setCapability("webSocketUrl", true);
        browser = new FirefoxDriver(options);
        this.browser = new FirefoxDriver(options);
    }

    @Test
    public void demoFromtest(){
        browser.get("https://demoqa.com/text-box");
        var userInfoForm = new UserInfoForm(browser);
        userInfoForm.fillForm("John Doe", "john@email.com");
        var userOutput = new UserInfoOutput(browser);
        userOutput.assertForm("John Doe", "john@email.com");
        
    }

    @AfterEach
    public void afterEach(){
        browser.close();
    }


}
