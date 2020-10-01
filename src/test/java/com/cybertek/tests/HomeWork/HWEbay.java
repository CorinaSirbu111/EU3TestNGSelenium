package com.cybertek.tests.HomeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;

import java.util.List;

public class HWEbay {

    public static void main(String[] args) {
/*
        Go to Ebay
        enter search term
        click on search button
        print number of results
   */


        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.ebay.com");

        WebElement searchButton = driver.findElement(By.xpath("//input[@type='text']"));
        searchButton.sendKeys("term");

       WebElement clickSearch = driver.findElement(By.xpath("//input[@value='Search']"));
       clickSearch.click();

       WebElement Result = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']"));
       String ResultFinal = Result.getText();
       System.out.println("ResultFinal = " + ResultFinal);

       driver.quit();

    }
}
