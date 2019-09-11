package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("运行啦");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("运行结束了");
    }
}
