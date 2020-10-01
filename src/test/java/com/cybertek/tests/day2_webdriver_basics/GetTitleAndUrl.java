package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    public static void main(String[] args) {

     // open chrome and navigate to ...

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("http://practice.cybertekschool.com");

     //getting title with selenium

        String title = driver.getTitle();// use title as a verification point
        System.out.println("title = " + title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);


    }


}
