package com.testng_Test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MRetry implements IRetryAnalyzer {

	int count = 0;
	int retry = 2;

	@Override
	public boolean retry(ITestResult result) {

		if (count < retry) {
			count++;
			return true;
		} else {
			return false;
		}

	}

}
