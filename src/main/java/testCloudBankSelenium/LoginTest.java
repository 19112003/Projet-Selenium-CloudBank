package testCloudBankSelenium;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoginTest {
	
	private static WebDriver driver;
	//String mainWindowHandle = driver.getWindowHandle();
	
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
				
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://192.168.1.201:5303/cloudbank/index.bank");
		
	}
	
	  /**@AfterClass
	    public void cleanup() {
	        driver.close();
	        driver.quit();
	    }
	
	@BeforeMethod
	public void waiting(){
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block				
			e.printStackTrace();
		}
		
		
	}**/
	
	//Test de connexion à la plateforme CloudBank
	 @Test(priority = 1)
	 public void login(){
		 
		 //Trouver les champs à remplir pour la connexion et assignation à une variable
		 WebElement id = driver.findElement(By.cssSelector("#x-auto-11"));
		 WebElement password = driver.findElement(By.cssSelector("#x-auto-12"));
		 
		 //Remplissage des champs
		 id.sendKeys("sa");
		 password.sendKeys("Sa@123");
		 System.out.println("Connexion réussie");
		 
		 //Trouver et cliquer sur le bouton de validation
		 driver.findElement(By.cssSelector("#x-auto-10 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button")).click(); 
	 }
	 
	
	 
	 
	 
	 
	 
			
//		@Test
//		public void checkConnexion(){
//			
//		    Set<String> windowHandles = driver.getWindowHandles();
//			// Wait for the new window or dialog to open
//		    
//		    for (String handle : windowHandles) {
//		        if (!handle.equals(mainWindowHandle)) {
//		            // Switch to the window with the specified handle
//		             driver.switchTo().window(handle);
//		            
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			
//		        }
//		      }
			//wait.until(ExpectedConditions.numberOfWindowsToBe(2));
			//System.out.println(alert1.getText());
			
			//
//			 //Connexion reussie
//			 ///if(driver.getPageSource().contains("Chargement des données, veuillez patienter")) {
//				 //System.out.println("Connexion réussie");
//			   if(driver.getPageSource().contains("Utilisateur déjà connecté sur le systeme.")) {
//				 
//			 } else if(driver.getPageSource().contains("Compte ou mot de passe incorrect")){
//				 System.out.println("Echec de connexion");
//			 }
//			
		//}
		    
		 
		 
		 
		 
		 //Si une connexion déjà en cours, accpeter la déconnexion
		  //if(driver.getPageSource().contains("Utilisateur déjà connecté sur le systeme.")) {
			  //driver.findElement(By.cssSelector("#x-auto-25 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button")).click();
			  
			  
				
//			  id.sendKeys("sa");
//			  password.sendKeys("Sa@123");
//			  driver.findElement(By.cssSelector("#x-auto-10 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button")).click();
		  //}
	 
	 

	
	
  
}
