import java.util.*;

public class StatsDemo {
	
	public static void main(String args[]){
		BasicData myData = new BasicData();
		Sort mySort = new Sort();
		
		float numbers[] = {1, 3, 5, 6, 7, 4, 3, 5, 5, 5, 6, 9, 9};
		
		myData.calculateMean(numbers);
		
		mySort.bubSort(numbers);
		
		myData.calculateMedian(numbers);
		
		System.out.println(myData.getMedian());
		
		//for(int i = 0; i < numbers.length; i++) {
		//System.out.println(numbers[i]);
		//}
	}//end of main method
}//end of Stats driver class