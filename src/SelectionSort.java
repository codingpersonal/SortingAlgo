/* The best and the worse case time complexity is O(n^2)
 * Even if the list is sorted and there are no swaps,
 * only the smallest number is in beginning.
 * 
 * It is not ensured that the rest of the list is sorted as well.
 * */

public class SelectionSort {
	public void sort_sel(int arr[]) {
		int min;
		int pos;
		
		for(int index = 0; index < arr.length; index++ ) {
			min = arr[index];
			pos = index;
			for(int j = index + 1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			
			int temp = arr[index];
			arr[index] = arr[pos];
			arr[pos] = temp;
		}
	}
}
