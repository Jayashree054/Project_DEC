package com.testng_Test;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class Test_ng_TYpe {

	@Test(timeOut = 100)
	public static void company() {
		System.out.println("greens");
	}

	@Test(priority = 1)

	public static void emp() {
		System.out.println("raju");

	}

	@Test(priority = 2, invocationCount = 5)
	public static void dob() {
		System.out.println("22 jan");
	}

	@Ignore
	public static void id() {
		System.out.println("2345");

	}

	@Test(enabled = false)

	public static void salary() {
		System.out.println("34.5");

	}

	public static void main(String[] args) {
		company();
		emp();
		id();
		salary();
	}

}
