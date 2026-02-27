package com.app.stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginPage {

	@Given("Login to the URL {string}")
	public void login_to_the_url(String url) {
		System.out.println(url);
	}

	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		System.out.println(user);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
		System.out.println(pass);
	}

	@When("Click the login button")
	public void click_the_login_button() {
		System.out.println("login button");
	}

	@Then("Validate the Home page")
	public void validate_the_home_page() {
		System.out.println("Home Page");
	}

	@When("Enter the user {string}")
	public void enter_the_user(String user) {
		System.out.println(user);
	}

	@When("Enter the pass {string}")
	public void enter_the_pass(String pass) {
		System.out.println(pass);
	}

	@When("Update the form")
	public void update_the_form(DataTable dataTable) {
		
		List<String> asList = dataTable.asList();
		String firstname = asList.get(0);
		System.out.println(firstname);

	}
	
	@When("Update the form asMap")
	public void update_the_form_as_map(DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap();
		String firstname = asMap.get("Firstname");
		System.out.println(firstname);
		
		
	}

}
