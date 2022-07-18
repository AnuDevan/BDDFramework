package com.bdd.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseClassTestExecution {

	@Given("User launches browser and open a test URL {string}")
	public void user_launches_browser_and_open_a_test_URL(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anuex\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximizing the browser

		driver.get(url); // to open url

	}

	@When("User clicks firstname textbox and enter a value {string}")
	public void user_clicks_firstname_textbox_and_enter_a_value(String fname) {
		WebElement firstname = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		firstname.click();
		firstname.clear();
		firstname.sendKeys(fname);
	}

	@When("User clicks lastname textbox and enter a value {string}")
	public void user_clicks_lastname_textbox_and_enter_a_value(String lname) {
		WebElement lastname = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		lastname.click();
		lastname.clear();
		lastname.sendKeys(lname);

	}

	@When("User click Address textbox and enter a value {string}")
	public void user_click_Address_textbox_and_enter_a_value(String adress) throws InterruptedException {
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		Thread.sleep(2000);
		address.click();
		address.clear();
		address.sendKeys(adress);

	}

	@When("User click email testbox and enter a value {string}")
	public void user_click_email_testbox_and_enter_a_value(String emaill) {

		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.click();
		email.clear();
		email.sendKeys(emaill);
	}

	@When("User click phoneNumber textbox and enter  value {string}")
	public void user_click_phoneNumber_textbox_and_enter_value(String phoneNum) {
		WebElement phoneNo = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phoneNo.click();
		phoneNo.clear();
		phoneNo.sendKeys(phoneNum);

	}

	@When("User click {string} radiobutton")
	public void user_click_radiobutton(String radio) {

		WebElement phoneNo = driver.findElement(By.xpath("//input[@value='" + radio + "']"));
		phoneNo.click();

	}

	@Then("User validates Male radiobutton is selected or not")
	public void user_validates_Male_radiobutton_is_selected_or_not() {
		WebElement phoneNo = driver.findElement(By.xpath("//input[@value='Male']"));
		if (phoneNo.isSelected()) {
			System.out.println("Male is selected");
		} else {
			System.out.println("Female is selected");
		}

	}

	@When("User clicks movie checkbox")
	public void user_clicks_movie_checkbox() {
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='Movies']"));
		checkBox.click();
	}

	@Then("User validates movie checkbox is checked")
	public void user_validates_movie_checkbox_is_checked() {
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@value='Movies']"));
		if (checkBox1.isSelected()) {
			System.out.println("Movies is selected");
		} else {
			System.out.println("Movies is not selected");
		}
	}


	/*
	 * @When("User clicks languages textbox and selects English as a language")
	 * public void user_clicks_languages_textbox_and_selects_English_as_a_language()
	 * { WebElement languagebox= driver.findElement(By.xpath("//div[@id='msdd']"));
	 * Select select = new Select(languagebox);
	 * select.selectByVisibleText("English"); }
	 */



	@When("User clicks and select C as a skills")
	public void user_clicks_and_select_C_as_a_skills() {

		WebElement skillsbox = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));

		Select select = new Select(skillsbox);
		select.selectByVisibleText("C");


	}
	
	@When("User enters date of birth")
	public void user_enters_date_of_birth() {

		WebElement date = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select select = new Select(date);
		select.selectByVisibleText("1918");

		WebElement month = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select select1 = new Select(month);
		select1.selectByVisibleText("March");


		WebElement day = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		Select select2 = new Select(day);
		select2.selectByVisibleText("23");
	}
	@When("User enters the password")
	public void user_enters_the_password() {
		WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		password.click();
		password.sendKeys("a@an@njaga");
	}
	@When("User enters confirm passsword")
	public void user_enters_confirm_passsword() {
		WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		confirmpassword.click();
		confirmpassword.sendKeys("a@an@njaga");
	}
	@When("User enters submit button")
	public void user_enters_submit_button() {
		WebElement submitbutton = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		submitbutton.click();
	
	}
	//span[@role='combobox']
}



