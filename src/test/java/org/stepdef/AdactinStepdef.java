package org.stepdef;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

import com.pom.AdactinLoginPage;
import com.pom.BookAHotel;
import com.pom.ConfimationPage;
import com.pom.SearchHotelPage1;
import com.pom.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepdef extends BaseClass {

	AdactinLoginPage a;
	SearchHotelPage1 s;
	BookAHotel b;
	
	@Given("User is on Adactin login page")
	public void userIsOnAdactinLoginPage() {
		browserLaunch("chrome");
		launchUrl("http://adactinhotelapp.com/");
	}

	@When("user enter {string} and {string}")
	public void userEnterAnd(String string, String string2) {
		 a = new AdactinLoginPage();
		a.enterCredential(string, string2);

	}

	@When("User click on login button")
	public void userClickOnLoginButton() {
		 a = new AdactinLoginPage();
		a.dologin();
	}
	
	@Then("Validate Home page")
	public void validateHomePage() {
		 a = new AdactinLoginPage();
		System.out.println(a.validateUser());
		
	}
	
	@When("User enter {string},{string},{string},{string},{string},{string},and {string}")
	public void userEnterAnd(String string, String string2, String string3, String string4, String string5,String string6, String string7) {
		s=new SearchHotelPage1();
		s.enterdata(string, string2, string3, string4, string5, string6, string7);
	}
	
	@Then("User click on serach button")
	public void userClickOnSerachButton() {
	s.doSearch();   
	}
	
	@Then("User select hotel")
	public void userSelectHotel() {
		SelectHotel s=new SelectHotel();
		s.selectHotel();
	}
	
	@When("User add guest details {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userAddGuestDetailsAnd(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		 b=new BookAHotel();
		b.hotelBooking(string, string2, string3, string4, string5, string6, string7, string8);
	}
	@Then("User check the booking order id")
	public void userCheckTheBookingOrderId() {
		ConfimationPage c=new ConfimationPage();
		System.out.println("Order ID: "+c.getComfirmationOrder());
	}
	@When("User add guest details {string},{string},{string}")
	public void userAddGuestDetails(String string, String string2, String string3) {
		b=new BookAHotel();
	b.enterGuestDetail(string, string2, string3);
	}
	@When("Enter card details")
	public void enterCardDetails(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		String ccNo = map.get("ccno");
		String cType = map.get("ctype");
		String month = map.get("month");
		String year = map.get("year");
		String ccvNo = map.get("ccvno");
		
		b=new BookAHotel();
		WebElement ccno2 = b.getCcno();
		selectByValue(ccno2, ccNo);
		
		WebElement cctype = b.getCctype();
		selectByValue(cctype, cType);
		WebElement expmonth = b.getExpmonth();
		selectByValue(expmonth, month);
		WebElement expyear = b.getExpyear();
		selectByValue(expyear, year);
		WebElement ccvno = b.getCcvno();
		enterText(ccvno, ccvNo);
	
		
	}
}