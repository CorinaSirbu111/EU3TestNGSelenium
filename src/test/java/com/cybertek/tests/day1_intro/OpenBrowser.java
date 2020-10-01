package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {
         //we have to enter this line every time we want to open chrome
         //hey webdrivermanager, can you make chrome ready for me for automation
         // WebDriverManager is responsable for downloading driver for different browser and set up
         // your browser for automation

 //        WebDriverManager.chromedriver().setup();
//
//        //WebDriver represent the browser
//        //we are creating driver for chrome browser
          //  driver is the object
//        //new ChromeDriver() --> this part will open chrome browser plain

 //         WebDriver driver = new ChromeDriver();

//         //.get(url) method used for navigation to page

//         driver.get("https://cybertekschool.com");

          //this line will allow selenium to automate firefox browser

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver(); // this will open a empty page

        driver.get("https://www.facebook.com"); // this will open the page that we want

    }
}