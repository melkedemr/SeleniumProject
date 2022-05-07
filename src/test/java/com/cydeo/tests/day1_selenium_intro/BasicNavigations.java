package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        // 1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of selenium web driver
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();//for mac and windows

        //driver.manage().window().fullscreen(); for mac


        // 3- Go to https://www.tesla.com
        driver.get("https://www.tesla.com");

        //get title of the page
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        // Stop the code execution for three seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        // Stop the code execution for three seconds
        Thread.sleep(3000);

        driver.navigate().forward();

        // Stop the code execution for three seconds
        Thread.sleep(3000);

        driver.navigate().refresh();

        // Stop the code execution for three seconds
        Thread.sleep(3000);

        // use navigate().to():
        driver.navigate().to("https://www.google.com");
        currentTitle=driver.getTitle();

        //get title of the page
        //System.out.println("driver.getTitle = " + driver.getTitle());
        System.out.println("currentTitle = " + currentTitle);

        currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //close the currently opened window
        driver.close();

        //close all opened windows
        driver.quit();


    }
}
