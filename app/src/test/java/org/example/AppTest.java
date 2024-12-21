package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class GoogleAppTest {
  @Test
  void googleLoadTest() {
    var browser = new FirefoxDriver();
    browser.get("https://www.google.com");
    assertEquals(browser.getTitle(), "Google");
    browser.close();
  }
}
