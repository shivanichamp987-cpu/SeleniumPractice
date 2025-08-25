package org.seleniumcodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
   // new instance of web driver
    WebDriver Driver = new ChromeDriver();


    // get new url
        // Driver.get("https://mvnrepository.com/");

        // Maximise window browser
        Driver.manage().window().maximize();

        // from given 2 code get title of given website with print title
       // String Title = Driver.getTitle();
      //  System.out.println(Title);

        // using navigate method

        Driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);
        Driver.navigate().to("https://chatgpt.com/");
       Thread.sleep(2000);
       Driver.navigate().to("https://mvnrepository.com/");
       Thread.sleep(2000);
       Driver.navigate().forward();
       Thread.sleep(2000);
       Driver.navigate().back();
       Thread.sleep(2000);
       Driver.navigate().back();
       Thread.sleep(2000);
       Driver.navigate().refresh();
// close current window
        Driver.close();





    }
}