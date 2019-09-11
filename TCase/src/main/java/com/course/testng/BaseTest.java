package com.course.testng;

import org.testng.annotations.*;

public class BaseTest {
    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例1");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是测试用例2");
    }
    @AfterMethod
    public void AfterMethed(){
        System.out.println("这是测试用例");
    }
    @BeforeClass
    public void beforclass(){
        System.out.println("这是在类运行之前的运行方法");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("这是在类运行之后运行的方法");
    }
    @BeforeSuite
    public void beforesuit(){
        System.out.println("Beforesuite测试套件");
    }
    @AfterSuite
    public void aftersuit(){
        System.out.println("Aftersuite测试套件");
    }
}
