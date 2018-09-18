package com.course.testng.Suite;

import org.testng.annotations.Test;

public class ExceptedException {
    //在我们期望结果为抛出一个异常的时候
    @Test(expectedExceptions=RuntimeException.class)
    public void RuntimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    //跑出异常运行成功
    @Test(expectedExceptions=RuntimeException.class)
    public void RuntimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
