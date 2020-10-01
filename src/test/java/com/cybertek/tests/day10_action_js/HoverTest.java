package com.cybertek.tests.day10_action_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }

    /**
     * hover over each image in the website
     * verify each name:user text is displayed
     */

    @Test
    public void test1(){

        driver.get("http://practice.cybertekschool.com/hovers");
        List<WebElement> imgs = driver.findElements(By.tagName("img"));
        List<WebElement> elements = driver.findElements(By.tagName("h5"));
        Actions actions = new Actions(driver);

       for(int i =0; i<imgs.size();i++){
           actions.moveToElement(imgs.get(i)).perform();
           Assert.assertTrue(elements.get(i).isDisplayed(),  "Verify text is display");




       }




    }
}

