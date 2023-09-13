package com.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BookAHotel extends BaseClass{

	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccno;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	@FindBy(id="cc_cvv")
	private WebElement ccvno;
	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcno() {
		return ccno;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCcvno() {
		return ccvno;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	public void hotelBooking(String fname,String lname, String address, String ccno, String ctype, String month,String year,String ccvno) {
		WebElement firstName2 = getFirstName();
		enterText(firstName2, fname);
		
		WebElement lastName2 = getLastName();
		enterText(lastName2, lname);
		
		WebElement address2 = getAddress();
		enterText(address2, address);
		
		WebElement ccno2 = getCcno();
		enterText(ccno2, ccno);
	
		WebElement cctype2 = getCctype();
		selectByValue(cctype2, ctype);//MAST
	
		WebElement expmonth2 = getExpmonth();
		selectByValue(expmonth2, month);
		
		WebElement expyear2 = getExpyear();
		selectByValue(expyear2, year);
		
		WebElement ccvno2 = getCcvno();
		enterText(ccvno2, ccvno);
		
		WebElement booknow2 = getBooknow();
		btnClick(booknow2);
	}
	 public void enterGuestDetail(String fname,String lname, String address) {
		 
		WebElement firstName2 = getFirstName(); 
		enterText(firstName2, fname);
		WebElement lastName2 = getLastName();
		enterText(lastName2, lname);
		WebElement address2 = getAddress();
		enterText(address2, address); 
		 
	}
	
	 
}
