package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 6, 0 };
		int temp = 0;		
		
		for (int i = 0; i < arr.length; i++) {			
			for (int z = 0; z < arr.length-1; z++) {
				if (arr[z] > arr[z+1]) {
					temp = arr[z];
					arr[z] = arr[z+1];					
					arr[z+1] = temp;
				}				
				System.out.println(Arrays.toString(arr));
			}
			System.out.println();
		}
	}
}