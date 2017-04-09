/*Worst case complexity is O(n^2) and best case will be when list is already sorted, then it will be O(n)*/
public class InsertionSort {
	public void insertionSort(int arr[]) {
		for (int index = 1; index < arr.length; index++) {
			//now we need to insert the element at index within the sorted list from 0 to index -1
			for(int j = index; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				} else {
					break;
				}
			}
		}
	}
}
