package testCloudBankSelenium;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.CreationFournisseurPage;
import pages.BoutonsNavigation;

public class CreationFournisseurPassed extends TestBase {
		
		//Chemin vers le formulaire de création de fournisseur: Administration - Création diverses - Création fournisseur
		
		@Test(priority = 1, dependsOnGroups = "login", groups = "creation")
		 public void goToFormCreationFournisseur(){  
			 
	        System.out.println("Chargement des selecteurs");
	        
	        //Administration
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
	            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(BoutonsNavigation.btnAdministration(driver)));
	            
	            System.out.println(element);
	            element.click();

	        } catch (Exception e) {
	            System.out.println("Administration n'a pas été trouvé.");
	        }
	        
	        
	        //Créations diverses
	        try {
	            
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
	            WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(BoutonsNavigation.btnCreationsDiverses(driver)));
	            
	            System.out.println(element2);
	            element2.click();

	        } catch (Exception e) {
	            System.out.println("Creation diverse n'a pas été trouvé.");
	        }
	        
	        
	        //Création fournisseur 
	        try {
	            
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
	            WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(BoutonsNavigation.btnCreationFournisseurs(driver)));
	            
	            System.out.println(element3);
	            element3.click();

	        } catch (Exception e) {
	            System.out.println("Creation fournisseur n'a pas été trouvé.");
	        }
	        
	     // Bref temps d'attente permettant aux éléments d'être chargés sur la page
			 try {
			     Thread.sleep(10000);
			 } catch (InterruptedException e) {
			     e.printStackTrace();
				 }
					
		 }
		 
		 
		 		/**Remplissage du formulaire de création de fournisseur**/
		 
		 @Test(priority = 2, dependsOnMethods = "goToFormCreationFournisseur", groups = "creation")
		 public void fillFormCreationFournisseur() throws InterruptedException{
			 
			 //Remplissage du nom
			 CreationFournisseurPage.nom(driver).sendKeys("MAEVA SARL");
			 
			//Remplissage du pays
			 CreationFournisseurPage.pays(driver).sendKeys("Cameroun");
			 CreationFournisseurPage.pays(driver).sendKeys(Keys.ENTER);
			 
			//Remplissage de la ville
			 CreationFournisseurPage.ville(driver).sendKeys("YAOUNDE VI");
			 
			//Remplissage du telephone
			 CreationFournisseurPage.telephone(driver).sendKeys("699876906");
			 
			//Remplissage du adresse
			 CreationFournisseurPage.adresse(driver).sendKeys("vallee montee jouvence pres de l'ecole les Champions");
		 
			//Remplissage du capital
			 CreationFournisseurPage.capital(driver).sendKeys("50000000");
			 
			//Remplissage du BP
			 CreationFournisseurPage.bp(driver).sendKeys("237");
			 
			//Remplissage de la forme sociale
			 CreationFournisseurPage.forme_sociale(driver).sendKeys("etude avoca");
		     Thread.sleep(1000);
		     CreationFournisseurPage.forme_sociale(driver).sendKeys(Keys.TAB);
			 
			//Remplissage de la categorie
		     CreationFournisseurPage.categorie(driver).sendKeys("autres san");
			 Thread.sleep(1000);
			 CreationFournisseurPage.categorie(driver).sendKeys(Keys.TAB); 
			 
			 
			 		/**Ajout de compte**/
			 //Filtrage des comptes
			 CreationFournisseurPage.compte(driver).sendKeys("*");
			 CreationFournisseurPage.compte(driver).sendKeys(Keys.ENTER);
			 
			 //driver.findElement(By.cssSelector(".x-window-plain.x-window.x-window-dlg button")).click();
			 
			 CreationFournisseurPage.filtre(driver).sendKeys("401000027");
			 Thread.sleep(5000);
			 CreationFournisseurPage.filtre(driver).sendKeys(Keys.TAB);          
			 CreationFournisseurPage.btnValidationCompte(driver).click();
			 
			 
			 
			 	/**Ajout de dirigeant**/                                    
			
			 CreationFournisseurPage.btnDirigeant1(driver).click();
			 
			 //Element formulaire informations dirigeant 1
			 CreationFournisseurPage.firstname(driver).sendKeys("MAEVA");
			 CreationFournisseurPage.lastname(driver).sendKeys("KOUOMO");
			 
			 //Valider dirigeant           
			 CreationFournisseurPage.btnValidationDirigeant1(driver).click();
			 //CreationFournisseurPage.btnQuitterDirigeant1(driver).click();
			 Thread.sleep(1000);
			 
			 //Sauvegarder le formulaire
			 CreationFournisseurPage.btnSauvegarder(driver).click();
			 Thread.sleep(2000);
			 CreationFournisseurPage.btnOK(driver).click();
			 
			 
			 //Valider le formulaire de création de fournisseur
			 //CreationFournisseurPage.btnValidationForm(driver).click();
			 
			 //CreationFournisseurPage.btnQuitterForm(driver).click(); 
			  
			 
		 }
		 
		 
		 
		 				/**Vérification de la réussite de la création**/
		 /**
		 @Test(priority = 3, dependsOnMethods = "fillFormCreationFournisseur")
		 public void checkCreation() {
			 
			 if(driver.getPageSource().contains("Réalisé avec Succès"))  {
				 System.out.println("Creation reussie");
				 //driver.findElement(By.id("x-auto-256")).click();
				 
		   } else if (driver.getPageSource().contains("Erreur systeme, veuillez contacter l'administrateur")) {
			   System.out.println("echec");
			   driver.findElement(By.id("x-auto-256")).click();
		   }
			  
			 
		 }**/
		 
		 
		
}
