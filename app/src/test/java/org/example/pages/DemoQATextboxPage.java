package org.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public static DemoQATextboxPage init(WebDriver browser) {
        return new DemoQATextboxPage(browser);
    }

    public void fillForm(String fullName, String email) {
        this.fullName.sendKeys(fullName);
        this.email.sendKeys(email);

        ((JavascriptExecutor) this.browser).executeScript("arguments[0].scrollIntoView(true);", this.submit);

        this.submit.click();
    }
}
