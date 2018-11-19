package vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	WebDriver driver;
	static By LoginLocator = By.id("vf-service-menu-item-wsc");
	static By PhoneNumberLocator = By.id("phnr");
	static By PasswordLocator = By.id("pwd");
	static By ContinueButtonLocator = By.xpath("//input[@class='vf-nav-button__button' and @value='Pokraèovat']");

	//WebDriver driver;
	  
	  public Login(WebDriver driver) {
			 this.driver = driver;
		}	  
	
	   //Click on login button
	  
	  public void LoginWindow(){
		  WebElement login = driver.findElement(LoginLocator);
		   login.click();
	    }
	  
	  // Set phone number - phone number will be filled in TC 
	  
	  public void FillingPhoneNumber(String PhoneNumber){
	       WebElement PhoneNumberField= driver.findElement(PhoneNumberLocator);
	       PhoneNumberField.sendKeys(PhoneNumber);			  		 
	    }
	   
	  // Set password - password will be filled in TC 
	  
	  public void FillingPassword(String Password){
		   WebElement passwordField = driver.findElement(PasswordLocator);
		   passwordField.sendKeys(Password);	
	    }
	  
	  // Logging in button
	  
	  public void clickLogin() {
		   WebElement continueButton = driver.findElement(ContinueButtonLocator);
		   continueButton.click();
	    }
	
	  
	  // Method used for TC
      public void LoginUse(String PhoneNumber,String Password) {
      	
      	this.LoginWindow();
      	this.FillingPhoneNumber(PhoneNumber);
      	this.FillingPassword(Password);
      	this.clickLogin();
      	
        }
      
}
