package org.seleniumcodes;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.sql.DriverAction;
import java.time.Duration;
import java.util.List;

public class Browsers {


    public static void main(String[] args) throws InterruptedException {


       ChromeDriver Driver = new ChromeDriver();
       // EdgeDriver driver = new EdgeDriver();
        // FirefoxDriver driver1 = new FirefoxDriver();
        Driver.get("https://www.flipkart.com/");
        Driver.manage().window().maximize();
        Thread.sleep(1000);
        // Locate the Login button
        WebElement loginButton = Driver.findElement(By.cssSelector("a._1TOQfO[title='Login']"));

        // Create Actions instance
        Actions actions = new Actions(Driver);

        // Hover over the Login button
        actions.moveToElement(loginButton).perform();

        // Wait a bit to allow dropdown/menu to appear (if required)
        Thread.sleep(1000);

        // Click the Login button
        loginButton.click();


        // Find the input box (not the <span>)
        Driver.findElement(By.xpath("//input[contains(@class,'r4vIwl')]")).sendKeys("9876543210");

        Thread.sleep(1000);

        WebElement Request = Driver.findElement(By.xpath("//button[@class = 'QqFHMw twnTnD _7Pd1Fp']"));
        actions.moveToElement(Request).perform();
        Thread.sleep(1000);
        Request.click();
        Thread.sleep(2000);

        Driver.switchTo().newWindow(WindowType.TAB);

        // Step 3: Go to google.com in new tab
        Driver.get("https://www.google.com");

        // Step 4: Find search box and enter text
        WebElement searchBox = Driver.findElement(By.name("q"));
        searchBox.sendKeys("fake number and verify code");
        Thread.sleep(2000);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        // Wait until user solves captcha manually
        new WebDriverWait(Driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//iframe[contains(@src,'captcha')]")));
        Thread.sleep(1000);

        List<WebElement> Links = Driver.findElements(By.xpath("//div[@id='_temraIebIv-y4-EP7rWegAM_45']"));

        Thread.sleep(2000);

        // Close browser
        Driver.quit();


    }
}
