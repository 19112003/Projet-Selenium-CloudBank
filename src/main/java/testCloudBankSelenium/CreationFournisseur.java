package testCloudBankSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreationFournisseur {
	
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
		
		
								/**Test de création d'un fournisseur**/ 
		
		//Chemin vers le formulaire de création de fournisseur: Administration - Création diverses - Création fournisseur
		
		 @Test(priority = 2, dependsOnMethods = "login" )
		 public void goToFormCreationFournisseur(){  
			 
			 //Administration	/html/body/div[2]/div/div/div[3]/div[2]/div[1]/div/div[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[2]
			 String selector = "/html/body/div[2]/div/div/div[3]/div[2]/div[1]/div/div[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[2]";
		        System.out.println("Chargement des selecteurs");
		       
		        try {
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector)));
		            
		            System.out.println(element);
		            element.click();

		        } catch (Exception e) {
		            System.out.println("Administration n'a pas été trouvé.");
		        }	
		        
		        //Créations diverses
		        String selector2 = "/html/body/div[2]/div/div/div[3]/div[2]/div[1]/div/div[2]/table/tbody/tr[1]/td[4]/table/tbody/tr[2]/td[2]"; 
		        System.out.println("Chargement des selecteurs");
		        try {
		            
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		            WebElement element2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector2)));
		            
		            System.out.println(element2);
		            element2.click();

		        } catch (Exception e) {
		            System.out.println("Creation diverse n'a pas été trouvé.");
		        }
		        
		        //Création fournisseur
		        String selector3 = "/html/body/div[2]/div/div/div[3]/div[2]/div[1]/div/div[2]/table/tbody/tr[2]/td[4]/table/tbody/tr[2]/td[2]"; 
		        //System.out.println("Chargement des selecteurs");
		        try {
		            
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		            WebElement element3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector3)));
		            
		            System.out.println(element3);
		            element3.click();

		        } catch (Exception e) {
		            System.out.println("Creation fournisseur n'a pas été trouvé.");
		        }
		        
		     // Bref temps d'attente permettant aux éléments d'être chargés sur la page
				 try {
				     Thread.sleep(2000);
				 } catch (InterruptedException e) {
				     e.printStackTrace();
				 }
					
		 }
		 
		 
		 /**Remplissage du formulaire de création de fournisseur**/
		 
		 @Test(priority = 3, dependsOnMethods = "goToFormCreationFournisseur")
		 public void fillFormCreationFournisseur(){
			 
			 //Elements formulaire principal				
			 WebElement nom = driver.findElement(By.name("nameProvider"));
			 WebElement compte = driver.findElement(By.name("account.numeroCompletTirets"));
			 WebElement pays = driver.findElement(By.name("country.name"));
			 WebElement ville = driver.findElement(By.name("villeProvider"));
			 WebElement telephone = driver.findElement(By.name("telephoneOne"));
			 WebElement adresse = driver.findElement(By.name("adresseProvider"));
			 //WebElement boutondirigeant1 = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div/div/form/fieldset[2]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/em/button"));
			 WebElement capital = driver.findElement(By.name("capital"));
			 WebElement bp = driver.findElement(By.name("bp"));
			 WebElement forme_sociale = driver.findElement(By.name("capaciteJuridique.libelle"));
			 WebElement categorie = driver.findElement(By.name("secteurActivite.libelle"));
			 
			 //Element formulaire info dirigeant 1
			// WebElement firstname = driver.findElement(By.xpath("/html/body/div[12]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[1]/div[1]/input"));
			 //WebElement lastname = driver.findElement(By.xpath("/html/body/div[12]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/input"));
		 
			
			 //Remplissage du nom
			 nom.sendKeys("GUSTAVE SARL");
			 
			//Remplissage du pays
			 pays.sendKeys("Cameroun");
			 
			//Remplissage de la ville
			 ville.sendKeys("YAOUNDE VI");
			 
			//Remplissage du telephone
			 telephone.sendKeys("699876906");
			 
			//Remplissage du adresse
			 adresse.sendKeys("vallee montee jouvence pres de l'ecole les Champions");
		 
			//Remplissage du capital
			 capital.sendKeys("50000000");
			 
			//Remplissage du BP
			 bp.sendKeys("237");
			 
			//Remplissage de la forme sociale
			 forme_sociale.sendKeys("etude avocat");
			 forme_sociale.submit();
			 
			// Bref temps d'attente permettant aux éléments d'être chargés sur la page
			 try {
			     Thread.sleep(2000);
			 } catch (InterruptedException e) {
			     e.printStackTrace();
			 }
			 
			//Remplissage de la categorie
			 categorie.sendKeys("autres sante");
			 categorie.submit();
			 
		 }
		 
		 
		
}
