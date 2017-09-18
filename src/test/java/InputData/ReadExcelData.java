package InputData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	// ArrayList of String ArrayList to save excel sheet data
	/*** eg:
	TestList: 
	[	
		["MethodName", "Input", "LowestNumber", "SecondLowestNumber"],
		["ValidPositiveData", "3,2,8,5,1,7,4,6", "1", "2"],
		["ValidNegativeData", "4,-3,5,-6,0,1,8", "-6", "-3"]	
	]
	***/
	
	ArrayList<ArrayList<String>> TestList = new ArrayList<ArrayList<String>>();

	public ArrayList<ArrayList<String>> fetchExcelData() throws IOException {

		// Get the Data.xlsx path
		String CurrentDir = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(CurrentDir + "/src/test/resources/Data.xlsx");
		
		//Get the workbook instance for XLS file 
		XSSFWorkbook workbook = new XSSFWorkbook(file);
	
		//Get first sheet from the workbook
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//Get iterator to all the rows in current sheet
		Iterator<Row> rowIterator = sheet.iterator();

		while(rowIterator.hasNext()) {
			Row row = rowIterator.next();
			ArrayList<String> singleTest = new ArrayList<String>();
			
			//For each row, iterate through each columns
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) {
				
				// Fetch cellvalue as string and store in ArrayList
				singleTest.add(cellIterator.next().toString());
			}
			TestList.add(singleTest);
		}
		return TestList;
	} 
}
