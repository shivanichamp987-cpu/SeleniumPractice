package org.seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAction {

    public static void main(String[] args) throws Exception {

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/r.php");
Thread.sleep(2000);
            WebElement day = driver.findElement(By.id("day"));
            Select selectDay = new Select(day);
            selectDay.selectByVisibleText("15");

        Thread.sleep(2000);

            WebElement month = driver.findElement(By.id("month"));
            Select selectMonth = new Select(month);
            selectMonth.selectByValue("6");
        Thread.sleep(2000);
            WebElement year = driver.findElement(By.id("year"));
            Select selectYear = new Select(year);
            selectYear.selectByVisibleText("1995");
        Thread.sleep(2000);
            driver.quit();
        }
    }




