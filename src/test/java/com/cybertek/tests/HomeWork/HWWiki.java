package com.cybertek.tests.HomeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HWWiki {

    public static void main(String[] args) {
       /*
        Go to wikipedia.org (Links to an external site.)
        enter search term `selenium webdriver`
        click on search button
        click on search result `Selenium (software)`
        verify url ends with `Selenium_(software)'


        */

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.wikipedia.org");

        driver.findElement(By.cssSelector("[name='search']")).sendKeys("selenium webdriver");
        driver.findElement(By.cssSelector("i.sprite.svg-search-icon")).click();
        driver.findElement(By.linkText("Selenium (software)")).click();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("Selenium_(software)"),"verify url end with Selenium_(software)");

    }

}
