package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {

    public static void main(String[] args) {
/*
        Verify URL not changed:

        1.open chrome browser
        2.go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        3.click on Retrieve password
        4.verify that url did not change
*/
        //1.open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2.go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedurl = driver.getCurrentUrl(); // we create this to store the expectedurl

        //3.click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String actualurl = driver.getCurrentUrl(); //we create this to store the actualurl

        //4.verify that url did not change
        if (expectedurl.equals(actualurl)){
            System.out.println("PASS");
        }else {
            System.out.println("Fail");
        }

        // close your browser
        driver.quit();
    }

}
