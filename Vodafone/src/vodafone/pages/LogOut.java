package vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut {

	WebDriver driver; 
	
	 static By TopMenuLogOutLocator = By.xpath("//a[@class='vf-service-menu__item -wsc']");
	 static By TopMenuLogOutLocatorButton =By.xpath("//a[@class='vf-nav-button__button -outline js-logout']");	

	 static By OpenBasicInformationMenuLocator = By.linkText("Základní informace");
		
	 public LogOut(WebDriver driver) {
		 this.driver = driver;
		
	   }	
	 	
	  public void OpenLogOutWindow(){
		 WebDriverWait wait = new WebDriverWait(driver, 100);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(TopMenuLogOutLocator));
	
		 
		 WebElement OpenLogOut = driver.findElement(TopMenuLogOutLocator);
		 OpenLogOut.click();
	      } 
		 /* 
		 Point coordinates = driver.findElement(TopMenuLogOutLocator).getLocation();
		 Robot robot = new Robot();
		 robot.mouseMove(coordinates.getX(),coordinates.getY()+120);
	 }
	 
	 
	 public void LogOutButton(){
		 WebElement OpenLogOut = driver.findElement(TopMenuLogOutLocatorButton);
		 OpenLogOut.click();
	 }
	 */
	
	// Method used for TC
     public void LogOutUse() {
     	
     	this.OpenLogOutWindow();     	
	     	
     
       }
}
