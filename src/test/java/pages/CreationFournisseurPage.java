package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreationFournisseurPage {
	
	static WebElement element;
	
			/**Elements formulaire principal**/
	
	//Champ Nom
	public static WebElement nom(WebDriver driver) {
		element = driver.findElement(By.name("nameProvider"));
		return element; 
	}
	
	
	//Champ Situation Matrimoniale
	public static WebElement situation_matrimoniale(WebDriver driver) {
		element = driver.findElement(By.name("single"));
		return element; 
	}
	
	
	//Champ Code
	public static WebElement code(WebDriver driver) {
		element = driver.findElement(By.name("code"));
		return element; 
	}
	
	
	//Champ Compte
	public static WebElement compte(WebDriver driver) {
		element = driver.findElement(By.name("account.numeroCompletTirets"));
		return element; 
	}
		
		
	//Champ Pays
	public static WebElement pays(WebDriver driver) {
		element = driver.findElement(By.name("country.name"));
		return element; 
	}
	
	
	//Champ Ville
	public static WebElement ville(WebDriver driver) {
		element = driver.findElement(By.name("villeProvider"));
		return element; 
	}
	
	
	//Champ Telephone
	public static WebElement telephone(WebDriver driver) {
		element = driver.findElement(By.name("telephoneOne"));
		return element; 
	}
		
		
	//Champ Adresse
	public static WebElement adresse(WebDriver driver) {
		element = driver.findElement(By.name("adresseProvider"));
		return element; 
	}
	
	
	//Champ Capital
	public static WebElement capital(WebDriver driver) {
		element = driver.findElement(By.name("capital"));
		return element; 
	}
	
	
	//Champ BP
	public static WebElement bp(WebDriver driver) {
		element = driver.findElement(By.name("bp"));
		return element; 
	}
	
	
	//Champ Forme Sociale
	public static WebElement forme_sociale(WebDriver driver) {
		element = driver.findElement(By.name("capaciteJuridique.libelle"));
		return element; 
	}
	
	
	//Champ Categorie
	public static WebElement categorie(WebDriver driver) {
		element = driver.findElement(By.name("secteurActivite.libelle"));
		return element; 
	}
	
	
	//Bouton Dirigeant 1
	public static WebElement btnDirigeant1(WebDriver driver) {
		element = driver.findElement(By.id("btnResponsableOneProvider"));
		return element; 
	}
	
	
	//Bouton Dirigeant 2
	public static WebElement btnDirigeant2(WebDriver driver) {
		element = driver.findElement(By.id("btnResponsableTwoProvider"));
		return element; 
	}
	
	
	//Bouton Sauvegarder
	public static WebElement btnSauvegarder(WebDriver driver) {
		element = driver.findElement(By.id("btnSauvegarderProvider"));
		return element; 
	}
	
	
	//Bouton Validation du formulaire
	public static WebElement btnValidationForm(WebDriver driver) {
		element = driver.findElement(By.id("btValiderProvider"));
		return element; 
	}
	
	
	//Bouton Quitter le formulaire
	public static WebElement btnQuitterForm(WebDriver driver) {
		element = driver.findElement(By.id("btQuitterPanelProvider"));
		return element; 
	}
	
	
	//Icone fermer le formulaire
	public static WebElement iconeFermeture(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"x-auto-90\"]"));
		return element; 
	}
	
	//Bouton Choisir un fichier
	public static WebElement btnChoisirFichier(WebDriver driver) {
		element = driver.findElement(By.id("btnChooseFileGen"));
		return element; 
	}
	
	
	//Bouton Rafraîchir
	public static WebElement btnRafraichir(WebDriver driver) {
		element = driver.findElement(By.id("btnRefreshGen"));
		return element; 
	}
	
	
	
			//MENU
	
	//Bouton Créer le formulaire
	public static WebElement btnCreationForm(WebDriver driver) {
		element = driver.findElement(By.id("btCreationGen"));
		return element; 
	}
	
	
	//Bouton Modifier le formulaire
	public static WebElement btnModificationForm(WebDriver driver) {
		element = driver.findElement(By.id("btModificationGen"));
		return element; 
	}
	
	
	//Bouton Dupliquer le formulaire
	public static WebElement btnDuplicationForm(WebDriver driver) {
		element = driver.findElement(By.id("btDupplicationGen"));
		return element; 
	}
	
	
	//Bouton Interroger le formulaire
	public static WebElement btnInterrogationForm(WebDriver driver) {
		element = driver.findElement(By.id("btInterrogationGen"));
		return element; 
	}
	
	
	//Bouton Supprimer le formulaire
	public static WebElement btnSuppressionForm(WebDriver driver) {
		element = driver.findElement(By.id("btSuppressionGen"));
		return element; 
	}
	
	
	
				//ENTÊTE
	
	//Bouton Nouveau
	public static WebElement btnNouveau(WebDriver driver) {
		element = driver.findElement(By.id("btNouveauGen"));
		return element; 
	}
	
	
	//Bouton Effacer
	public static WebElement btnEffacer(WebDriver driver) {
		element = driver.findElement(By.id("btEffacerGen"));
		return element; 
	}
	
	
	//Bouton Recherche
	public static WebElement btnRecherche(WebDriver driver) {
		element = driver.findElement(By.id("btRechercherGen"));
		return element; 
	}
	
	
	//Bouton Suppression entête
	public static WebElement btnSuppressionEntete(WebDriver driver) {
		element = driver.findElement(By.id("btSupprimerGen"));
		return element; 
	}
	
	
	//Bouton Imprimer
	public static WebElement btnImprimer(WebDriver driver) {
		element = driver.findElement(By.id("btImprimerGen"));
		return element; 
	}
	
	
	//Bouton Quitter entête
	public static WebElement btnQuitterEntete(WebDriver driver) {
		element = driver.findElement(By.id("btQuitterGen"));
		return element; 
	}
	
			
				/**Filtre ajout de compte**/
	
	//Champ filtre
	public static WebElement filtre(WebDriver driver) {
		element = driver.findElement(By.name("filterEvtTxtF"));
		return element; 						
	}
	
	
	//Bouton validation du compte
	public static WebElement btnValidationCompte(WebDriver driver) {
		element = driver.findElement(By.id("saveEvtTxtF"));
		return element; 
	}
	
	
	
				/**Formulaire dirigeant 1**/
	
	//Champ Nom dirigeant 1
	public static WebElement firstname(WebDriver driver) {
		element = driver.findElement(By.name("firstName"));
		return element; 
	}
	
	
	//Champ Prénom dirigeant 1
	public static WebElement lastname(WebDriver driver) {
		element = driver.findElement(By.name("lastName"));
		return element; 
	}
	
	
	//Bouton validation form dirigeant 1
	public static WebElement btnValidationDirigeant1(WebDriver driver) {
		element = driver.findElement(By.id("saveEvtPers"));
		return element; 
	}
	
	
	//Bouton quitter form dirigeant 1
	public static WebElement btnQuitterDirigeant1(WebDriver driver) {
		element = driver.findElement(By.id("cancelEvtPers"));
		return element; 
	}
		
	
	
				/**Boites de dialogue**/

			//VOULEZ VOUS QUITTER ?
	
	//Bouton OUI 
	public static WebElement btnOuiExitForm(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".x-window-plain.x-window.x-window-dlg .x-toolbar-left-row  .x-toolbar-cell:first-child button"));
		return element; 
	}
		
	
	//Bouton NON 
	public static WebElement btnNonExitForm(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".x-window-plain.x-window.x-window-dlg .x-toolbar-left-row  .x-toolbar-cell:last-child button"));
		return element; 
	}
	
	
			//ERREUR SYSTEME
	
	//Bouton OK 
	public static WebElement btnOK(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".x-window-plain.x-window.x-window-dlg button"));
		return element; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
