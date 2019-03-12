package ChapCase;

import org.testng.annotations.Test;

public class Chap {
    //这是一个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTime1(){
        System.out.println("这是一个失败的异常测试");
    }
    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTime2(){
        System.out.println("异常测试");
        throw new RuntimeException();
    }
}
