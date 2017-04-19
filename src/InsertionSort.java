/*Worst case complexity is O(n^2) and 
 * best case will be when list is already sorted, then it will be O(n)*/

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
	
	
	//the code below is same with minor loop changes. works same!
	public static void main(String args[]) {
		int arr[] = {3,1,2,6,4,5,9,1,2,3};
		for(int i = 1; i < arr.length; i++) {
			int pos = i;
			for(int j = i - 1; j >= 0; j--) {
				if(arr[j] > arr[pos]) {
					int temp = arr[j];
					arr[j] = arr[pos];
					arr[pos] = temp;
					pos = j;
				} else 
					break;
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
