package com.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class Test_Data_Reader {

	public static Properties p; // --->null

	public Test_Data_Reader() throws Throwable, IOException {

		File f = new File("C:\\Users\\rjaya\\Ishu\\Maven_PKG\\src\\main\\java\\com\\pom\\Test_Data.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}

	public String get_Url() {

		String browser_1 = p.getProperty("browser");

		return browser_1;
	}

	public String get_Username() {

		String property = p.getProperty("username");
		return property;
	}

	public String get_Password() {

		String password = p.getProperty("password");
		return password;
	}
}
