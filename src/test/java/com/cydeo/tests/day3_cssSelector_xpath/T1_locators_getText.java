package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {
        /*
     TC #1: NextBaseCRM, locators and getText() practice
    1- Open a chrome browser
    2- Go to: https://login1.nextbasecrm.com/
    3- Enter incorrect username: “incorrect”
    4- Enter incorrect password: “incorrect”
    5- Click to login button.
    6- Verify error message text is as expected:
    Expected: Incorrect login or password

    PS: Inspect and decide which locator you should be using to locate web
    elements.
         */

        //WebDriverManager.chromedriver().setup();
       // WebDriver driver= new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        //driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");
        WebElement inputUsername= driver.findElement(By.name("USER_LOGIN"));
        inputUsername.sendKeys("incorrect");

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        WebElement loginBotton = driver.findElement(By.className("login-btn"));
        loginBotton.click();

        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage= "Incorrect login or password";
        String actualErrorMessage=errorMessage.getText();

        if(expectedErrorMessage.equals(actualErrorMessage)){
            System.out.println("Error Message Verification Passed");
        }else{
            System.out.println("Error Message Verification Failed");
        }
        driver.close();
        }


    }


