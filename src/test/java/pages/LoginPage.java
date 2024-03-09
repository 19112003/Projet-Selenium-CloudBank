package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	static WebElement element = null;
	
	//Champ id
	public static WebElement id(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#x-auto-11"));
		return element; 
	}
	
	//Champ password
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#x-auto-12"));
		return element;	 
	}
	
	//Bouton de validation
	public static WebElement btnValidation(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#x-auto-10 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button"));
		return element;	 
	}
	
	
	
	
	
	

}
