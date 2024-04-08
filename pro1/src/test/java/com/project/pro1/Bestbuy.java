package com.project.pro1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Bestbuy{
    
	public static void main(String[] args) throws InterruptedException {
        
		// Set the path to ChromeDriver executable
			        
		WebDriverManager.chromedriver().setup();

        // Create a new instance of ChromeDriver
		
        WebDriver driver = new ChromeDriver();

        // Open Best Buy website
        
        driver.get("https://www.bestbuy.com/");

        // Maximize the browser window
        
        driver.manage().window().maximize();

        // Wait for a few seconds (you may need to add explicit waits for elements to load properly)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Validate if the given URL link is broken
        
        validateURL("https://www.bestbuy.com/");
        
        // Performing to enter into bestbuy depend upon country
        
        firststep(driver);
        
//         Perform signup and login functionality
        
        performSignupAndLogin(driver);
        
        //perform navigation and validation of title on each page
        
        Navigation(driver);
        
        //perform the validation for bottomlinks of homepage
        
        Bottomlinks(driver);
        
        //perform search and add item to shopping cart
        
        Search(driver);
        
        //perform checkout with dummy details
        
        Checkout (driver);
        
        // Close the browser
        
//        driver.quit();
        
    }

	private static void validateURL(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("The URL is valid: " + urlString);
            } else {
                System.out.println("The URL is broken: " + urlString + ", Response Code: " + responseCode);
            }
        } catch (IOException e) {
            System.out.println("Error occurred while validating URL: " + urlString);
            e.printStackTrace();
        }
    }
//}
    
    private static void firststep(WebDriver driver) throws InterruptedException {
		
		WebElement Unitedstates=driver.findElement(By.xpath("//a[@class='us-link']"));
		Unitedstates.click();
                  
    }
      
  
