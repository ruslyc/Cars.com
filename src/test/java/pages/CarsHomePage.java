package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CarsHomePage {

    WebDriver driver;

    public CarsHomePage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Sign Up")
    public WebElement signUp;

    @FindBy(linkText = "Cars for Sale")
    public WebElement carsForSale;

    @FindBy(linkText = "Sell Your Car")
    public WebElement sellYourCar;

    @FindBy(linkText = "Service & Repair")
    public WebElement serviceAndRepair;

    @FindBy(linkText = "Research")
    public WebElement research;

    @FindBy(linkText = "Videos & Reviews")
    public WebElement videosAndReviews;

    @FindBy(id = "profile_menu-avatar")
    public WebElement personalDropDown;

    @FindBy(linkText = "Log In")
    public WebElement login;

    @FindBy(linkText = "My Dashboard")
    public WebElement myDashboard;

    @FindBy(linkText = "My Saved Cars")
    public WebElement mySavedCars;

    @FindBy(linkText = "My Saved Searches")
    public WebElement mySavedSearches;





}
