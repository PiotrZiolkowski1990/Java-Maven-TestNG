package basics;

import org.testng.annotations.*;

public class AnnotationTest {
    @Test
    public void abc(){
        System.out.println("abc");
    }
    @Test
    public void def(){
        System.out.println("def");
    }
    @BeforeMethod
 public void setup(){
     System.out.println("before method");
 }
    @AfterMethod
    public void setup2(){
        System.out.println("after Method");
    }
    @BeforeClass
    public void abc2(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void def2(){
        System.out.println("After CLass");
    }
}
