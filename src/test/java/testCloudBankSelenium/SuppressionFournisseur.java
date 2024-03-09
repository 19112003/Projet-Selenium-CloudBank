package testCloudBankSelenium;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pages.CreationFournisseurPage;

public class SuppressionFournisseur extends TestBase {
	
	@Test
	public void suppressionFournisseur() throws InterruptedException { 
		
		//Aller sur la page de suppression
		CreationFournisseurPage.btnSuppressionForm(driver).click();
		
		//Recherche à Fournisseur à supprimer
		CreationFournisseurPage.code(driver).sendKeys("*");
		CreationFournisseurPage.code(driver).sendKeys(Keys.ENTER);
		
		CreationFournisseurPage.filtre(driver).sendKeys("0006");
		Thread.sleep(3000);
		CreationFournisseurPage.filtre(driver).sendKeys(Keys.TAB);          
		CreationFournisseurPage.btnValidationCompte(driver).click();
		
		//Confirmer la suppression
		CreationFournisseurPage.btnValidationForm(driver).click();
		CreationFournisseurPage.btnOuiExitForm(driver).click();
		Thread.sleep(2000);
		CreationFournisseurPage.btnOK(driver).click();
		
		
	}

}
