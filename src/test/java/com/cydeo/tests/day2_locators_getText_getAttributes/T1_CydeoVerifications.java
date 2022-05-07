package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {


    public static void main(String[] args) {

    // TC #1: Cydeo practice tool verifications
    // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
     // 2. Go to https://practice.cydeo.com
        //driver.navigate().to(); other way to get url
        driver.get("https://practice.cydeo.com");
     // 3. Verify URL contains
     // Expected: cydeo
        String expectedURL="cydeo";
        String actualURL= driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
     // 4. Verify title:
     // Expected: Practice
        String expectedTitle= "Practice";
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


    driver.close();


    }
}
