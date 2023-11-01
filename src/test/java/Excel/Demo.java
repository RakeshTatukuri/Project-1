package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
	@Test(dataProvider="credentialssupplier")
	
	public void loginTest(String username,String password) {
		System.out.println(username+"---"+password);
	}
	
	
	@DataProvider(name="credentialssupplier")
	public Object[][] datasupplier() throws IOException {
		//File excelfile=new File (System.getProperty("user.dir")+"Login.xlsx.xlsx");
		//FileInputStream fis=new FileInputStream("excelfile");
		FileInputStream fis=new FileInputStream("D:\\\\TestData1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rowcount=sheet.getLastRowNum();
		int columncount=sheet.getRow(0).getLastCellNum();
		Object[][] data=new Object[rowcount][columncount];
		for(int r=0;r<rowcount;r++) {
			XSSFRow row=sheet.getRow(r+1);
			for(int c=0;c<columncount;c++) {
			XSSFCell cell=row.getCell(c);
			CellType cellType=cell.getCellType();
			switch(cellType) {
			case STRING:
				data[r][c]=cell.getStringCellValue();
				break;
			case NUMERIC:
				data[r][c]=Integer.toString((int)cell.getNumericCellValue());
				break;
			case BOOLEAN:
				data[r][c]=cell.getBooleanCellValue();
				break;
				
			}
		  }
		
		}
			return data;	
	}
}
