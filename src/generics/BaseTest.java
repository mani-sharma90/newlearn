package generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pom.POMAptitime;

public class BaseTest implements AutoConstant {
	
	public WebDriver driver;

		
	
	@BeforeMethod
public void startBrowser() {
		
		System.setProperty(chroma_key,chroma_value);
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(url);
		
		
	}	
	
	@BeforeMethod(dependsOnMethods="startBrowser")
	public void login() throws IOException {
		
		POMAptitime p=new POMAptitime(driver);
		p.loginAptitime();
		
		
	}
	
	
	
	
	
	
	

}
