package testCloudBankSelenium;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pages.CreationFournisseurPage;

public class InterrogationFournisseur extends TestBase {
	

	@Test
	public void interrogationFournisseur() throws InterruptedException {
		
		         /**Interrogation du nouveau fournisseur dupliqué**/ 
		
		//Aller sur la page d'interrogation
		CreationFournisseurPage.btnInterrogationForm(driver).click();
		
		//Recherche à Fournisseur à visualiser
		CreationFournisseurPage.code(driver).sendKeys("*");
		CreationFournisseurPage.code(driver).sendKeys(Keys.ENTER);
		
		CreationFournisseurPage.filtre(driver).sendKeys("0014");
		Thread.sleep(3000);
		CreationFournisseurPage.filtre(driver).sendKeys(Keys.TAB);          
		CreationFournisseurPage.btnValidationCompte(driver).click();
		
		
		Thread.sleep(5000);
		
	}

}
