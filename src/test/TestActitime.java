package test;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMAptitime;

public class TestActitime extends BaseTest{
	
	
	
	@Test
	
	public void createWorkAptitime() throws IOException {
		POMAptitime p=new POMAptitime(driver);
		
	p.createWork();
	
	
	WebDriverWait wait =new WebDriverWait(driver, 10);
	
	
		
	}
	
	@Test
	
	public void editCustomer() throws IOException, InterruptedException {
		POMAptitime p=new POMAptitime(driver);
		
		p.editWork();
		
	}

}
