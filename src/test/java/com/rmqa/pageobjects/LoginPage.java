package com.rmqa.pageobjects;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

	public void enterUsername(String username) {
//		driver.findElement(By.id("txtUsername")).sendKeys(username);
		find(By.id("txtUsername")).sendKeys(username);
	}

	public void enterPassword(String password) {
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		$("#txtPassword").sendKeys(password);
//		findBy("#txtPassword").sendKeys(password);
		typeInto($("#txtPassword"), password);
	}

	public void clickLogin() {
		find(By.id("btnLogin")).click();
	}
}
