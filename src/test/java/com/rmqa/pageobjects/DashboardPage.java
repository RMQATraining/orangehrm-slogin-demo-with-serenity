package com.rmqa.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DashboardPage extends PageObject {

	public String getMessag() {
//		return find(By.xpath("//h1")).getText();
		WebElementFacade wf = find(By.xpath("//h1"));
		return wf.getText();
	}
}
