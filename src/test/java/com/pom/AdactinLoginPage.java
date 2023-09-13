package com.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AdactinLoginPage extends BaseClass {
	public AdactinLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="username")
	private WebElement username;
	@FindBy(id ="password")
	private WebElement password;
	@FindBy(id ="login")
	private WebElement login;
	@FindBy(id="username_show")
	private WebElement user;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	public void enterCredential(String username,String pass) {
		WebElement username2 = getUsername();
		enterText(username2, username);
		WebElement password2 = getPassword();
		enterText(password2, pass);
	}
	public void dologin() {
		WebElement login2 = getLogin();
		btnClick(login2);
	}
	public String validateUser() {
		String textValue = getTextValue(user);
		return textValue;
	}
}

