package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

	
	//Locators
	private By emailId=By.id("username");
	private By passWord=By.id("password");
	private By loginBtn=By.id("loginBtn");
	private By header=By.xpath("//i18n-string[@data-key='login.signupLink.text']");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getEmailId() {
		return getElement(emailId);
	}

	

	public WebElement getPassWord() {
		return getElement(passWord);
	}

	

	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}

	

	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public String getLoginPageTitle(){
		return getPageTitle();
		
	}
	
	//Login method returns generic pages as defined in abstract class
	public HomePage doLogin(String username, String pwd){
		getEmailId().sendKeys(username);
		getPassWord().sendKeys(pwd);
		getLoginBtn().click();
		return getInstance(HomePage.class);
		
	}
	// Login method overloading to consider negative cases also
	public String doLogin(String username){
		getEmailId().sendKeys(username);
		getPassWord().sendKeys("");
		return getLoginBtn().getAttribute("aria-disabled");
		
	}
	public String doLogin(){
		getEmailId().sendKeys("");
		getPassWord().sendKeys("");
		return  getLoginBtn().getAttribute("aria-disabled");
		
	}
	
}
