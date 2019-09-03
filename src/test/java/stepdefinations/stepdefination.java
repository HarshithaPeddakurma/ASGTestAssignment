package stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import resources.Base;

import java.io.Console;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.AutomationPractise;
import PageObjects.MyAccount;
import PageObjects.SummerDresses;


@RunWith(Cucumber.class)
public class stepdefination extends Base{
	public static Logger Log=LogManager.getLogger(Base.class.getName());
	public static AutomationPractise a;
	public static MyAccount acc;
	public static Actions act;
	public static SummerDresses s;
	String Productname;
	String Colour;
	String[] parts;
	String Quantity;
    @Given("^Open Chrome and navigate to \"([^\"]*)\"$")
    public void open_chrome_and_navigate_to_something(String strArg1) throws Throwable {
    	//Open the chrome browser and navigate to automation practise website
    	driver=intializeDriver();
    	driver.get(strArg1);
    }

    @Given("^Enter the Valid Email address and password$")
    public void enter_the_valid_email_address_and_password() throws Throwable {
    	//Entering the valid email address and password
    	a.SignIn().click();
        Log.info("Sucessfully clicked the SigIn Page");
        a.Id().sendKeys(prop.getProperty("id"));
        Log.info("Sucessfully entered the Valid Id");
        a.password().sendKeys(prop.getProperty("password"));
        Log.info("Sucessfully entered the valid password");  
    }
    @Given("^Go to Dresses and click on the Summer dresses$")
    public void go_to_dresses_and_click_on_the_summer_dresses() throws Throwable {
    	//goto dresses->Summerdresses
        act=new Actions(driver);
        act.moveToElement(acc.Dresses()).build().perform();
        acc.SummerDresses().click();
        Log.info("Sucessfully clicked on Summerdresses");
    }
    @Given("^Get the productname colour and quantity$")
    public void get_the_productname_colour_and_quantity() throws Throwable {
    	//Get the productname,quantity,colour
    	Thread.sleep(2000);
    	this.Productname=s.ProductName().getText();
    	System.out.println("Productname:" + Productname);
    	this.Colour=s.Colour().getText();
    	parts = Colour.split(", ");
    	System.out.println(parts[0]);
    	this.Quantity=s.Quantity().getText();
    	System.out.println(Quantity);
              
    }
    @When("^Click on the SignIn and enter the invalid email address$")
    public void click_on_the_signin_and_enter_the_invalid_email_address() throws Throwable {
    	//Clicked on SignIn and entered the valid email address
    	a=new AutomationPractise(driver);
        a.SignIn().click();
        Log.info("Sucessfully clicked the SigIn Page");
        driver.manage().window().maximize();
        a.Id().sendKeys(prop.getProperty("InvalidUser"));
        Log.info("Sucessfully entered the Invalid Id");
        a.password().sendKeys(prop.getProperty("InvalidPassword"));
        Log.info("Sucessfully entered the Invalid password");
        a.SubmitLogin().click();
        Log.info("Sucessfully clicked on Submit Button");
    }

    @When("^Click on the Submit Button$")
    public void click_on_the_submit_button() throws Throwable {
    	//Click on submit button
    	a.SubmitLogin().click();
        Log.info("Sucessfully clicked on Submit Button");
    }
    @When("^Click on Add to Cart$")
    public void click_on_add_to_cart() throws Throwable {
    	//Click on Add cart
    	s=new SummerDresses(driver);
    	act.moveToElement(s.Instock()).build().perform();
    	s.AddToCart().click();
    	Log.info("Sucessfully clicked on Addtocart");
        
    }
    @When("^Click on Proceed to CheckOut$")
    public void click_on_proceed_to_checkout() throws Throwable {
    	//Click on proceed to checkout
       s.ProceedToCheckOut().click();
       Log.info("Sucessfully clicked on Proceedtocheckout");
    }
    @Then("^User should not be able to login into the automation practise website$")
    public void user_should_not_be_able_to_login_into_the_automation_practise_website() throws Throwable {
        //Checking if error message is displayed
    	String Text=a.Errormessage().getText();
    	if(Text.equalsIgnoreCase("Invalid email address."))
        {
        	Log.error("Enter valid Email Address");
        }
    }

    @Then("^User should be able to login into the automation practise website$")
    public void user_should_be_able_to_login_into_the_automation_practise_website() throws Throwable {
    	//LogIn to the Account
    	acc=new MyAccount(driver);
    	Assert.assertTrue(acc.MyAccount().isDisplayed());
    	Log.info("Sucessfully LogIn to the account");
    }
    @Then("^Validate that product is successfully added to the cart$")
    public void validate_that_product_is_successfully_added_to_the_cart() throws Throwable {
    	//check product is present in the cart
        Assert.assertTrue(s.AddToCart().isDisplayed());
        Log.info("Sucessfully Added to the Cart");
    }
    @Then("^Validate whether same productname colour and quantity are displayed in the Cart$")
    public void validate_whether_same_productname_colour_and_quantity_are_displayed_in_the_cart() throws Throwable {
    	//Validate productname, colour and quantity in the cart are same as while adding
    	String CartProductName=s.CartProductName().getText();
    	System.out.println(CartProductName);
    	Assert.assertTrue(CartProductName.equalsIgnoreCase(Productname));
    	Log.info("Same product name is displayed in the cart");
    	String CartColour=s.Cartcolour().getText();
    	Assert.assertTrue(CartColour.contains(parts[0]));
    	Log.info("Same colour is displayed in the cart");
    	String Cartquantity=s.Cartquantity().getAttribute("value");
    	System.out.println(Cartquantity);
    	Assert.assertTrue(Cartquantity.equalsIgnoreCase(Quantity));
    	driver.close();
		driver=null;
    }
}