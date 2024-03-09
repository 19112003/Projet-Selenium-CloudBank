package testCloudBankSelenium;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pages.CreationFournisseurPage;

public class ModificationFournisseur extends TestBase {
	
	@Test
	public void modificationFournisseur() throws InterruptedException {
		
		//Aller sur la page de modification
		CreationFournisseurPage.btnModificationForm(driver).click();
		
		//Recherche du Fournisseur à modifier
		CreationFournisseurPage.code(driver).sendKeys("*");
		CreationFournisseurPage.code(driver).sendKeys(Keys.ENTER);
		
		CreationFournisseurPage.filtre(driver).sendKeys("0009");
		Thread.sleep(3000);
		CreationFournisseurPage.filtre(driver).sendKeys(Keys.TAB);          
		CreationFournisseurPage.btnValidationCompte(driver).click();
		Thread.sleep(2000);
		
		//Modification infos fournisseur
		CreationFournisseurPage.telephone(driver).clear();
		CreationFournisseurPage.telephone(driver).sendKeys("693490553");
		
		Thread.sleep(1000);
		
		CreationFournisseurPage.capital(driver).clear();
		CreationFournisseurPage.capital(driver).sendKeys("60000000");
		
		//Sauvegarder la modification
		CreationFournisseurPage.btnSauvegarder(driver).click();
		Thread.sleep(2000);
   	    CreationFournisseurPage.btnOK(driver).click();	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
