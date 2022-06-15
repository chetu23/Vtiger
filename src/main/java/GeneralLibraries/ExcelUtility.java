package GeneralLibraries;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * @author chetan
	 * This method is used to fetch data from excel
	 * @throws Throwable 
	 * 
	 */

	public String getCellValue(String sheetName,int rowNum,int cellNum) throws Throwable {
		FileInputStream fis=new FileInputStream(IConstants.excelPath);
		Workbook workbook=WorkbookFactory.create(fis);
		DataFormatter format = new DataFormatter();
		return format.formatCellValue(workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
		}
	public String getCellValues(String sheetName1,int rowNum1,int cellNum1) throws Throwable {
		FileInputStream fis=new FileInputStream(IConstants.excelPath);
		Workbook workbook=WorkbookFactory.create(fis);
		String cellvalue = workbook.getSheet(sheetName1).getRow(rowNum1).getCell(cellNum1).toString();
		return cellvalue;
		
	}
	   /**
	    *   its used to read the data from Excel-Workbook based on below 
	    * @param sheetName
	    * @param rowNum
	    * @param celNum
	    * @return String data

	 * @throws Throwable
	    */
		

		public String getExcelData(String sheetName , int rowNum , int celNum) throws Throwable  {
			FileInputStream fis = new FileInputStream(IConstants.excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowNum);
			String data = row.getCell(celNum).getStringCellValue();
			return data;	
		}
		/**
		 * used to get the last used row number on specified Sheet
		 * @param sheetName
		 * @return
		 * @throws Throwable
		 */
		public int getRowCount(String sheetName) throws Throwable {
			FileInputStream fis  = new FileInputStream(IConstants.excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			wb.close();
			return sh.getLastRowNum();
		}
		/**
		 * used to write data back to Excel based on below parameter
		 * @param sheetName
		 * @param rowNum
		 * @param celNum
		 * @param data
		 * @throws Throwable
		 */
		public void setDataExcel(String sheetName , int rowNum, int celNum ,String data) throws Throwable {
			FileInputStream fis  = new FileInputStream(IConstants.excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowNum);
			Cell cel = row.createCell(celNum);
			cel.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(IConstants.excelPath);
			wb.write(fos);
			wb.close();
			
		}


}
