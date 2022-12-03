package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SDP {

	public static WebDriver driver; /// --->null

//	public static login log = new login(driver); ///------pom
//	public static search_hotel search = new search_hotel(driver);///------pom
//	public static radio_button rod = new radio_button(driver);///------pom

	// sdp---collection of object
	private login log;

	private search_hotel search;

	private radio_button rod;

	public SDP(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public login getLog() {
		log = new login(driver);
		return log;
	}

	public search_hotel getSearch() {
		search = new search_hotel(driver);
		return search;
	}

	public radio_button getRod() {
		rod = new radio_button(driver);
		return rod;
	}

}
