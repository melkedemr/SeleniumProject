package com.cydeo.homework.day2;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeCydeoClassLocator {
    public static void main(String[] args) {
      //  TC #4: Practice Cydeo – Class locator practice
      //  1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

      //  2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //  3- Click to “Home” link
        WebElement home = driver.findElement(By.cssSelector("a[class='nav-link']"));
        home.click();
     //   4- Verify title is as expected:
      //  Expected: Practice
      //  PS: Locate “Home” link using “className” locator
        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.close();


    }
}
