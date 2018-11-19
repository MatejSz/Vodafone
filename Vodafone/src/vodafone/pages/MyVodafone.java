package vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyVodafone{
	
	WebDriver driver;
	
	String CreditAmount;
	static By CreditAmountFieldLocator = (By.xpath("//strong[@class='giant blue vodafoneRgBd noWrap']"));
	static By LinkToCallAndSMSPageLocator = (By.linkText("Volání a SMS"));
		
	   public MyVodafone(WebDriver driver) {
		     this.driver = driver;
	   		 }	  
        
	   // Logging Credit Amount
	 
	   public void CreditAmount(){	   
		   WebDriverWait wait = new WebDriverWait(driver, 20);	   
		   WebElement CreditAmountField = wait.until(ExpectedConditions.visibilityOfElementLocated(CreditAmountFieldLocator));
	      	CreditAmount=CreditAmountField.getText();    
	 	  	System.out.println(CreditAmount);		   
	 	   }
	     
	    //Go to Call and SMS page
		  
	   public void clickToCallAndSMSPage() {
			 WebElement LinkToCallAndSMSPage = driver.findElement(LinkToCallAndSMSPageLocator);
			 LinkToCallAndSMSPage.click();
	    }
		
	   // Method used for TC
	   public void MyVodafoneUse() {
	      	
	       this.CreditAmount();
	       this.clickToCallAndSMSPage();	      	
        }  
}
