package com.Maven_PKG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\rjaya\\Ishu\\Maven_PKG\\DD_1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("SRC_data").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("SRC_data").getRow(0).createCell(1).setCellValue("email");

		wb.getSheet("SRC_data").createRow(1).createCell(0).setCellValue("raju");
		wb.getSheet("SRC_data").getRow(1).createCell(1).setCellValue("raju@gamil.com");

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);
		wb.close();
		System.out.println("successfully done");

	}
}
