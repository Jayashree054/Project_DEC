package com.Maven_PKG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Base_Class;
import com.pom.File_Reader_Manager;
import com.pom.SDP;
import com.pom.login;
import com.pom.radio_button;
import com.pom.search_hotel;

public class Runner_file extends Base_Class {

	public static WebDriver driver = Base_Class.getbrowser("chrome");

	public static SDP single = new SDP(driver);

	public static void main(String[] args) throws Throwable {

		url(File_Reader_Manager.get_InstanceFRM().get_Instance_Reader().get_Url());
		maximize();
	
		single.getLog().getUsername()
				.sendKeys(File_Reader_Manager.get_InstanceFRM().get_Instance_Reader().get_Username());
		
		single.getLog().getPassword().sendKeys(File_Reader_Manager.get_InstanceFRM().get_Instance_Reader().get_Password());

		single.getLog().getLogin().click();
		// search hotel

		dropdown(single.getSearch().getLocation(), "New York", "value");

		dropdown(single.getSearch().getHotel(), "Hotel Sunshine", "value");

		dropdown(single.getSearch().getRoom(), "Deluxe", "VisibleText");

		dropdown(single.getSearch().getNum(), "2", "value");

		single.getSearch().getFdate().sendKeys("23/02/2022");

		single.getSearch().getEdate().sendKeys("27/02/2022");

		dropdown(single.getSearch().getAdult(), "2", "value");

		dropdown(single.getSearch().getEdate(), "2", "value");

		single.getSearch().getSearch().click();

		// radio button

		single.getRod().getRadio().click();

	}
}
