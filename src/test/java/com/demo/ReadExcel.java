package com.demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
public class ReadExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("D:\\TestData1.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("sheet1");
		int indexofrow=sheet.getLastRowNum();
		for(int i=0;i<=indexofrow;i++) {
			for(int j=0;j<=sheet.getRow(i).getLastCellNum()-1;j++) {
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data+" ");
			}System.out.println();
		}
	}

}
