package com.cybertek.tests.day7_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {

    @BeforeMethod
    public void setUp(){
        System.out.println("Open Browser");

    }
    @Test
    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals("title","tile"); //it will compare, if the first assertion fails it
                                                            // will stop the execution on that line
                                                            // but after method will still run (close the browser)
        System.out.println("Second Assertion");
        Assert.assertEquals("url","url");


    }

    @Test
    public void test2(){

        Assert.assertEquals("test2","test2");
    }

    @Test
    public void test3(){
        String expectedTitle="Cyb";
        String actualTitle ="Cybertek";

        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify title starts with Cyb");
       // if something is returing true or false we use the condition ----> here we are looking for true

    }

    @Test
    public void test4(){
        //verify email contains @ sign
        String email = "mikesmith.com";

        Assert.assertTrue(email.contains("@"),"verify email contains @");

    }

@Test
public void test5(){
        Assert.assertFalse(0>1, "verify that 0 is not greater than 1");
        // this verifies if this is false or not

}

 @Test
 public void test6(){
        Assert.assertNotEquals("one", "two");

 }



    @AfterMethod
    public void tearDown(){

        System.out.println("Close browser");
    }

}



