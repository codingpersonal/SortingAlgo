/**
 * Worse case time complexity is when the list is all unsorted.
 * it is O(n^2)
 * 
 * Best case is when the list is sorted and you are trying to sort it still
 * Complexity can be O(n) when doing this approach (check swaps)
 */

import java.util.ArrayList;

public class BubbleSort {
	public void sort(int arr[]) {
		boolean swap = false;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					swap = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if(!swap)
				break;
		}
	}
}
