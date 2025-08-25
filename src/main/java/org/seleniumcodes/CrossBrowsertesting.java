package org.seleniumcodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.classfile.instruction.SwitchCase;

public class CrossBrowsertesting {


    public static void main(String[] args) throws InterruptedException {

        String Browser = "Chrome";

        WebDriver Driver;

        switch (Browser.toUpperCase()) {
            case "CHROME":
                Driver = new ChromeDriver();
                break;
            case "FIREFOX":
                Driver = new FirefoxDriver();
                break;
            case "EDGE":
                Driver = new EdgeDriver();
                break;
            default:
                Driver = new ChromeDriver();

        }
        Driver.get("https://www.snapchat.com/web");
        String Title = Driver.getTitle();
        System.out.println(Title);
        Driver.close();


    }
}
