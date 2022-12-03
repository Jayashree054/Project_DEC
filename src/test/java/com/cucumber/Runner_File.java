package com.cucumber;

import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// feature file path
		features = "src\\test\\java\\com\\cucumber\\Feature_File.feature", glue = "com.cucumber_Type", // step
		monochrome = true, // it will remove special character in console
		dryRun = false, // check before running
		strict = true, // it will check while running
// tags =("~@run")

		plugin = {

				"html:Report/Cucumber_Report", "pretty", "json:Report/Cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:Report/extent_cucumber.html"

		}

)

public class Runner_File {

	public static WebDriver driver; // -->null

	@org.junit.BeforeClass
	public static void set_up() {

		driver = Base_Class.getbrowser("chrome");

	}

	@org.junit.AfterClass
	public static void tearDown() {

		driver.close();
	}

}
