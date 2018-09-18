package com.course.testng.Suite;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("run test1");
        //throw new RuntimeException();//抛一个异常，TEST方法中没有加expectedExpections这个注解就会报异常
    }

    @Test(dependsOnMethods = {"test1"})//dependsOnMethods
    public void test2(){
        System.out.println("run test2");
    }
}
