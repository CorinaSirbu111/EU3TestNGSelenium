package com.cybertek.tests.HomeWork;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeWorkAmazon {

/**
 * TASK
 * go to amazon.com
 * search for selenium
 * click search button
 * verify 1-48 of 304 results for "selenium"
 *
 */


public static void main(String[] args) {


    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.get("https://www.amazon.com");

    WebElement searchBox = driver.findElement(By.xpath("//input[@name='field-keywords']"));
    searchBox.sendKeys("selenium");

    WebElement searchButton = driver.findElement(By.xpath("//input[@*='Go']"));
    searchButton.click();

    WebElement searchResultWord1 = driver.findElement(By.xpath("//span[.='1-48 of 188 results for']"));
    String finalResult1= searchResultWord1.getText();

    WebElement searchResultWord2 = driver.findElement(By.xpath("//h1//span[starts-with(@dir,'auto')][3]"));
    String finalResult2 = searchResultWord2.getText();
    
    String Final = finalResult1 + finalResult2;
    System.out.println(" Final = " + Final);

    driver.quit();

}

}
