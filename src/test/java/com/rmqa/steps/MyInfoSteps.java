package com.rmqa.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyInfoSteps {

	//please change this path 
	String filePath = "C://Users/user/Desktop/javabasic.txt";
	WebDriver driver;

	WebElement webElement;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		String driverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user is navigated to the dasboard page")
	public void user_is_navigated_to_the_dasboard_page() {
		String actualText = driver.findElement(By.xpath("//h1")).getText();
		String expectedText = "Dashboard";
		Assert.assertEquals(expectedText, actualText);
	}

	@Given("I login to site")
	public void i_login_to_site() {
		System.out.println("inside steps- I login to site");
	}

	@Given("I click My Info Tab")
	public void i_click_my_info_tab() {
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b")).click();
	}

	@Then("I see My Info page display")
	public void i_see_my_info_page_display() {
		String actualText = driver.findElement(By.xpath("//*[@id=\"pdMainContainer\"]/div[1]/h1")).getText();
		String expectedText = "Personal Details";
		Assert.assertEquals(expectedText, actualText);
	}

	@And("I click on Personal Details form left menu")
	public void i_click_on_personal_details_form_left_menu() {
		driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[1]/a")).click();
	}

	@And("I click on Edit button")
	public void i_click_on_edit_button() {
		driver.findElement(By.id("btnSave")).click();
	}

	@And("I provide First Name, Middle Name and Last Name in Full Name field")
	public void i_provide_first_name_middle_name_and_last_name_in_full_name_field() {
		webElement = driver.findElement(By.id("personal_txtEmpFirstName"));
		webElement.clear();
		webElement.sendKeys("Santosh");
		webElement = driver.findElement(By.id("personal_txtEmpMiddleName"));
		webElement.clear();
		webElement.sendKeys("Lal");
		webElement = driver.findElement(By.id("personal_txtEmpLastName"));
		webElement.clear();
		webElement.sendKeys("Karna");
	}

	@And("I provide Employe Id in Employee ID field")
	public void i_provide_employe_id_in_employee_id_field() {
		webElement = driver.findElement(By.id("personal_txtEmployeeId"));
		webElement.clear();
		webElement.sendKeys("3333");
	}

	@And("I provide Other Id in Other ID field")
	public void i_provide_other_id_in_other_id_field() {
		webElement = driver.findElement(By.id("personal_txtOtherID"));
		webElement.clear();
		webElement.sendKeys("4444");
	}

	@And("I provide Drivers License Number in Drivers License field")
	public void i_provide_drivers_license_number_in_drivers_license_field() {
		webElement = driver.findElement(By.id("personal_txtLicenNo"));
		webElement.clear();
		webElement.sendKeys("555555");
	}

	@And("I provide License Expiry Date")
	public void i_provide_license_expiry_date() throws InterruptedException {
		driver.findElement(By.id("personal_txtLicExpDate")).click();
		// choose date from dropdown
		WebElement d = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		Select dd = new Select(d);
		dd.selectByVisibleText("2022");
		Thread.sleep(1000);
		// choose month from dropdown
		WebElement m = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		Select s = new Select(m);
		s.selectByVisibleText("Jan");
		Thread.sleep(1000);
		// select day
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();
		Thread.sleep(1000);

	}

	@And("I provide SSN Number")
	public void i_provide_ssn_number() {
		webElement = driver.findElement(By.id("personal_txtNICNo"));
		webElement.clear();
		webElement.sendKeys("7777");
	}

	@And("I provide Sin Number")
	public void i_provide_sin_number() {
		webElement = driver.findElement(By.id("personal_txtSINNo"));
		webElement.clear();
		webElement.sendKeys("66666");
	}

	@And("Select Gender Male\\/Female radio button")
	public void select_gender_male_female_radio_button() {
		// personal_optGender_1
		webElement = driver.findElement(By.id("personal_optGender_2"));
		webElement.click();
	}

	@And("I select Married in Maritial Status from dropdown")
	public void i_select_married_in_maritial_status_from_dropdown() {
		webElement = driver.findElement(By.id("personal_cmbMarital"));
		Select maritalStatus = new Select(webElement);
		maritalStatus.selectByVisibleText("Married");
	}

	@And("I select American from Nationality dropdown")
	public void i_select_american_from_nationality_dropdown() {
		webElement = driver.findElement(By.id("personal_cmbNation"));
		Select nationality = new Select(webElement);
		nationality.selectByVisibleText("Nepalese");
	}

	@And("I enter {int}-{int}-{int} in Date of Birth field")
	public void i_enter_in_date_of_birth_field(Integer int1, Integer int2, Integer int3) throws InterruptedException {
		driver.findElement(By.id("personal_DOB")).click();
		// choose date from dropdown
		WebElement d = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		Select dd = new Select(d);
		dd.selectByVisibleText("2021");
		Thread.sleep(1000);
		// choose month from dropdown
		WebElement m = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		Select s = new Select(m);
		s.selectByVisibleText("Mar");
		Thread.sleep(1000);
		// select day
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a")).click();
		Thread.sleep(1000);

	}

	@And("I provide Nick Name in Nick Name field")
	public void i_provide_nick_name_in_nick_name_field() {
		webElement = driver.findElement(By.id("personal_txtEmpNickName"));
		webElement.clear();
		webElement.sendKeys("karna");
	}

	@And("I select Check box in Smoker")
	public void i_select_check_box_in_smoker() {
		webElement = driver.findElement(By.id("personal_chkSmokeFlag"));
		webElement.click();
	}

	@And("I provide Militay Service in Military Service")
	public void i_provide_militay_service_in_military_service() {
		webElement = driver.findElement(By.id("personal_txtMilitarySer"));
		webElement.clear();
		webElement.sendKeys("Military Service");
	}

	@And("click Add button")
	public void click_add_button() {
		driver.findElement(By.id("btnAddAttachment")).click();
	}

	@And("I Upload file from sample data \\(create sample data folder inside project and select from there)")
	public void i_upload_file_from_sample_data_create_sample_data_folder_inside_project_and_select_from_there() {
		WebElement uploadElement = driver.findElement(By.id("ufile"));
		uploadElement.sendKeys(filePath);

	}

	@And("I provide Comment in comment box")
	public void i_provide_comment_in_comment_box() {
		webElement = driver.findElement(By.id("txtAttDesc"));
		webElement.clear();
		webElement.sendKeys("Military Service");
	}

	@And("I click Upload")
	public void i_click_upload() {
		driver.findElement(By.id("btnSaveAttachment")).click();
	}

	@Then("Verify that Upload is Successful")
	public void verify_that_upload_is_successful() throws InterruptedException {

	}

	@And("Select one item from table and Delete")
	public void select_one_item_from_table_and_delete() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tblAttachments\"]/tbody/tr[3]/td[1]")).click();
		driver.findElement(By.id("btnDeleteAttachment")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
