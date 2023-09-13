package org.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatatableStepdef {
	WebDriver driver;
	@Given("User in on the amazon page")
	public void user_in_on_the_amazon_page() {
		WebDriverManager.chromedriver().setup();	
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
	}
	@When("User search product")
	public void user_search_product(io.cucumber.datatable.DataTable dataTable) {
		
		List<String> asList = dataTable.asList();
		String s = asList.get(0);
		WebElement txtSearchbox = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearchbox.sendKeys(s,Keys.ENTER);
	}
	@When("User search product with Brand name")
	public void userSearchProductWithBrandName(io.cucumber.datatable.DataTable dataTable) {
	Map<String, String> asMap = dataTable.asMap();
	String s = asMap.get("Laptop");
	WebElement txtSearchbox = driver.findElement(By.id("twotabsearchtextbox"));
	txtSearchbox.sendKeys(s,Keys.ENTER);

	}

}
