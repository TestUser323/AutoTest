package Report;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Re {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void log(){
        Reporter.log("自己写的demo日志信息");
        throw new RuntimeException("自己写的一个log demo");
    }
}
