package org.seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.List;

public class Image {

    public static void main(String[] args) throws InterruptedException {

       WebDriver Driver = new ChromeDriver();

       Driver.get("https://www.flipkart.com/");
      Driver.manage().window().maximize();
      Thread.sleep(2000);
        Actions actions = new Actions(Driver);
      WebElement Electronics = Driver.findElement(By.xpath("//span[text()= 'Electronics']"));
actions.moveToElement(Electronics).perform();
        Thread.sleep(2000);
WebElement Cameras = Driver.findElement(By.xpath("//a[text () = 'Cameras & Accessories']"));

actions.moveToElement(Cameras).perform();
        Thread.sleep(2000);

WebElement dslr = Driver.findElement(By.xpath("//a[text() = 'DSLR & Mirrorless']"));
        dslr.click();
        Thread.sleep(2000);
        List<WebElement> elements = Driver.findElements(By.xpath("//div[@data-id='DLLGFXCMK3DRMEDP']//img"));
        //List<WebElement> elements = Driver.findElements(By.xpath("//div[@data-id='DLLGFXCMK3DRMEDP']//img"));
           System.out.println("Image count = "+elements.size());
        Thread.sleep(2000);
        Driver.quit();

    }
}
