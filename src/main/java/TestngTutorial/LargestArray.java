package TestngTutorial;

public class LargestArray {

	public static void main(String [] args) {
		
		int arr [] = {5,2,4,6,8};
		int largestNum = arr[0];
		
		  for (int i = 0; i < arr.length; i++) {  
	            //Compare elements of array with max  
	           if(arr[i] >largestNum)  
	        	   largestNum = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + largestNum);  
	    }  
	}  
		
	
	


