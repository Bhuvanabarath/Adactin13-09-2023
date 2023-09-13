package org.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_stepdef {
	@Given("User in on Adactin hotel page in chrome browser")
	public void user_in_on_adactin_hotel_page_in_chrome_browser() {
	}
	@When("User login {string} and {string}")
	public void user_login_and(String string, String string2) {
	}
	@Then("User shoould verify success message after login {string}")
	public void user_shoould_verify_success_message_after_login(String string) {
	}
	@When("User enter only mandatory fields {string},{string},{string},\"{int}\\/{int}\\/{int}\"and \"{int}\"")
	public void user_enter_only_mandatory_fields_and(String string, String string2, String string3, Integer int1, Integer int2, Integer int3, Integer int4) {
	}
	@Then("User click on search button")
	public void user_click_on_search_button() {
	}
}
