package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Login {
	@FindBy(id="email")
	private WebElement Username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement Loginbutton;
	@FindBy(xpath="//input[@aria-label='Search Facebook']")
	private WebElement Searchbox;
	
	public Pom_Login(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void Username(String un){
		Username.sendKeys(un);
	}
	public void Password(String pwd){
		Username.sendKeys(pwd);
	}
	public void Loginbutton(){
		Loginbutton.click();
	}
	public void Searchbox(String txt){
		Searchbox.sendKeys(txt);
	}
}
