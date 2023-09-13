package com.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchHotelPage1 extends BaseClass {

	public SearchHotelPage1() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomType;
	@FindBy(id = "room_nos")
	private WebElement roomNos;
	@FindBy(id = "datepick_in")
	private WebElement checkindate;
	@FindBy(id = "datepick_out")
	private WebElement checkoutdate;
	@FindBy(id = "adult_room")
	private WebElement adultPerRoom;
	@FindBy(id = "child_room")
	private WebElement childPerRoom;
	@FindBy(id = "Submit")
	private WebElement search;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNos() {
		return roomNos;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getSearch() {
		return search;
	}
	
	public void enterdata(String loc, String hotel,String rType,String rno,String indate,String outdate,String adult)
	{
		WebElement location = getLocation();
		selectByText(location, loc);
		
		WebElement hotels2 = getHotels();
		enterText(hotels2,hotel);
		
		WebElement roomType2 = getRoomType();
		enterText(roomType2,rType);
		
		WebElement roomNos = getRoomNos();
		selectByText(roomNos, rno);
		
		WebElement checkindate = getCheckindate();
		checkindate.clear();
		enterText(checkindate, indate);
		
		WebElement checkoutdate = getCheckoutdate();
		checkoutdate.clear();
		enterText(checkoutdate, outdate);
		
		WebElement adultPerRoom = getAdultPerRoom();
		selectByText(adultPerRoom, adult);
		

	}
	
	public void doSearch() {
		WebElement search = getSearch();
		btnClick(search);
	}
	
	public void entermandatorydata(int loc,int nroom,String indate,String outdate,int audult) {

		WebElement location2 = getLocation();
		selectByIndex(location2, loc);
		WebElement roomNos2 = getRoomNos();
		selectByIndex(roomNos2, nroom);
		WebElement checkindate2 = getCheckindate();
		checkindate2.clear();
		enterText(checkindate2, indate);
		WebElement checkoutdate2 = getCheckoutdate();
		checkoutdate2.clear();
		enterText(checkoutdate2, outdate);
		WebElement adultPerRoom2 = getAdultPerRoom();
		selectByIndex(adultPerRoom2, audult);
		
	}
}
