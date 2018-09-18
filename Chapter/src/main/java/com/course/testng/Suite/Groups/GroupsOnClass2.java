package com.course.testng.Suite.Groups;

import org.testng.annotations.Test;

@Test(groups="stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2在stu组中的stu1运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2在stu组中的stu2运行");
    }
}
