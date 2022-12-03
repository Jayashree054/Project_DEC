package com.testng_Test;

import org.junit.Ignore;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_ng_SA {

	@Test
	public void company() {
		System.out.println("greens");
	}

	@BeforeMethod
	public void emp() {
		System.out.println("raju");

	}

	@BeforeTest
	public void dob() {
		System.out.println("22 jan");
	}

	@BeforeClass
	public void id() {
		System.out.println("2345");

	}

	
	@AfterSuite
	public void salary() {
		System.out.println("34.5");

	}

	public static void main(String[] args) {
		Test_ng_SA s = new Test_ng_SA();
		s.company();
		s.emp();
		s.id();
		s.salary();
	}

}
