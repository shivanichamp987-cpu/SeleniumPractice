package org.seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ecommercetesting {

        public static void main(String[] args) throws InterruptedException {
            // Setup WebDriver
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // 1. Launch E-Commerce Website
            driver.get("https://www.demoblaze.com/");

            Thread.sleep(2000);

            // 2. Browse Products - Select "Samsung Galaxy S6"
            driver.findElement(By.linkText("Samsung galaxy s6")).click();
            Thread.sleep(2000);

            // 3. Add to Cart
            driver.findElement(By.linkText("Add to cart")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();

            // 4. Go to Cart
            driver.findElement(By.id("cartur")).click();
            Thread.sleep(2000);

            // 5. Checkout - Place Order
            driver.findElement(By.xpath("//button[text()='Place Order']")).click();
            Thread.sleep(2000);

            // Fill Order Form
            driver.findElement(By.id("name")).sendKeys("Test User");
            Thread.sleep(2000);
            driver.findElement(By.id("country")).sendKeys("India");
            Thread.sleep(2000);
            driver.findElement(By.id("city")).sendKeys("Delhi");
            Thread.sleep(2000);
            driver.findElement(By.id("card")).sendKeys("4111111111111111");
            Thread.sleep(2000);
            driver.findElement(By.id("month")).sendKeys("12");
            Thread.sleep(2000);
            driver.findElement(By.id("year")).sendKeys("2028");
            Thread.sleep(2000);

            // Purchase
            driver.findElement(By.xpath("//button[text()='Purchase']")).click();
            Thread.sleep(2000);

            // 6. Verify Success Message
            WebElement successMsg = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
            Thread.sleep(2000);

            if (successMsg.isDisplayed())

            {
                System.out.println("✅ Order placed successfully!");
            } else {
                System.out.println("❌ Order placement failed!");
            }

            driver.quit();
        }
    }

