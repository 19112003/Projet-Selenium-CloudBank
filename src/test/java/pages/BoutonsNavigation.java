package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoutonsNavigation {
	
	static WebElement element = null;
	
	//Bouton Administration
	public static WebElement btnAdministration(WebDriver driver) {
		element = driver.findElement(By.id("btnAdministration"));
		return element; 
	}
	
	
	//Bouton Créations Diverses
	public static WebElement btnCreationsDiverses(WebDriver driver) {
		element = driver.findElement(By.id("btnAutresCreations"));
		return element; 
	}
	
	
	//Bouton Création Fournisseurs
	public static WebElement btnCreationFournisseurs(WebDriver driver) {
		element = driver.findElement(By.id("btnCreateProvider"));
		return element; 
	}
	
	
	//Bouton Gestion Des Nomenclatures
	public static WebElement btnGestionDesNomenclatures(WebDriver driver) {
		element = driver.findElement(By.id("btnGestionNomenclatures"));
		return element; 
	}
	
	
	//Bouton Compte de Gestion
	public static WebElement btnCompteDeGestion(WebDriver driver) {
		element = driver.findElement(By.id("btnCreateAccountIntern"));
		return element; 
	}
	
	
		
		
		
	
	
	
	
	
	

}
