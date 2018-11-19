package vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderFinished{

	WebDriver driver; 
    static By OrderFinishedHeader = By.xpath("//h1[contains(text(),'Dìkujeme za objednávku')]");
 	 
		 public OrderFinished(WebDriver driver) {
			 this.driver = driver;
		 	}

		//  Check that page is fully loaded
			
			public void CheckCallingAndSMSpageIsLoaded() {
				    WebDriverWait wait = new WebDriverWait(driver, 100);	
				    wait.until(ExpectedConditions.visibilityOfElementLocated(OrderFinishedHeader));
			  
			   }
			
			// Method used for TC
		     public void OrderFinishedUse() {
		     	
		     	this.CheckCallingAndSMSpageIsLoaded();     
			
			}
    	
}