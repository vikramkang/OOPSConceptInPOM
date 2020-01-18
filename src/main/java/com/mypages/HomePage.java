package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By header=By.xpath("//i18n-string[@data-key='getting-started-ui.appHeaderTitle']");
	
	
	public String getHomePageHeader() {
		return getPageHeader(header);
	}
	public WebElement getHomePageElement(){
		return getElement(header);
		
	}
	
	public String getHomePageTitle(){
		return getPageTitle();
		
	}

}
