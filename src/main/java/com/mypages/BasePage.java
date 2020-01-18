package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		waitForWebElementPresent(locator);
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element=null;
		try{
			waitForWebElementPresent(locator);
		element=driver.findElement(locator);
		}
		catch(Exception e)
		{	System.out.println("Some Error occured due to "+locator);
			e.printStackTrace();}
		return element;
		
	}

	@Override
	public void waitForWebElementPresent(By locator) {
		try{
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch (Exception e){
			System.out.println("Some Error occured due to "+locator);
			e.printStackTrace();
		
		}
		
		
	}

	@Override
	public void waitForPageTitle(String title) {
		try{
			wait.until(ExpectedConditions.titleContains(title));
			}
			catch (Exception e){
				System.out.println("Some Error occured due to "+title);
				e.printStackTrace();
			
			}
		
	}
	

}
