package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // navigate to another website with different selennium method
        driver.navigate().to("https://www.facebook.com");

        Thread.sleep(3000);   // means that it will wait 3 seconds before goes to next page

        // goes back to previous page
        driver.navigate().back();


        // goes forward after goes back
        driver.navigate().forward();


        //refresh the webpage
        driver.navigate().refresh();
    }
}
