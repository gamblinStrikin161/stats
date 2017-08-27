import java.util.*;

public class statsDemo {
	public static void main(String args[]){
		BasicData myData = new BasicData();
		
		float numbers[] = {1, 3, 5, 6, 7, 4, 3, 5, 5, 5, 6, 9, 9};
		
		myData.calculateMean(numbers);
		
		float flow;
		
		flow = myData.getMean();
		
		myData.sortNums(numbers);
		
		for(int i=0; i < numbers.length; i++){
		System.out.println(numbers[i]);
		}
	}
}