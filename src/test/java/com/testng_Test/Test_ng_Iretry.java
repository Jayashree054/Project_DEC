package com.testng_Test;

import org.junit.Ignore;
import org.testng.annotations.Test;


public class Test_ng_Iretry {

	@Test
	public static void company() throws InterruptedException {
		System.out.println("greens");
	}

	@Test(groups = "emp_details")

	public static void emp() {
		System.out.println("raju");

	}

	@Test(groups = "emp_details")
	public static void dob() {
		System.out.println("22 jan");
	}

	@Test(groups = "Group_1")
	public static void id() {
		System.out.println("2345");

	}

	@Test(timeOut = 1000)
	public static void salary() throws InterruptedException {
		System.out.println("Trying----->");
		Thread.sleep(3000);
		System.out.println("34.5");

	}

	public static void main(String[] args) throws InterruptedException {
		company();
		emp();
		id();
		salary();
	}

}
