package org.example;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DemoQATest {

    WebDriver browser;

    @BeforeEach
    public void beforeEach(){
        var options = new FirefoxOptions();
        options.addArguments("--safe-mode");
        options.setCapability("webSocketUrl", true);
        browser = new FirefoxDriver(options);
        this.browser = new FirefoxDriver();
    }

    @Test
    public void demoFromtest(){
        browser.get("https://demoqa.com/text-box");
        browser.findElement(By.id("userName")).sendKeys("John Doe");
        browser.findElement(By.id("userEmail")).sendKeys("john@email.com");
        browser.findElement(By.id("currentAddress")).sendKeys("curradd");
        browser.findElement(By.id("permanentAddress")).sendKeys("permadd");
        
        var submitBtn = browser.findElement(By.id("submit"));
        ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();

        var outputWindow = browser.findElement(By.id("output"));
        var name = outputWindow.findElement(By.id("name")).getText();
        var email = outputWindow.findElement(By.id("email")).getText();

        assertTrue(name.contains("John Doe"));
        assertTrue(email.contains("john@email.com"));
    }

    @AfterEach
    public void afterEach(){
        browser.close();
    }


}
