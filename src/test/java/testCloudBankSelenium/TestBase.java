package testCloudBankSelenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	 static WebDriver driver;
	//String mainWindowHandle = driver.getWindowHandle();
	
	@BeforeSuite
	public void setUp() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
				
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(35));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		driver.get("http://192.168.1.201:5303/cloudbank/index.bank");
		//driver.get("http://154.126.170.127:5303/cloudbank/index.bank");
		
	}
	
	/**@AfterSuite
	   
    public void TeardownTest() { 
        TestBase.driver.quit(); 
    } **/

}
