package com.rmqa.steps;

import org.junit.Assert;
import com.rmqa.pageobjects.DashboardPage;
import com.rmqa.pageobjects.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HrmLoginSteps {
	
	@Steps
	LoginPage loginPage;
	
	@Steps
	DashboardPage dashboardPage;

//	@Managed
//	WebDriver driver;
	
//	@Given("User is in OrangeHRM site")
//	public void user_is_in_orange_hrm_site() {
//		System.out.println("In steps- User is in OrangeHRM site");
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//	}
//
//	@When("User enters a valid {string} in Username field")
//	public void user_enters_a_valid_in_username_field(String username) {
//		System.out.println("In steps- User enters a valid {string} in Username field");
//		driver.findElement(By.id("txtUsername")).sendKeys(username);
//	}
//
//	@And("User enters a valid {string} in Password field")
//	public void user_enters_a_valid_in_password_field(String password) {
//		System.out.println("In steps- User enters a valid {string} in Password field");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	}
//
//	@And("User clicks the Login button")
//	public void user_clicks_the_login_button() {
//		System.out.println("In steps- User clicks the Login button");
//		driver.findElement(By.id("btnLogin")).click();
//	}
//
//	@Then("User is successfully navigated")
//	public void user_is_successfully_navigated() {
//		System.out.println("In steps- User is successfully navigated");
//		String actualText = driver.findElement(By.xpath("//h1")).getText();
//		String expectedText = "Dashboard";
//		Assert.assertEquals(expectedText, actualText);
//	}
	
	@Given("User is in OrangeHRM site")
	public void user_is_in_orange_hrm_site() {
//		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginPage.open();
	}

	@When("User enters a valid {string} in Username field")
	public void user_enters_a_valid_in_username_field(String username) {
		loginPage.enterUsername(username);
	}

	@And("User enters a valid {string} in Password field")
	public void user_enters_a_valid_in_password_field(String password) {
		System.out.println("In steps- User enters a valid {string} in Password field");
		loginPage.enterPassword(password);
	}

	@And("User clicks the Login button")
	public void user_clicks_the_login_button() {
		loginPage.clickLogin();
	}

	@Then("User is successfully navigated")
	public void user_is_successfully_navigated() {
		String actualText = dashboardPage.getMessag();
		String expectedText = "Dashboard";
		Assert.assertEquals(expectedText, actualText);
	}

}
