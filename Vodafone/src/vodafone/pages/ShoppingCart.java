package vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCart {
	WebDriver driver;
	static By ShoppingCartLoadedLocator = By.xpath("//h1[contains(text(),'Košík')]"); 
	
	public ShoppingCart(WebDriver driver) {
		 this.driver = driver;
	}
	
	// Making sure page is loaded before test starts
   public void ShoppingCartPageIsLoaded(){
	      WebDriverWait wait = new WebDriverWait(driver, 1000);
          wait.until(ExpectedConditions.visibilityOfElementLocated(ShoppingCartLoadedLocator));
  
	}
   
   
   // Method used for TC
   public void ShoppingCartPageUse() {
   	
   	this.ShoppingCartPageIsLoaded();
   	
   	
     }
   
}