private static void performSignupAndLogin(WebDriver driver) throws InterruptedException {
	
    	WebElement accountButton = driver.findElement(By.cssSelector("button[data-lid='hdr_signin']"));
    	accountButton.click();
    
        Thread.sleep(3000);
   
    	WebElement createaccount = driver.findElement(By.xpath("//a[@href=\"/identity/global/createAccount\"]"));
    	createaccount.click();
    
    	WebElement Firstname = driver.findElement(By.id("firstName"));
    	Firstname.sendKeys("Balaji");
    
    	WebElement Lastname = driver.findElement(By.id("lastName"));
    	Lastname.sendKeys("Nithya");
   
    	WebElement Emailaddress = driver.findElement(By.id("email"));
    	Emailaddress.sendKeys("balagvenkat1995@gmail.com");
    
    	WebElement passwordInput = driver.findElement(By.id("fld-p1"));
    	passwordInput.sendKeys("Balaji@221696");
    
    	WebElement passwordInput2 = driver.findElement(By.id("reenterPassword"));
    	passwordInput2.sendKeys("Balaji@221696");
    
    	WebElement Mobileno = driver.findElement(By.id("phone"));
    	Mobileno.sendKeys("8667482120");
    	
    	Thread.sleep(4000);
    	        
    	WebElement createAccountant = driver.findElement(By.cssSelector("div.cia-form__controls "));
    	createAccountant.click();
    	                
        WebElement Signin = driver.findElement(By.cssSelector("a.cia-bottom-content__action"));
        Signin.click();
    
        WebElement Emailaddress2 = driver.findElement(By.id("fld-e"));
        Emailaddress2.sendKeys("balagvenkat1995@gmail.com");
   
        WebElement passwordInp = driver.findElement(By.id("fld-p1"));
        passwordInp.sendKeys("Balaji@696");
              
        WebElement Signin2 = driver.findElement(By.cssSelector("div.cia-form__controls "));
        Signin2.click();
        
}
    
    
	private static void Navigation(WebDriver driver) throws InterruptedException {
	
    	WebElement Topdeals = driver.findElement(By.cssSelector("a.bottom-left-links "));
    	Topdeals.click();
    	
    	Thread.sleep(3000);
    	
		String title=driver.getTitle();
    	
		System.out.println(title);
		
		if (driver.getTitle().equals(title))
		{
			System.out.println("Navigated successfully");

		}
		else
		{
			System.out.println("Not Navigated Successfully");

		}
        
		driver.navigate().back();

		WebElement DOD = driver.findElement(By.cssSelector("a[data-lid='hdr_dotd']"));
    	DOD.click();
    	
        String title1=driver.getTitle();
    	
		System.out.println(title1);
		
		if (driver.getTitle().equals(title1))
		{
			System.out.println("Navigated successfully");

		}
		else
		{
			System.out.println("Not Navigated Successfully");

		}
		driver.navigate().back();
		
		WebElement YBST = driver.findElement(By.cssSelector("a[data-lid='hdr_finds']"));
		YBST.click();
    	
        String title11=driver.getTitle();
    	
		System.out.println(title11);
		
		if (driver.getTitle().equals(title11))
		{
			System.out.println("Navigated successfully");

		}
		else
		{
			System.out.println("Not Navigated Successfully");

		}
		driver.navigate().back();
		
		WebElement MBBM = driver.findElement(By.cssSelector("a[data-lid='hdr_my_best_buy_memberships']"));
		MBBM.click();
    	
        String title111=driver.getTitle();
    	
		System.out.println(title111);
		
		if (driver.getTitle().equals(title111))
		{
			System.out.println("Navigated successfully");

		}
		else
		{
			System.out.println("Not Navigated Successfully");

		}
		driver.navigate().back();
		
		WebElement CC = driver.findElement(By.cssSelector("a[data-lid='hdr_crd']"));
		CC.click();
    	
        String title1111=driver.getTitle();
    	
		System.out.println(title1111);
		
		if (driver.getTitle().equals(title1111))
		{
			System.out.println("Navigated successfully");

		}
		else
		{
			System.out.println("Not Navigated Successfully");

		}
		driver.navigate().back();
		
		WebElement GC = driver.findElement(By.cssSelector("a[data-lid='hdr_gift_cards']"));
		GC.click();
    	
        String title11111=driver.getTitle();
    	
		System.out.println(title11111);
		
		if (driver.getTitle().equals(title11111))
		{
			System.out.println("Navigated successfully");

		}
		else
		{
			System.out.println("Not Navigated Successfully");

		}
		driver.navigate().back();
		
		WebElement GI = driver.findElement(By.cssSelector("a[data-lid='hdr_gift_ideas']"));
		GI.click();
    	
        String title111111=driver.getTitle();
    	
		System.out.println(title111111);
		
		if (driver.getTitle().equals(title111111))
		{
			System.out.println("Navigated successfully");

		}
		else
		{
			System.out.println("Not Navigated Successfully");

		}
		driver.navigate().back();
		
		WebElement RV = driver.findElement(By.cssSelector("button[data-lid='hdr_shistory_lv']"));
		RV.click();
    	
        String title1111111=driver.getTitle();
    	
		System.out.println(title1111111);
		
		if (driver.getTitle().equals(title1111111))
		{
			System.out.println("Navigated successfully");

		}
		else
		{
			System.out.println("Not Navigated Successfully");

		}
		driver.navigate().back();
		
    	Thread.sleep(3000);

		WebElement OS = driver.findElement(By.cssSelector("button[data-lid='hdr_ostatus_lv']"));
		OS.click();
    	
        String title11111111=driver.getTitle();
    	
		System.out.println(title11111111);
		
		if (driver.getTitle().equals(title11111111))
		{
			System.out.println("Navigated successfully");

		}
		else
		{
			System.out.println("Not Navigated Successfully");

		}
		driver.navigate().back();
		
    	Thread.sleep(3000);


		WebElement SI = driver.findElement(By.cssSelector("button[data-lid='hdr_saved_lv']"));
		SI.click();
    	
        String title111111111=driver.getTitle();
    	
		System.out.println(title111111111);
		
		if (driver.getTitle().equals(title111111111))
		{
			System.out.println("Navigated successfully");

		}
	}
 	
    	private static void Bottomlinks(WebDriver driver) {
			// TODO Auto-generated method stub
    					
    	 List<WebElement> bottomLinks =driver.findElements(By.cssSelector("footer a"));
         System.out.println("Total bottom links: " + bottomLinks.size());

         for (WebElement link : bottomLinks) {            
             String linkText = link.getText();
             System.out.println("Validating bottom link: " + linkText);
	 
         }
         
	}
    	
    	private static void Search(WebDriver driver) throws InterruptedException {
			
    	WebElement search = driver.findElement(By.id("gh-search-input"));
		search.click();
		
		WebElement search1 = driver.findElement(By.id("gh-search-input"));
		search1.sendKeys("oneplus mobile");
		
		WebElement searchicon = driver.findElement(By.cssSelector("span.header-search-icon "));
		searchicon.click();
		
		WebElement oneplus = driver.findElement(By.cssSelector("h4.sku-title"));
		oneplus.click();
				
  		WebElement addtocart = driver.findElement(By.cssSelector("button[data-button-state=\"ADD_TO_CART\"]"));
		addtocart.click();
		
		Thread.sleep(3000);

		System.out.println("Successfully added to cart");
		    		
		driver.navigate().back();
		
		WebElement menu = driver.findElement(By.cssSelector("button[aria-controls='flyout-container']"));
		menu.click();
		
    	Thread.sleep(3000);
		    		
		WebElement applicances = driver.findElement(By.cssSelector("button[data-id='node-184']"));
		applicances.click();
		
		
	    WebElement aircool=driver.findElement(By.cssSelector("button[data-lid=\"ubr_app_air\"]"));
		aircool.click();
		
		WebElement aircond=driver.findElement(By.cssSelector("a[data-lid=\"ubr_app_air_ac\"]"));
		aircond.click();
		
		WebElement frigidaire = driver.findElement(By.xpath("//a[@href=\"/site/frigidaire-3-in-1-portable-room-air-conditioner-white/6483564.p?skuId=6483564\"]"));
		frigidaire.click();
		
  		WebElement addtocart1 = driver.findElement(By.cssSelector("button[data-button-state=\"ADD_TO_CART\"]"));
  		addtocart1.click();
  		
		Thread.sleep(3000);
  		
		System.out.println("Successfully added to cart as shop by department");
		
		driver.navigate().back();
		
		WebElement menu2 = driver.findElement(By.cssSelector("button[aria-controls='flyout-container']"));
		menu2.click();
		
		WebElement brands = driver.findElement(By.cssSelector("button[data-id='node-81']"));
		brands.click();
		    		
		WebElement LG=driver.findElement(By.cssSelector("a[data-lid=\"ubr_shp_lg\"]"));
		LG.click();
		
		WebElement LGapplicances = driver.findElement(By.cssSelector("div.flex-copy-wrapper"));
		LGapplicances.click();
		
		Thread.sleep(3000);

		WebElement LGrefridge = driver.findElement(By.cssSelector("div.flex-copy-wrapper"));
		LGrefridge.click();
		
		WebElement LGproduct = driver.findElement(By.xpath("//a[@href=\"/site/lg-31-7-cu-ft-french-door-smart-refrigerator-with-internal-water-dispenser-stainless-steel/6553174.p?skuId=6553174\"]"));
		LGproduct.click();
		    		
		WebElement addtocart2 = driver.findElement(By.cssSelector("button[data-button-state=\"ADD_TO_CART\"]"));
  		addtocart2.click();
  		
		Thread.sleep(3000);
  		
		System.out.println("Successfully added to cart by brands");
		
		driver.navigate().back();
		
    	}
    	

		private static void Checkout(WebDriver driver) throws InterruptedException {
			
			
		WebElement cart=driver.findElement(By.cssSelector("span.cart-label"));
		cart.click();
		
		Thread.sleep(3000);
		
		WebElement checkout=driver.findElement(By.cssSelector("div.checkout-buttons__checkout"));
		checkout.click();
		
		Thread.sleep(3000);
		
		WebElement CAG=driver.findElement(By.cssSelector("div.button-wrap "));
		CAG.click();
		
		Thread.sleep(3000);
		
		WebElement Email=driver.findElement(By.id("user.emailAddress"));
		Email.sendKeys("bala123@gmail.com");
		
		WebElement phone=driver.findElement(By.id("user.phone"));
		phone.sendKeys("9894888777");
		
		WebElement CTP=driver.findElement(By.cssSelector("div.button--continue"));
		CTP.click();
		
		System.out.println("Successfully navigated and filled dummy payment information");
		
		}
		
	 driver.quit();
			
}


	
	


    


