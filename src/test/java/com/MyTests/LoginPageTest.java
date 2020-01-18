package com.MyTests;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.mypages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest(){
		String title=page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("Log In page title is "+title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=2)
	public void verifyLoginPageHeaderTest(){
		String header=page.getInstance(LoginPage.class).getLoginPageHeader();
		
		System.out.println("Log In page header is "+header);
		Assert.assertEquals(header, "Don't have an account?");
	}
	
	@Test(priority=3)
	public void verifyDoLogin(){
		String homePageHeader=page.getInstance(LoginPage.class).doLogin("vikramkang@gmail.com", "Kang123#").getHomePageHeader();
		System.out.println("Home Page Header is "+ homePageHeader);
		Assert.assertEquals(homePageHeader, "Set up your HubSpot account");
		
	}
	
	@Test(priority =4)
	public void verifyDoLogin2(){
		String isLoginDisbled=page.getInstance(LoginPage.class).doLogin("vikramkang@gmail.com");
		Assert.assertEquals(isLoginDisbled, "true");
		
	}
	
	@Test(priority =5)
	public void verifyDoLogin3(){
		String isLoginDisbled=page.getInstance(LoginPage.class).doLogin();
		Assert.assertEquals(isLoginDisbled, "true");
		
	}

}
