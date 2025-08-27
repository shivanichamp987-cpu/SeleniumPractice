package org.seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignupAmazon {


    public static void main(String[] args) throws Exception {


        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        WebElement starthere = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));

        starthere.click();

        WebElement number = driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]"));
        number.sendKeys("344253534543");

        WebElement con = driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input"));
        con.click();






    }

}
