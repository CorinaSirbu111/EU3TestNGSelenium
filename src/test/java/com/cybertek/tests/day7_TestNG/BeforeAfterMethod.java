package com.cybertek.tests.day7_TestNG;

import org.testng.annotations.*;

public class BeforeAfterMethod {

   @BeforeClass
   public void setUpClass(){

       System.out.println("-----Before Class----");
       System.out.println("Executes before everything in class");
   }

    @Test
    public void test1(){

        System.out.println("First Test Case");
    }

    @Ignore
    @Test
    public void test2(){

       System.out.println("Second Test Case");
    }

    @Test
    public void test3(){

       System.out.println("Third Test Case");

    }
    @BeforeMethod               // we do not have run button for this before method, this will be executed first
    public void setUp(){
        System.out.println("---Before Method---");
       System.out.println("WebDriver,Opening Browser");
    }

    @AfterMethod               // we do not have run button for this after method,this will be executed at the end
    public void tearDown(){
        System.out.println("---After Method----");
       System.out.println("Closing Browser,Quit");
    }

  @AfterClass
    public void tearDownClass(){
        System.out.println("---------After Class-------");
        System.out.println("Some reporting codes");
    }


}
