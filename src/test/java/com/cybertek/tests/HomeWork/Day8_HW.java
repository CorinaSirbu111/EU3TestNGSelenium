package com.cybertek.tests.HomeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Day8_HW {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }

  @Test
    public void test1(){

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

      WebElement messageText = driver.findElement(By.xpath("//div[@id='txtAge']"));
      Assert.assertFalse(messageText.isDisplayed(),"Verify if the message is NOT displayed");

      WebElement checkBox = driver.findElement(By.cssSelector("input#isAgeSelected"));
      checkBox.click();

      Assert.assertTrue(messageText.isDisplayed(),"Verify if the message Is displayed");

  }


  @Test
    public void test2(){

      //Open	Chrome	browser
      driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

      //Go	to	http://www.seleniumeasy.com/test/basic-checkbox-demo.html
      WebElement checkAllText = driver.findElement(By.cssSelector("input.btn.btn-primary"));

      //Verify	“Check	All”	button	text	is	“Check	All” and than click on it
      Assert.assertEquals(checkAllText.getAttribute("value"), "Check All");
      checkAllText.click();

      //Verify	all	check	boxes	are	checked
      List<WebElement> buttons = driver.findElements(By.xpath("//input[@class='cb1-element']"));
      System.out.println("buttons.size() = " + buttons.size());
      Assert.assertEquals(buttons.size(),4,"verify buttons size");

      for (WebElement button : buttons) {
          System.out.println("button.isSelected() = " + button.isSelected());

      }

      //Verify	button	text	changed	to	“Uncheck All”
      Assert.assertEquals(checkAllText.getAttribute("value"), "Uncheck All");
  }



}
