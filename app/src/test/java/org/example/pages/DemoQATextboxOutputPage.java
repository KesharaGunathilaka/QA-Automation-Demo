package org.example.pages;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQATextboxOutputPage {
    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "email")
    private WebElement email;

    DemoQATextboxOutputPage(WebDriver browser) {
        var output = browser.findElement(By.id("output"));
        PageFactory.initElements(output, this);
    }

    public static DemoQATextboxOutputPage init(WebDriver browser) {
        return new DemoQATextboxOutputPage(browser);
    }

    public void validateForm(String expFullName, String expEmail) {
        assertTrue(this.name.getText().endsWith(expFullName));
        assertTrue(this.email.getText().endsWith(expEmail));
    }
}
