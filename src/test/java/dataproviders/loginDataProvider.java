package dataproviders;

import org.testng.annotations.DataProvider;

public class loginDataProvider {
    @DataProvider
    public Object[][] loginDataProvider() {
        return new Object[][]{
//          username, password, browser
                {"simona", "zebrapassword", "edge"},
                {"dingo", "dingopassword", "chrome"},
                {"camel", "camelpassword", "edge"},
        };

    }

    ;
}