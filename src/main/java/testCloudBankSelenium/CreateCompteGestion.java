package testCloudBankSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateCompteGestion {
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
	    }**/
	
//	@BeforeMethod
//	public void waiting(){
//		try {
//			Thread.sleep(8000);
//		} catch (InterruptedException e) {
//		// TODO Auto-generated catch block				
//			e.printStackTrace();
//		}
//	}
	
						/**Test de connexion à la plateforme CloudBank**/
						 
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
	 
	 
	 
	 					/**Test de création d'un compte de gestion**/
	 
	 //Chemin vers de le formulaire de creation de compte de gestion: Administration - Gestion de nomenclature - Compte de gestion
	 
	 @Test(priority = 2, dependsOnMethods = "login")
	 public void goToFormCompteGestion(){
		 
		 //Administration
		 String selector = "/html/body/div[2]/div/div/div[3]/div[2]/div[1]/div/div[2]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]"; 
	        System.out.println("Chargement des selecteurs");
	        
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector)));
	            
	            System.out.println(element);
	            element.click();
	            
	        } catch (Exception e) {
	            System.out.println("Administration n'a pas été trouvé.");
	        }
	        
	     //Gestion de nomenclature
	        String selector2 = "/html/body/div[2]/div/div/div[3]/div[2]/div[1]/div/div[2]/table/tbody/tr[1]/td[5]/table/tbody/tr[2]/td[2]"; 
	        System.out.println("Chargement des selecteurs");
	        try {
	            
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	            WebElement element2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector2)));
	            
	            System.out.println(element2);
	            element2.click();

	        } catch (Exception e) {
	            System.out.println("Gestion de nomenclatures n'a pas été trouvé.");
	        }
	        
	        
	     //Compte de gestion
	        String selector3 = "/html/body/div[2]/div/div/div[3]/div[2]/div[1]/div/div[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[2]"; 
	        System.out.println("Chargement des selecteurs");
	        try {
	            
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	            WebElement element3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector3)));
	            
	            System.out.println(element3);
	            element3.click();

	        } catch (Exception e) {
	            System.out.println("Compte de gestion n'a pas été trouvé.");
	        }     
	 }
	 
	 
	
	 				/**Remplissage du formulaire de création compte de gestion**/
	 
		 @Test(priority = 3, dependsOnMethods = "goToFormCompteGestion")
		 public void fillFormCompteGestion(){
			 
			 WebElement chapitre = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div/div/form/fieldset/div/div[1]/div/div[1]/div[3]/div[1]/input"));
			 WebElement compte = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div/div/form/fieldset/div/div[2]/div/div[1]/div/div[1]/input"));
			 WebElement intitulé = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div/div/form/fieldset/div/div[3]/div/div[1]/div/div[1]/input"));
			 WebElement validation =  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]"));
			 
			 // Créer une instance afin de simuler une interaction clavier. Ici, la tabulation.
		        Actions actions = new Actions(driver);
		     
		     //Remplissage du Chapitre
			 chapitre.sendKeys("401000");
			 
			 //tabulation sur Chapitre  pour ajout automatique du nom de chapitre
			 actions.sendKeys(chapitre, Keys.TAB).build().perform();
			 
			// Bref temps d'attente permettant aux éléments d'être chargés sur la page
			 try {
			     Thread.sleep(2000);
			 } catch (InterruptedException e) {
			     e.printStackTrace();
			 }

			 //tabulation sur Compte pour ajout automatique de la Clé
		     actions.sendKeys(compte, Keys.TAB).build().perform();
		     
		     //Remplissage du champ intitulé
		     intitulé.sendKeys("GUSTAVE SARL");
		     
		     //Click sur le bouton de validation pour l'enregistrement
		    //validation.click();
			 
		 }

}
