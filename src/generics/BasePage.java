package generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
public void selectByVisibleText(WebElement element,String text) {
	
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
} 	
	

}
