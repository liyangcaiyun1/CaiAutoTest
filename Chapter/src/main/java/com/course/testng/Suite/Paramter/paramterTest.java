package com.course.testng.Suite.Paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramterTest{
    @Test
    @Parameters({"name","age"})
    public void paramter1(String name,int age){
        System.out.println("name=" + name +"; age=" + age);

    }
}
