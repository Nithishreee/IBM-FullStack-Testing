package suiteExample;

import org.testng.annotations.DataProvider;

public class TestNG_Activity_8_sub {
    @DataProvider(name="SimpleForm")
    public  Object[][] credentials() {
        return new Object[][]{
                {"Nithi", "Shree","nithi@abc.com","9894766078","Hey, Nithi"},
                {"Saas", "P M","Saas@abc.com","9894767878","Hey, Saas"},
        };
    }
}
