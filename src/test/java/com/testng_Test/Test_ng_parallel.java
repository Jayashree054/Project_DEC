package com.testng_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_ng_parallel {

	@Test
	public void facebook() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rjaya\\Ishu\\Maven_PKG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void insta() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rjaya\\Ishu\\Maven_PKG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.quit();

	}

}
