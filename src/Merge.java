
public class Merge {
	public int[] merge_sorted_arr(int arr1[], int arr2[], int arr3[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
		}

		// copy the remaining elements from arr1 to arr3
		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}

		// copy the remaining elements from arr2 to arr3
		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}

		return arr3;
	}
	
	// it takes an array and sorts it from beg to end location.
	public void mergeSort(int arr[]) {
		int size = arr.length;
		//terminating condition. If one element is left, just return
		if(size == 1) {
			return;
		}
		else {
			int mid = size / 2;
			
			//copy the first half of array into arr1 from beg to mid
			int arr1[] = new int[mid];
			for(int i = 0; i < mid; i++) {
				arr1[i] = arr[i];
			}
			
			//copy the second part of the array from mid to end in arr2
			int arr2[] = new int[size - mid];
			int j = 0;
			for(int i = mid; i < size; i++, j++) {
				arr2[j] = arr[i];
			}
			
			mergeSort(arr1);
			mergeSort(arr2);
			merge_sorted_arr(arr1,arr2, arr);
		}
	}
}