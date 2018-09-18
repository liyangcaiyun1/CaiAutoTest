package com.course.testng.Suite.Groups;

import org.testng.annotations.Test;

@Test(groups="teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3在teacher组中的teacher1运行");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3在teacher组中的teacher2运行");
    }
}
