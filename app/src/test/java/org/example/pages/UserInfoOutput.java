package org.example.pages;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoOutput {

    @FindBy(id = "name")
    private WebElement nameOutput;

    @FindBy(id = "email")
    private WebElement emailOutput;

    public UserInfoOutput(WebDriver browser){
        var output = browser.findElement(By.id("output"));
        PageFactory.initElements(output, this);
    }

        public void assertForm(String expName, String expEmail){
        var name = nameOutput.getText();
        var email = emailOutput.getText();

        assertTrue(name.contains(expName));
        assertTrue(email.contains(expEmail));
    }    

}
