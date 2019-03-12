package paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class parat {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name =" + name + "; age" + age);
    }

    @DataProvider(name = "data")
    public Object[][] praviderData() {
        Object[][] o = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 15},
                {"ces", 20}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1方法   name =" + name + "; age" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2方法   name =" + name + "; age" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] resuit = null;
        if(method.getName().equals("test1")){
            resuit = new Object[][]{
                    {"haha", 25},
                    {"hoho", 30},
                    {"lili", 35}
            };
        } else if (method.getName().equals("test2")) {
            resuit = new Object[][]{
                    {"zhangsan", 28},
                    {"wangwu", 30},
                    {"xiaohong", 34}
            };

        }
        return resuit;
    }
}
