package com.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	public static WebDriver driver; // ---null

	// WebElement email =
	// driver.findElement(By.cssSelector("input[type='text'][name='email']"));
	// WebElement password =
	// driver.findElement(By.xpath("//input[@type='text']/following::input[1]"));
	// WebElement login = driver.findElement(By.id("loginbutton"));

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(xpath = "//input[@type='text']/following::input[1]")
	private WebElement password;

	@FindBy(id = "loginbutton")
	private WebElement login;

	public login_page(WebDriver driver2) {

	this.driver= driver2;
	
	PageFactory.initElements(driver2, this);
	
	}

	

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
