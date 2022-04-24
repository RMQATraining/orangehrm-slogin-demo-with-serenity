package com.rmqa.testscripts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LoginTest {

	@Managed
	WebDriver driver;
	
	@Before
	public void openBrowser() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String actualText = driver.findElement(By.xpath("//h1")).getText();
		String expectedText = "Dashboard";
		Assert.assertEquals(expectedText, actualText);
	}
}
