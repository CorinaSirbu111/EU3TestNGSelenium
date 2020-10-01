package com.cybertek.tests.day12_properties_driver_tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesTest {
    
    @Test
    public void test1(){
        // getting the browser
        String browserType = ConfigurationReader.get("browser");
      
        System.out.println("browserType = " + browserType);
        
        //getting the url
        String url = ConfigurationReader.get("url");

        System.out.println("url = " + url);
        
    }

    @Test
    public void OpenBrowserWithConf(){

        // we are getting the chrome by using the configurationreader
        WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));

        driver.get(ConfigurationReader.get("url"));

        // we are making it dynamic the user name and password from configuration reader
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        // we are locating the elements and click on them / Keys.ENTER is hitting the enter insted of clicking
        // but this elements are static
        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password + Keys.ENTER);

    }
    
}
