package com.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ConfimationPage extends BaseClass{
	
	public ConfimationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="//input[@id='order_no']"),@FindBy(id="order_no")})
	private WebElement orderID;
	
	public WebElement getOrderID() {
		return orderID;
	}
	public String getComfirmationOrder() {
		WebElement orderID2 = getOrderID();
		String attributeValue = getAttributeValue(orderID2);
		return attributeValue;
	}
	
}
