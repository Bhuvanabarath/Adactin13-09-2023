package org.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	
	@Given("User is on facebook page")
	public void userIsOnFacebookPage() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");
	}
	@When("User enter username and password")
	public void userEnterUsernameAndPassword(io.cucumber.datatable.DataTable dataTable) {
	   
//		List<List<String>> asLists = dataTable.asLists();
//		List<String> list = asLists.get(0);
//		String username = list.get(0);
//		String password = list.get(1);
//		
//		driver.findElement(By.id("email")).sendKeys(username);
//		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@When("User enter username, password")
	public void userEnterUsernamePassword(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		String username = map.get("username");
		String password = map.get("password");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	
	
}
