package Exercise1Test;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Exercise1.NumberPlay;
import Exercise1.NumberPlayImplement;
import InputData.ReadExcelData;

public class NumberPlay_lowestTest_Excel {
	
	// List of list to store data from excelsheet
	ArrayList<ArrayList<String>> TestList = new ArrayList<ArrayList<String>>();
	
	@Test
	// convert string to list of integer and get Lowest number
	public void getData(){
		// Iterator to find next data
		Iterator<ArrayList<String>> itr = TestList.iterator();
		
		// Get the column title from excel
		itr.next();

		// Store excel data into list
		while(itr.hasNext()){
			
			// List to store column data
			List<String> list = new ArrayList<String>();
			
			// add column data to list
			list.addAll(itr.next());
			
			// break if list is not having any data
			if(list.get(0).equals("")){
				break;
			}
			
			// pass int list and expected result to getLowestTest
			getLowestTest(list.get(1), list.get(2));
		}
	}
	
	public void getLowestTest(String strList, String expectedResultStr){
		
		// convert String to String array 
		String[] strInput = strList.split(",");

		// list to store integers in list
		List<Integer> input = new ArrayList<Integer>();

		// Iterate all list element and store it into integer list 
		for(int i = 0; i < strInput.length; i++){

			// convert data in Integer and  add to Integer list
			int j = Integer.parseInt(strInput[i]);
			input.add(j);
		}
		
		// Create object of main class
		NumberPlay numberPlay = new NumberPlayImplement();
	
		// if input list have some data 
		// if(input.size() > 0){ 
		
		// Check return is null
		Integer n = numberPlay.getLowest(input);
		
		// if input list have some data 
		if(n != null){
			// assert data in int format are equal
			AssertJUnit.assertEquals(n.intValue(), Integer.parseInt(expectedResultStr));
		}
		
		// if input list don't have any data
		else {
			// assert null data are equal
			AssertJUnit.assertEquals(n, null);
		}
	}
	
	
	@BeforeTest
	// BeforeTest, Read data from excel and store in ArrayList
	public void setup() throws IOException{
		
		// Read data from excel
		ReadExcelData readExcel = new ReadExcelData();
		
		// Fetch data from excel and store in List
		TestList = readExcel.fetchExcelData();
		
	}
	

}
