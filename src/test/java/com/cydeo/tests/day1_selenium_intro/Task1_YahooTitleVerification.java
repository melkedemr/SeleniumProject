package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        // set up the browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open chrome browser
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //3. verify title
        // expected: Yahoo UK | News, email and search
        String expectedTitle= "Yahoo is part of the Yahoo family of brands";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }







    }
}
