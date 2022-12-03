package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class radio_button {
	public static WebDriver driver;
	
	
	@FindBy (id="radiobutton_0")
	private WebElement radio;

	public radio_button(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRadio() {
		return radio;
	}
	
}
