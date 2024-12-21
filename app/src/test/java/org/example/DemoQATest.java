package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import javax.swing.Action;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

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
    void test() throws InterruptedException {
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
    }

    @AfterEach
    void afterEach() throws InterruptedException {
        Thread.sleep(2000);
        browser.close();
    }
}
