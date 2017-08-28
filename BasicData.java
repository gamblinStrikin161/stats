import java.util.*;
import java.math.*;

public class BasicData {
	private float mean;			//field to store the mean
	private float median;		//field to store the median
	private float mode;			//field to store the mode
	
	/**
	 * This no-arg constructor will initiate the fields to zero 
	 */
	public BasicData(){
		mean = 0;
		median = 0;
		mode = 0;
	}
	
	/**
	 * This constructor will initiate the fields with the assigned values passed by the user
	 */
	public BasicData(float m, float med, float mod){
		mean = m;
		median = med;
		mode = mod;
	}
	
	/**
	 * This method will accept an array of numbers and will sum them up, divide them by
	 * the number of values in the array and return the result as a float
	 * 
	 * @param: An array of numbers as floats
	 * @return: None
	 * @throws: Nothing is implemented
	 */
	public void calculateMean(float nums[]){
		float sum = 0;		//initializing the accumulator to zero
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];			//getting all the values from the array and adding them
		}
		mean = sum / nums.length;
	}//end of calculateMean method
	
	/**
	 * This method will accept an array of numbers and will sum them up, divide them by
	 * the number of values in the array and return the result as a float
	 * 
	 * @param: None
	 * @return: The average of all the numbers in the array as a float
	 * @throws: Nothing is implemented
	 */
	public float getMean(){
		return mean;		//returning the average of all the numbers
	}
	
	/**
	 * This method accepts an array of float values and sorts them
	 * from low to high
	 * @param: An array of numbers as floats
	 * @return: None
	 * @throws: Nothing is implemented
	 */
	public void sortNums(float nums[]){
		int n = nums.length;		//This is for looks
		float temp = 0;				//this will hold the value of an array number
		
		for(int i = 0; i < n; ++i){			
			for(int j = 1; j < (n - i); j++){
				if(nums[j-1] > nums[j]){   //Compare array[0] & array[1]
					temp = nums[j-1];	   //If array[0] > array [1] swap it
					nums[j-1] = nums[j];   //Repeat the same steps for array[1] to array[n-1]
					nums[j] = temp;		  
				}//end of if statement
			}//end of 'j' for loop
		}//end of 'i' for loop
	}//end of calculateMode method
	
	/**
	 * This method accepts an array of values sorted in low-high order.
	 * It then calculates the median of those values based on whether the array
	 * is an even or odd quantity of numbers.
	 * @param: A sorted array of float values
	 * @return: none
	 * @throws: Nothing is implemented
	 */
	public void calculateMedian(float n[]){
		if(n.length % 2 == 0) {
			median = n[n.length / 2] + n[(n.length / 2) + 1];
		}
		else
			median = n[(n.length / 2) + 1];
	}//end of calculateMedian method
	
	/**
	 * This method will return the calculated median
	 * 
	 * @param: None
	 * @return: The median of all the numbers in the array as a float
	 * @throws: Nothing is implemented
	 */
	public float getMedian(){
		return median;
	}//end of getMedian method
	
}//end of class BasicData
