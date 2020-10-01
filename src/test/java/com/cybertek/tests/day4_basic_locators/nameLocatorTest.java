package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");


        // make browser full screen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Corina Sirbu");

        // put same email and click sign ip button
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("nastasa@corina");

        WebElement signButton = driver.findElement(By.name("wooden_spoon"));
       signButton.click();
    }







}
