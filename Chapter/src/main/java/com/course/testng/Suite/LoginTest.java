package com.course.testng.Suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class LoginTest {

    @Test
    public void LoginTaobao(){
        System.out.println("淘宝登录成功");
    }
}
