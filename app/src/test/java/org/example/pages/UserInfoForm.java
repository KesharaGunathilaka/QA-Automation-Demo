package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoForm {
    WebDriver browser;
    
    @FindBy(id = "userName")
    private WebElement username;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(id = "submit")
    private WebElement submit;

    public UserInfoForm(WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    public void fillForm(String name, String emailAddr){
        username.sendKeys(name);
        email.sendKeys(emailAddr);

        WebElement submitBtn = browser.findElement(By.id("submit"));
        ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();
    }
}