package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIntegration {

	public static String[][] readData() throws IOException {
		
		//locate the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./Excel-Data/CreateLead.xlsx");
		//locate the worksheet
		XSSFSheet ws = wb.getSheetAt(0);
		//locate row
		/*
		 *ws.getRow(1)---place the mouse in the first row
		 * XSSFRow row = ws.getRow(1); System.out.println(row); XSSFCell cell =
		 * row.getCell(0); System.out.println(cell);
		 */
		/*
		 * int totalRows = ws.getPhysicalNumberOfRows();
		 * System.out.println("total rows:"+totalRows);
		 */
		
		/*
		 * String stringCellValue = ws.getRow(1).getCell(1).getStringCellValue();
		 * System.out.println(stringCellValue);
		 */
		//rowCount
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		//columnCounnt
		int columnCount = ws.getRow(1).getLastCellNum();
		System.out.println(columnCount);
		
		String [][] data=new String[rowCount][columnCount];
		
		
		//entireData
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
				//System.out.println( stringCellValue2);
				data[i-1][j]=stringCellValue2;
				
			}
			
		}
		wb.close();
		return data;

	}

}
