package com.cucumber_Type;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.cucumber.Runner_File;
import com.pom.File_Reader_Manager;
import com.pom.SDP;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Runner_File.driver;
	public static SDP single = new SDP(driver);

	@Given("^User need  to launch the application$")
	public void user_need_to_launch_the_application() throws Throwable {

		url(File_Reader_Manager.get_InstanceFRM().get_Instance_Reader().get_Url());
		maximize();

	}

//	@When("^User enter the username in username field$")
//	public void user_enter_the_username_in_username_field() throws Throwable {
//		single.getLog().getUsername()
//				.sendKeys(File_Reader_Manager.get_InstanceFRM().get_Instance_Reader().get_Username());
//
//	}
//
//	@When("^User enter Password in password field$")
//	public void user_enter_Password_in_password_field() throws Throwable {
//
//		single.getLog().getPassword()
//				.sendKeys(File_Reader_Manager.get_InstanceFRM().get_Instance_Reader().get_Password());
//
//		// search hotel
//
//	}

	@When("^User enter the username \"([^\"]*)\"in username field$")
	public void user_enter_the_username_in_username_field(String username) throws Throwable {

		single.getLog().getUsername().sendKeys(username);

	}

	@When("^User enter Password \"([^\"]*)\" in password field$")
	public void user_enter_Password_in_password_field(String password) throws Throwable {

		single.getLog().getPassword().sendKeys(password);

	}

	@When("^User need to click on the login button$")
	public void user_need_to_click_on_the_login_button() throws Throwable {
		single.getLog().getLogin().click();

	}

	@Then("^It will navigate to search hotel page$")
	public void it_will_navigate_to_search_hotel_page() throws Throwable {

	}

}
