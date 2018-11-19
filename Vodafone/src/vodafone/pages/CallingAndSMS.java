package vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CallingAndSMS {
	
	WebDriver driver; 
	static By CallingAndSMSPagelocator = By.xpath("//h1[contains(text(),'Volání, SMS a MMS')]");
	static By ListboxCallingSMSLocator = By.xpath("//strong[@class='ui-selectmenu-text']");
	static By ChangeAlertButtonLocator = By.xpath("//div[@class='inner  toggleButton   'and @data-connect-id='missed_call_alert']");
	static By ChangeButtonAlertONLocator =  By.xpath("//label[@for='missed_call_alert_service_service_status_1']");
	static By saveChangesLocator = By.cssSelector("#missed_call_alert_service_save");
	
	public CallingAndSMS(WebDriver driver) {
		 this.driver = driver;
	}
	
      //  Calling & SMS / Nastavení služeb – Volání a SMS
	   	   
	  //  Check that page is fully loaded
	
	public void CheckCallingAndSMSpageIsLoaded() {
		    WebDriverWait wait = new WebDriverWait(driver, 100);	
		    wait.until(ExpectedConditions.visibilityOfElementLocated(CallingAndSMSPagelocator));
	        }
		   		   
	    //Opening dropdown list

	public void SelectingNumberInDropdown(String PhoneNumeberLocator) {
			WebElement ListboxCallingSMS = driver.findElement(ListboxCallingSMSLocator);
			ListboxCallingSMS.click();
	   
	        // Choosing PhoneNumber from DropDown. PhoneNumber will be define in TC.
		  			
		    WebElement  ListboxCallingANDSMS = driver.findElement(By.xpath("//li[@data-number="+PhoneNumeberLocator+"]"));
		    ListboxCallingANDSMS.click();
		   
	       }   
	
        //Activation of Missed Call Alert
	 
	public void ActivationOfMissedCallAlert() {
		    WebElement ChangeButtonAlert = driver.findElement(ChangeAlertButtonLocator);
		    ChangeButtonAlert.click();
		   
		   WebElement ChangeButtonAlertON = driver.findElement(ChangeButtonAlertONLocator);
		   ChangeButtonAlertON.click();
	       
		
	      WebElement saveChanges= driver.findElement(saveChangesLocator);	  
	      saveChanges.click();
	      }	 
	
		// Method used for TC
		
		public void CallingAndSMSUse(String PhoneNumeberLocator) {
			
			this.CheckCallingAndSMSpageIsLoaded();
			this.SelectingNumberInDropdown(PhoneNumeberLocator);		
			this.ActivationOfMissedCallAlert();
		   }
	 
}
