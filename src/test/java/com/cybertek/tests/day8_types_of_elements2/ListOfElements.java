package com.cybertek.tests.day8_types_of_elements2;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements{

    WebDriver driver;  // we declare the variable outside the methods in order to use it everywhere

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod                                      // if test fails it will still close the browser
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //save our web elements inside the list and findElements will find more elements
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        // we are using arrayList method to find the size of the buttons (how many) and we print them
        System.out.println("buttons.size() = " + buttons.size());

        //verify button size
        Assert.assertEquals(buttons.size(),6,"verify buttons size");

        //iter + enter to get each loop with shortcut
        for (WebElement button : buttons) {
            System.out.println(button.getText()); // it will print each buttons
            System.out.println("button.isDisplayed() = " + button.isDisplayed());
            Assert.assertTrue(button.isDisplayed(),"verify buttons are displayed"); // with assertion will make
        }                                                                                   // sure that the buttons
                                                                                            // are verify


        //click second button
        buttons.get(1).click();  // we say 1 because in in the list index starts from 0

    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //regular findElement method will throw NSE if locator does not exist
        //driver.findElement(By.tagName("buttonaiysdgausda"));

        //passing locator which does not exist, it will not throw NoSuchElement
        //ALT+enter or OPTION+Enter then one more enter for the shortcut
        List<WebElement> buttons = driver.findElements(By.tagName("buttonaiysdgausda"));

        System.out.println("buttons.size() = " + buttons.size()); // we have to verify the size all the time


    }




}
