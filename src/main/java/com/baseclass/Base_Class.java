package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;// -->null

	public static WebDriver getbrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		return driver;

	}

	public static void url(String url) {
		// TODO Auto-generated method stub
		driver.get(url);

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void minimize(int width, int height) {

		Dimension d = new Dimension(width, height);

		driver.manage().window().setSize(d);

	}

	public static void sendkeys(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void click(WebElement element) {

		element.click();
	}

	public static void screenshot(String location) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File Des = new File(location);
		FileUtils.copyFile(screenshotAs, Des);

	}

	public static void dropdown(WebElement element, String value, String type) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("VisibleText")) {
			s.selectByVisibleText(value);

		} else if (type.equalsIgnoreCase("index")) {

			// String to integer
			int parseInt = Integer.parseInt(value);

			s.selectByIndex(parseInt);

		}

	}
	
	public static void read_data(String path,int sheet, int row_1,int cell_1) throws IOException {
		

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(sheet);

		Row row = sheetAt.getRow(row_1);

		Cell cell = row.getCell(cell_1);

		CellType Type = cell.getCellType();

		if (Type.equals(CellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();
			System.out.println("stringCellValue:" + stringCellValue);

		} else if (Type.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();

			int value = (int) numericCellValue; // downcasting
			System.out.println("numericCellValue:" + value);
		}

		
		wb.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
