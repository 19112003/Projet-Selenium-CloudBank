package testCloudBankSelenium;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pages.CreationFournisseurPage;

public class DuplicationFournisseur extends TestBase {
	

	@Test
	public void duplicationFournisseur() throws InterruptedException {
		
		//Aller sur la page de duplication
		CreationFournisseurPage.btnDuplicationForm(driver).click();
		
		//Recherche à Fournisseur à dupliquer
		CreationFournisseurPage.code(driver).clear();
		CreationFournisseurPage.code(driver).sendKeys("*");
		CreationFournisseurPage.code(driver).sendKeys(Keys.ENTER);
		
		CreationFournisseurPage.filtre(driver).sendKeys("0009");
		Thread.sleep(3000);
		CreationFournisseurPage.filtre(driver).sendKeys(Keys.TAB);          
		CreationFournisseurPage.btnValidationCompte(driver).click();
		Thread.sleep(2000);
		
		//Confirmer la duplication
		CreationFournisseurPage.btnValidationForm(driver).click();
		Thread.sleep(2000);
   	    CreationFournisseurPage.btnOK(driver).click();
		
		
	}
	

}
