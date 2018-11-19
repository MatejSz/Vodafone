package vodafone.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.tools.javac.util.Assert;

import vodafone.pages.CallingAndSMS;
import vodafone.pages.Login;
import vodafone.pages.MyVodafone;
import vodafone.pages.ShoppingCart;
import vodafone.pages.LogOut;
import vodafone.pages.OrderFinished;	

 public class VodafoneTest1 {
		
	static Login objlogin;
	static MyVodafone objMyVodafone;
	static CallingAndSMS objCallingAndSMS;
	static ShoppingCart objShoppingCart;
	static LogOut objLogOut;
	static OrderFinished objOrderFinished;
	
	static String ShoppingCartTextActivation = "Službu Zmeškaná volání jsme pøidali do vašeho seznamu zmìn.Nezapomeòte prosím zmìnu potvrdit.";
	static By ShoppingCartGreenTagLocator = By.xpath("//i[@class='tag greenBg']");
	static By BasketOrderContinueLocator = By.xpath("//button [@id='betest_basket_order_continue']");
	static String OrderFinishedTextConfirmation = "Váš požadavek je na cestì ke zpracování. O provedených zmìnách budete informováni SMSkou.";

		
	public static void main(String[] args) {
	      
	  // Test cases
				 
		   // @BeforeTest	- Setup
				
			  System.setProperty("webdriver.gecko.driver","C:\\Work\\Automatizovane testovani - filles\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		      WebDriver driver= new FirefoxDriver();
		     //WebDriverWait wait = new WebDriverWait(driver, 20);
	          driver.get("https://www.vodafone.cz");	 
	          
	 
		// @Test(priority=1)       
	        	
			 //Logging in to the My Vodafone - Filling logging credentials
			
	          objlogin = new Login(driver);
	          objlogin.LoginUse("773010016","2013");
	          
	         //  My Vodafone page - Logging Credit
	         
	          objMyVodafone = new MyVodafone(driver);
	          objMyVodafone.MyVodafoneUse();
             
	         
	          
	    //   Calling and SMS page  - Choosing phone number
	          
	          objCallingAndSMS=new CallingAndSMS(driver);
	          objCallingAndSMS.CallingAndSMSUse("420773010016");
          
	          
	        //  Shoppping Cart page 
	         
	          objShoppingCart=new ShoppingCart(driver);
	          objShoppingCart.ShoppingCartPageUse();
       
	          
	          // Test - correct Activaction Text is Displayed   
	          
	          
	          String ActivactionText = driver.findElement(By.tagName("body")).getText();
	          Assert.check(ActivactionText.contains(ShoppingCartTextActivation));
	          
	       
	          // Test - correct Activaction Tag is Displayed 

	          
	 	     if( driver.findElement(ShoppingCartGreenTagLocator).isDisplayed()){
	 	    	 System.out.println("Test ShoppingCartGreenTag Passed!");
	 	    	 }else{
	 	    	 System.out.println("Test ShoppingCartGreenTag Failed!");
	 	    	 }
	 	    
	 	     WebElement BasketOrderContinue= driver.findElement(BasketOrderContinueLocator);	  
		     BasketOrderContinue.click();
		     
		     
             // Order Finished
		     
		     objOrderFinished=new OrderFinished(driver);
		     objOrderFinished.OrderFinishedUse();
		     
		     
		     // Test - correct OrderFinished Text is Displayed 
		     
		     String OrderFinishedText = driver.findElement(By.tagName("body")).getText();
	         Assert.check(OrderFinishedText.contains(OrderFinishedTextConfirmation));
		   
		     // LogOut
		     
		     objLogOut=new LogOut(driver);
		     objLogOut.LogOutUse();
	          		     
        }

	}
	
