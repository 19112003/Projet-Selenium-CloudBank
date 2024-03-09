package testCloudBankSelenium;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestBase {
	
	 @Test(priority = 1, groups = "login")
	 public void enterInfoLogin() throws InterruptedException {
		 
		   //Remplissage du formulaire de connexion
		 
		LoginPage.id(driver).sendKeys("sa");
		LoginPage.password(driver).sendKeys("Sa@123");
		LoginPage.btnValidation(driver).click();
		
		System.out.println("Remplissage infos login ok");
		
		// Bref temps d'attente permettant aux éléments d'être chargés sur la page
		
		     Thread.sleep(5000);
		 
	 }
	 
	
			
	 	/**@Test(priority = 2, dependsOnMethods = "enterInfoLogin", groups = "login")
		public void checkConnexion(){
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
			
			
			 //Connexion reussie
		   if(driver.getPageSource().contains("Progression"))  {
				 System.out.println("Connexion reussi");
				 
		   } else if(driver.getPageSource().contains("Utilisateur déjà connecté sur le systeme.")) {
			   System.out.println("Utilisateur déjà connecté sur le systeme.");
			   driver.findElement(By.cssSelector("#x-auto-25 > tbody > tr:nth-child(2) > td.x-btn-mc")).click();
			   
			// Bref temps d'attente permettant aux éléments d'être chargés sur la page
			   try {
				   Thread.sleep(3500);
			   } catch (InterruptedException e) {
			     e.printStackTrace();
			   }
			   
			   //Reconnexion
			   WebElement id = driver.findElement(By.cssSelector("#x-auto-11"));
			   WebElement password = driver.findElement(By.cssSelector("#x-auto-12"));
			   id.sendKeys("sa");
			   password.sendKeys("Sa@123");
			   driver.findElement(By.cssSelector("#x-auto-10 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button")).click();
		 
		   } else if(driver.getPageSource().contains("Compte ou mot de passe incorrect")){
			 System.out.println("Echec de connexion");
		 }
			
		}
		    
		 
		 
		 
		 
		 //Si une connexion déjà en cours, accpeter la déconnexion
		  //if(driver.getPageSource().contains("Utilisateur déjà connecté sur le systeme.")) {
			  //driver.findElement(By.cssSelector("#x-auto-25 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button")).click();
			  
			  
				
//			  id.sendKeys("sa");
//			  password.sendKeys("Sa@123");
//			  driver.findElement(By.cssSelector("#x-auto-10 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button")).click();
		  //}
	 
	 
**/
	
  
}
