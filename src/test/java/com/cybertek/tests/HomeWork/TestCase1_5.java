package com.cybertek.tests.HomeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase1_5 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }



    @Test
    public void test1(){
        /*
        Step 1. Go to “https://practicecybertekschool.herokuapp.com”
Step 2. Click on “Registration Form”
Step 3. Enter “wrong_dob” into date of birth input
box.
Step 4. Verify that warning message is displayed:
“The date of birth is not valid
         */

        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registration_form = driver.findElement(By.linkText("Registration Form"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();", registration_form);

        driver.findElement(By.name("birthday")).sendKeys("2020");
        WebElement message = driver.findElement(By.xpath("//*[.='The date of birth is not valid']"));

        Assert.assertTrue(message.isDisplayed(),"Verify this message is display: The date of birth is not valid" );


    }

    @Test
    public void test2(){
        /*
Step 1. Go to “https://practicecybertekschool.herokuapp.com”
Step 2. Click on “Registration Form”
Step 3. Verify that following options for
programming languages are displayed: c++, java,
JavaScrip
         */

    driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registration_form = driver.findElement(By.linkText("Registration Form"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();",registration_form);
                List<WebElement> elements = driver.findElements(By.className("form-check form-check-inline"));

    for (WebElement element : elements) {
            Assert.assertTrue(element.isDisplayed(), "Verify elements are displayed");

        }

    }

    @Test
    public void test3(){
/*
        Step 1. Go to “https://practicecybertekschool.herokuapp.com”
        Step 2. Click on “Registration Form”
        Step 3. Enter only one alphabetic character into first
        name input box.
                Step 4. Verify that warning message is displayed:
“first name must be more than 2 and less than 64
        characters long”
*/

        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registration_form = driver.findElement(By.linkText("Registration Form"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();",registration_form);

        driver.findElement(By.cssSelector("input[class='form-control'][name='firstname']")).sendKeys("a");
        WebElement element = driver.findElement(By.xpath("//*[.='first name must be more than 2 and less than 64 characters long']"));
        Assert.assertTrue(element.isDisplayed(), "Verify message is displayed");
    }

  @Test
    public void test4(){
        /*
       Step 1. Go to https://practicecybertekschool.herokuapp.com
Step 2. Click on “Registration Form”
Step 3. Enter only one alphabetic character into last
name input box.
Step 4. Verify that warning message is displayed:
“The last name must be more than 2 and less than
64 characters long”

         */

      driver.get("https://practice-cybertekschool.herokuapp.com");
      WebElement registration_form = driver.findElement(By.linkText("Registration Form"));
      JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("arguments[0].click();",registration_form);

      driver.findElement(By.cssSelector("input[class='form-control'][name='lastname']")).sendKeys("a");
      WebElement element = driver.findElement(By.xpath("//*[.='The last name must be more than 2 and less than 64 characters long']"));
      Assert.assertTrue(element.isDisplayed(), "Verify message is displayed");


  }

    @Test
    public void test5() throws InterruptedException {
        /*
        Step 1. Go to “https://practicecybertekschool.herokuapp.com”
Step 2. Click on “Registration Form”
Step 3. Enter any valid first name.
Step 4. Enter any valid last name.
Step 5. Enter any valid user name.
Step 6. Enter any valid password.
Step 7. Enter any valid phone number.
Step 8. Select gender.
Step 9. Enter any valid date of birth.
Step 10. Select any department.
Step 11. Enter any job title.
Step 12. Select java as a programming language.
Step 13. Click Sign up.
Step 14. Verify that following success message is
displayed: “You've successfully completed
registration!”
Note: for using dropdown, please refer to the
documentation: https://selenium.dev/selenium/
docs/api/java/org/openqa/selenium/support/ui/
Select.html or, please watch short video about dropdowns that is posted on canvas.

         */

        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registration_form = driver.findElement(By.linkText("Registration Form"));

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();",registration_form);

        driver.findElement(By.cssSelector("input[class='form-control'][name='firstname']")).sendKeys("Corina");
        driver.findElement(By.cssSelector("input[class='form-control'][name='lastname']")).sendKeys("Sirbu");
        driver.findElement(By.cssSelector("input[class='form-control'][name='username']")).sendKeys("corinasirbu");
        driver.findElement(By.cssSelector("input[class='form-control'][name='email']")).sendKeys("corina@yahoo.com");
        driver.findElement(By.cssSelector("input[class='form-control'][name='password']")).sendKeys("corina123");
        driver.findElement(By.cssSelector("input[class='form-control'][name='phone']")).sendKeys("123-456-7891");
        WebElement element = driver.findElement(By.cssSelector("input[value='female']"));
        System.out.println("element.isSelected() = " + element.isSelected());
        element.click();
        driver.findElement(By.name("birthday")).sendKeys("09/16/2020");
        WebElement element1 = driver.findElement(By.name("department"));
        Select dropdown = new Select(element1);
        dropdown.selectByVisibleText("Department of Engineering");
        WebElement element2 = driver.findElement(By.name("job_title"));
        Select dropdown2 = new Select(element2);
        dropdown2.selectByVisibleText("SDET");
        Thread.sleep(2000);
        List<WebElement> elements = driver.findElements(By.className("form-check form-check-inline"));
        driver.findElement(By.id("inlineCheckbox2")).click();
        driver.findElement(By.id("wooden_spoon")).click();
        WebElement element3 = driver.findElement(By.cssSelector("[class='alert alert-success']>p"));
        Assert.assertTrue(element3.isDisplayed(), "Verify that message is displayed:You've successfully completed registration!");
    }


  }












