package com.course.testng.Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteCongig {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println(" " +
                "beforesuite运行啦");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("aftersuite运行啦");
    }
    @BeforeTest
    public void BeforTest(){
        System.out.println("beforetest");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("aftertest");
    }
}
