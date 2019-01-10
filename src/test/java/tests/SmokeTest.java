package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CarsLoginPage;
import utilities.Config;
import utilities.Driver;

public class SmokeTest {

    @Test
    public void validLogin(){
        System.out.println(Config.getProperty("loginPageUrl"));
        Driver.getDriver().get(Config.getProperty("loginPageUrl"));
        CarsLoginPage clp = new CarsLoginPage();
        clp.userEmail.sendKeys(Config.getProperty("userEmail"));
        clp.password.sendKeys(Config.getProperty("password"));
        clp.submitButton.click();

    }
}
