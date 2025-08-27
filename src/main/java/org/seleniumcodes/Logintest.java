package org.seleniumcodes;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;


public class Logintest {

    public static void main(String[] args) throws Exception {

WebDriver Driver = new ChromeDriver();

        Driver.get("https://www.saucedemo.com/");
        Driver.manage().window().maximize();

        WebElement username = Driver.findElement(By.cssSelector("#user-name"));
       username.sendKeys("standard_user");

WebElement password = Driver.findElement(By.cssSelector("#password"));
password.sendKeys("secret_sauce");

Thread.sleep(2000);

WebElement login = Driver.findElement(By.cssSelector("#login-button"));
login.click();

Thread.sleep(2000);

WebElement products = Driver.findElement(By.cssSelector(".title"));
String text = products.getText();
System.out.println(text);

Driver.close();


    }

       }


