package pom;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class POMAptitime extends BasePage implements AutoConstant {
	
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
    private WebElement passwordTextField;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement settingicon;
	
	@FindBy(xpath="//a[.=\"Types of Work\"]")
    private WebElement typesOfWorkTab;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
			private WebElement CreateTypeOfWorkButton;
	
	@FindBy(id="name")
	private WebElement nameTextField;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusDropDownList;
	
	@FindBy(xpath="//input[contains(@value,'Create Type of Work')]")
	private WebElement CreateTYpeOfWorkButton;
	
	@FindBy(xpath="//td[@class='listtblcell billingTypeCell']")
	private List<WebElement> searchWork;
	
	@FindBy(xpath="(//input[contains(@value,'Save Changes')])[1]")
	private WebElement saveButton;
	
	
	public POMAptitime(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginAptitime() throws IOException {
		
		usernameTextField.sendKeys(ExcelLibrary.getCellValue(1,0));
		passwordTextField.sendKeys(ExcelLibrary.getCellValue(1,1));
		loginButton.click();
		
		
	}
	
	public void createWork() throws IOException {
		
		settingicon.click();
		typesOfWorkTab.click();
		CreateTypeOfWorkButton.click();
		nameTextField.sendKeys(ExcelLibrary.getCellValue(1,2));
	
		selectByVisibleText(statusDropDownList,ExcelLibrary.getCellValue(1,3));
		CreateTYpeOfWorkButton.click();
	}
	
	public void editWork() throws IOException, InterruptedException {
		
		settingicon.click();
		typesOfWorkTab.click();
		
		for(int i=0;i<searchWork.size();i++) {
			
			if(searchWork.get(i).getText().equals(ExcelLibrary.getCellValue(1,2))) {
				
				System.out.println("enter");
				searchWork.get(i).click();
				break;
				
			}
			else {
				
				System.out.println("error");
			}
			
			
			
		}
		
		nameTextField.sendKeys(Keys.CONTROL,"A");
		Thread.sleep(3000);
		nameTextField.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		nameTextField.sendKeys(ExcelLibrary.getCellValue(2,2));
		saveButton.click();
		
		
	}
	
	
	
}
