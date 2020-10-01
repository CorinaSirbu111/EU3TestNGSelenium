package com.cybertek.tests.HomeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HWEbaySelenium {
    public static void main(String[] args) {
        /*
        Go to Ebay
        search Selenium
        click on search button
        verify title contains Selenium
   */


        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.ebay.com");

        WebElement searchButton = driver.findElement(By.xpath("//input[@type='text']"));
        searchButton.sendKeys("selenium");

        WebElement clickSearch = driver.findElement(By.xpath("//input[@value='Search']"));
        clickSearch.click();

/*
        String title = driver.getTitle();
        System.out.println("title = " + title);
        boolean ContainSelenium=true;

        if( title.contains("Selenium")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
*/

        Assert.assertTrue(driver.getTitle().contains("selenium"),"verify that title contains selenium");

        driver.quit();
    }



}
