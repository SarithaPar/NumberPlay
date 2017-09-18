package Exercise1;

import java.util.List;

import org.testng.Reporter;

public class NumberPlayImplement implements NumberPlay {

	public Integer getLowest(List<Integer> list) {
		// set Integer max_value as least
		int lowest = Integer.MAX_VALUE;

		// If list is empty, return null
		if(list.isEmpty())
			return null;

		// Iterate each element of list and save lowest data 
		for(int i = 0; i < list.size(); i++){
			
			// if list is null, return null
			if(list.get(i) == null) 
				return null;
			
			if(list.get(i) < lowest)	
				lowest = list.get(i);
		}	
		Reporter.log("Input : "+ list+ ", Lowest : "+  lowest);
		
		// return the lowest value
		return lowest;
	}

	public Integer getSecondLowest(List<Integer> list) {
		
		// if list is empty, return null
		if(list.isEmpty())
			return null;
		
		// if list having only 1 element, return null as second lowest element
		if(list.size() == 1)
			return null;
		
		// set Max integer as lowest and second lowest 
		int lowest = Integer.MAX_VALUE;
		int secondLowest = Integer.MAX_VALUE;
		
		// Iterate each element of list 
		for(int i = 0; i < list.size(); i++){
			
			// if element is lower than the lowest, then mark it as lowest and replace existing lowest as second lowest
			if(list.get(i) < lowest){
				secondLowest = lowest;
				lowest = list.get(i);
			} 
			// if element is lower than secondLowest, then mark it as secondLowest
			else if(list.get(i) < secondLowest){
				secondLowest = list.get(i);
			}
		}
		
		// If secondLowest is the first element of list or secondElement is same as lowest
		if((secondLowest == list.get(0))  && (secondLowest == lowest)){
			
			// mark index[1] as secondLowest
			secondLowest = list.get(1);
			
			// Iterate each element of list to find the element lower than secondLowest
			for(int i = 1; i < list.size(); i++){
				if(list.get(i) < secondLowest){
					secondLowest = list.get(i);
				}
			}
		}
		
		Reporter.log("Input : "+ list+ ", Second Lowest : "+  secondLowest);
		
		// Return secondLowest
		return secondLowest;
	}

}
