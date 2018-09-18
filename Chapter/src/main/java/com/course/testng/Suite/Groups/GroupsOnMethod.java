package com.course.testng.Suite.Groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups="server")
    public void groups1(){
        System.out.println("服务端组测试方法1");
    }
    @Test(groups="server")
    public void groups2(){
        System.out.println("服务端组测试方法2");
    }
    @Test(groups="client")
    public void groupsOnClient1(){
        System.out.println("客户端组测试方法1");
    }
    @Test(groups="client")
    public void groupsOnClient2(){
        System.out.println("客户端组测试方法2");
    }
    @BeforeGroups("server")
    public void BeforeGroupsOnMethod(){
        System.out.println("服务端组运行之前运行的方法");
    }
    @AfterGroups("client")
    public void AfterGroupsOnMethod(){
        System.out.println("客户端组运行之后运行的方法");
    }


}
