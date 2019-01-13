package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Config;
import utilities.Driver;

public class CarsLoginPage {

    WebDriver driver;

    public CarsLoginPage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userEmail;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[@class='forgot-password']")
    public WebElement forgotPassword;


    public void login(String usernameText, String passwordText){
        userEmail.sendKeys(usernameText);
        password.sendKeys(passwordText);
        submitButton.click();
    }
}
