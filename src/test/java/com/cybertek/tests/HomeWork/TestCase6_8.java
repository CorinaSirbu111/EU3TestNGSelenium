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

public class TestCase6_8 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test6() throws InterruptedException {
        /*

    Test case #6
Step 1. Go to "https://www.tempmailaddress.com/"
Step 2. Copy and save email as a string.
Step 3. Then go to “https://practicecybertekschool.herokuapp.com”
Step 4. And click on “Sign Up For Mailing List".
Step 5. Enter any valid name.
Step 6. Enter email from the Step 2.
Step 7. Click Sign Up
Step 8. Verify that following message is displayed:
“Thank you for signing up. Click the button below to
return to the home page.”
Step 9. Navigate back to the “https://
www.tempmailaddress.com/”
Step 10. Verify that you’ve received an email from
“do-not-reply@practice.cybertekschool.com”
Step 11. Click on that email to open it.
Step 12. Verify that email is from: “do-notreply@practice.cybertekschool.com”
Step 13. Verify that subject is: “Thanks for
subscribing to practice.cybertekschool.com!”

         */

     driver.get("https://www.tempmailaddress.com/");
     String email = driver.findElement(By.id("email")).getText();
     driver.get("https://practice-cybertekschool.herokuapp.com");
     driver.findElement(By.linkText("Sign Up For Mailing List")).click();
     driver.findElement(By.name("full_name")).sendKeys("Corina Sirbu");
     driver.findElement(By.name("email")).sendKeys(email);
     driver.findElement(By.name("wooden_spoon")).click();
     WebElement signup_message = driver.findElement(By.name("signup_message"));
     Assert.assertTrue(signup_message.isDisplayed(),"Verify that message is display: Thank you for signing up. Click the button below to\n" +
                "return to the home page");

     driver.navigate().back();
     driver.navigate().back();
     Thread.sleep(1000);
     driver.navigate().back();

     email = driver.findElement(By.cssSelector("tr.hidden-xs.hidden-sm.klikaciRadek.newMail>td")).getText().trim();
     Assert.assertEquals(email,"do-not-reply@practice.cybertekschool.com","Verify that you've received an email from: do-not-reply@practice.cybertekschool.com");

     driver.findElement(By.cssSelector("tr.hidden-xs.hidden-sm.klikaciRadek.newMail>td")).click();

     String odesilatel = driver.findElement(By.id("odesilatel")).getText();

     Assert.assertEquals(odesilatel,"do-not-reply@practice.cybertekschool.com","Verify that email is from: do-not-reply@practice.cybertekschool.com");

     String predmet = driver.findElement(By.id("predmet")).getText();
     Assert.assertEquals(predmet,"Thanks for subscribing to practice.cybertekschool.com!", "Verfy that email is saying:Thanks for subscribing to practice.cybertekschool.com!");


    }
    @Test
    public void test7(){
        /*
        Step 1. Go to “https://practicecybertekschool.herokuapp.com”
        Step 2. And click on “File Upload".
        Step 3. Upload any file with .txt extension from your
        computer.
        Step 4. Click “Upload” button.
        Step 5. Verify that subject is: “File Uploaded!”
        Step 6. Verify that uploaded file name is displayed.
Note: use element.sendKeys(“/file/path”) with
specifying path to the file for uploading. Run this
method against “Choose File” button.


         */
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("File Upload")).click();
        WebElement file = driver.findElement(By.name("file"));
        String filePath = "src/test/resources/HomeWork.txt";
        String projectPath ="C:\\Users\\User\\IdeaProjects\\EU3TestNGSelenium";
        String fullPath =  projectPath + "/" + filePath;
        file.sendKeys(fullPath);
        driver.findElement(By.id("file-submit")).click();
        WebElement h3 = driver.findElement((By.tagName("h3")));
        Assert.assertTrue(h3.isDisplayed(),"Verify that subject is: “File Uploaded!”" );
        WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
        Assert.assertTrue(uploadedFile.isDisplayed(),"Verify that uploaded file name is displayed.");



    }


    @Test
    public void test8(){
        /*
        Test case #8
Step 1. Go to “https://practicecybertekschool.herokuapp.com”
Step 2. And click on “Autocomplete”.
Step 3. Enter “United States of America” into
country input box.
Step 4. Verify that following message is displayed:
“You selected: United States of America


         */

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Autocomplete")).click();
        WebElement myCountry = driver.findElement(By.id("myCountry"));
        myCountry.sendKeys("United States of America");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertTrue(result.isDisplayed(),"Verify that following message is displayed:“You selected: United States of America");

    }




}
