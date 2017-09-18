package Exercise1Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Exercise1.NumberPlay;
import Exercise1.NumberPlayImplement;
import InputData.ReadExcelData;

public class NumberPlay_SecondLowestTest_Excel {
	
	// List of list to store data from excelsheet
	ArrayList<ArrayList<String>> TestList = new ArrayList<ArrayList<String>>();
	
	@Test
	// convert string to list of integer and get Second Lowest number
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
			System.out.println("Input : "+list.get(1) +", getSecondLowest : " + list.get(3));
			
			// pass int list and expected result to getSecondLowestTest
			getSecondLowestTest(list.get(1), list.get(3));
		}
	}
	
	// 
	public void getSecondLowestTest(String strList, String expectedResultStr){
		
		// convert String to String array 
		String[] strInput = strList.split(",");
		
		//int[] input = new int[strInput.length];
		List<Integer> input = new ArrayList<Integer>();
		
		// Iterate all list element and store it into integer list 
		for(int i = 0; i < strInput.length; i++){
			
			// convert data in Integer and  add to Integer list
			int j = Integer.parseInt(strInput[i]);
			input.add(j);
		}
		
		// Create object of main class
		NumberPlay numberPlay = new NumberPlayImplement();
		
		// Check return is null
		Integer n = numberPlay.getSecondLowest(input);
		
		// if input list have some data 
		//if(input.size() > 0){ 
		if(n != null){
				
			Assert.assertEquals(n.intValue(), Integer.parseInt(expectedResultStr));
		}
		else {
			Assert.assertEquals(n, null);
		}

	}
	
	@BeforeTest
	public void setup() throws IOException{
		ReadExcelData readExcel = new ReadExcelData();
		TestList = readExcel.fetchExcelData();
		
	}
	
}
