package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        Thread.sleep(2000);

        // closing the browser
        driver.close();  //this method will only close the tab that is open with Selenium

        // because i closed the browser on line 18 , line 25 gave error
        // so the solution is that in order to open a new one we create a new object
        // and reasigning ->giving new browser tab
        driver =new ChromeDriver();

        // open new tap page
        driver.get("http://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);

        driver.quit();  // this method will close all tabs

    }
}
