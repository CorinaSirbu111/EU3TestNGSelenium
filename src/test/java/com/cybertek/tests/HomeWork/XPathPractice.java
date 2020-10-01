package com.cybertek.tests.HomeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPathPractice {

    public static void main(String[] args) {
/*
        XPATH PRACTICES

        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.

        1. Open Chrome browser

        2. Go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.

        3. Locate all the WebElements on the page using XPATH locator only (total of 6)

        a. “Home” link

        b. “Forgot password” header

        c. “E-mail” text

        d. E-mail input box

        e. “Retrieve password” button



        4.Print text of a,b,c,e and put some email to d
*/
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeButton = driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement forgetPassword = driver.findElement(By.xpath("//h2"));
        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement retrievePasswordBox = driver.findElement(By.xpath("//button[@id='form_submit']"));




        System.out.println("homeButton = " + homeButton);
        System.out.println("forgetPassword = " + forgetPassword);
        System.out.println("emailText = " + emailText);
        System.out.println("emailInputBox = " + emailInputBox);
        System.out.println("retrievePasswordBox = " + retrievePasswordBox);

        emailInputBox.sendKeys("abc@gmail.com");
        retrievePasswordBox.click();
        driver.quit();



    }



}
