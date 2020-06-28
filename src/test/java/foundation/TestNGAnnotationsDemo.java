package foundation;

import org.testng.annotations.*;

public class TestNGAnnotationsDemo {

    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("Hi this is @BeforeTest");
    }

    @BeforeClass
    public void beforeClassDemo(){
        System.out.println("Hi this is @BeforeClass");
    }

    @BeforeMethod
    public void beforeMethodDemo(){
        System.out.println("Hi this is @BeforeMethod");
    }

    @Test
    public void testDemoA(){
        System.out.println("Hi this is @TestA");
    }

    @Test
    public void testDemoB(){
        System.out.println("Hi this is @TestB");
    }

    @Test
    public void testDemoC(){
        System.out.println("Hi this is @TestC");
    }

    @AfterMethod
    public void afterMethodDemo(){
        System.out.println("This is @AfterMethod");
    }

    @AfterClass
    public void afterClassDemo(){
        System.out.println("This is @AfterClass");
    }

    @AfterTest
    public void afterTestDemo(){
        System.out.println("This is @AfterTest");
    }


}
