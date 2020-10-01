package com.cybertek.tests.day7_TestNG;

import org.testng.annotations.Test;

public class FirstTestNGTest {   // this green button will run everything in the class


    @Test
    public void test1(){          // run first method

        System.out.println("My first test case ");
}


   @Test
   public void test2(){         // run second method in the same class

        System.out.println("My second test case ");
   }


}
