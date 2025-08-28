package org.seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {

    public static void main(String[] args) throws Exception {


        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-opencart.com/index.php?route=account/login");
     driver.manage().window().maximize();

       List<WebElement> elements = driver.findElements(By.xpath("//footer"));

       System.out.println(elements.size());

       for (WebElement ele : elements) {
     System.out.println(ele.getText());

     driver.close();




       }

    }


}
