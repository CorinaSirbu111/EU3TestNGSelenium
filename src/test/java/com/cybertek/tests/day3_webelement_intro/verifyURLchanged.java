package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {

    public static void main(String[] args) {
/*
        Verify URL changed

        1.open chrome browser
        2.go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        3.enter any email
        3.click on Retrieve password
        4.verify that url changed to http://practice.cybertekschool.com/email_sent
*/
        //1.open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2.go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");



        // 3.enter any email
        WebElement emailInputBox= driver.findElement(By.name("email"));

        // sentKeys().... sent keyboard action to the webelement
        emailInputBox.sendKeys("nastasa@yahoo.com");

        WebElement retrivePasswordButton = driver.findElement(By.id("form_submit"));
        retrivePasswordButton.click();


        //4.verify that url changed to http://practice.cybertekschool.com/email_sent
        //create expectedURL

        String expectedUrl = "http://practice.cybertekschool.com/email_sent";

        //saving actual url from browser after we enter any email and click retrieve password button
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("Fail");
        }

        // close your browser
        driver.quit();

    }
}
