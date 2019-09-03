package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPractise {
	WebDriver driver;

//By Login=By.xpath("/html/body/header/div[1]/div/nav/ul/li[4]/a/span");
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement SignIn;
	@FindBy(xpath="//*[@id='email']")
	WebElement Id;
	@FindBy(xpath="//*[@id='passwd']")
	WebElement password;
	@FindBy(xpath="//*[@id='SubmitLogin']/span")
	WebElement SubmitLogin;
	@FindBy(xpath="//*[@id='center_column']/div[1]")
	WebElement Errormessage;
public AutomationPractise(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement SignIn() {
 return SignIn;
}
public WebElement Id() {
	 return Id;
	}
public WebElement password() {
	 return password;
	}
public WebElement SubmitLogin() {
	 return SubmitLogin;
	}
public WebElement Errormessage() {
	 return Errormessage;
	}
}
