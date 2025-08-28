package org.seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class BelowAndAboveMethod {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(username));
 password.sendKeys("secret_sauce");

 WebElement login = driver.findElement(RelativeLocator.with(By.id("login-button")));
 login.click();
    }
}
