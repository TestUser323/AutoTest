package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端租的测试方法111111111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端租的测试方法222222222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端租的测试方法3333333333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端租的测试方法4444444444");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnserver(){
        System.out.println("这是服务端组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnserver(){
        System.out.println("这是服务端组运行之后的运行的方法!!!!!");
    }
}
