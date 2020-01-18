package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.mypages.HomePage;
import com.mypages.LoginPage;

public class HomePageTest extends BaseTest {

	@Test(enabled=false)
	public void verifyHomePageTitle(){
	String title=	page.getInstance(LoginPage.class).doLogin("vikramkang@gmail.com", "Kang123#").getHomePageTitle();
	System.out.println(title);
	Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test
	public void verifyHomePageHeader() throws InterruptedException{
		HomePage homePage=page.getInstance(LoginPage.class).doLogin("vikramkang@gmail.com", "Kang123#");
		
		String header=homePage.getHomePageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Set up your HubSpot account");
	}
	
}
