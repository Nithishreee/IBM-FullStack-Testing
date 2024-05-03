import org.testng.annotations.*;

public class activity0 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }
    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }
    @Test(groups = {"TestGrp"})
    public void test() {
        System.out.println("Test");
    }
    @Test(groups = {"TestGrp"})
    public void testGrp() {
        System.out.println("TestGrp");
    }
    @AfterClass
    public void AfterClass() {
        System.out.println("After Class");
    }
    @AfterMethod
    public void AfterMethod() {
        System.out.println("After Method");
    }
    @AfterSuite
    public void AfterSuite() {
        System.out.println("After Suite");
    }
    @AfterTest
    public void AfterTest() {
        System.out.println("After Test");
    }

}





















