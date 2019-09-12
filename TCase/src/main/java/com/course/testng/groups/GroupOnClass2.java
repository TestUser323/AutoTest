package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu2")
public class GroupOnClass2 {
    public void stu2_1(){
        System.out.println("GroupOnClass2中的stu2_1运行");
    }
    public void stu2_2(){
        System.out.println("GroupOnClass2中的stu2_2运行");
    }
}
