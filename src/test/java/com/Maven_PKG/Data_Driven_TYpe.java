package com.Maven_PKG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_TYpe {

	public static void main(String[] args) throws IOException   {

		File f = new File("C:\\Users\\rjaya\\Ishu\\Maven_PKG\\DD_1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(2);

		Cell cell = row.getCell(2);

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
