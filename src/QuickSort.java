/*Worst case will be when all elements are sorted and no partitions are possible.
 * complexity will raise to O(n^2)*/
/*Time complexity of the quick sort is O(logn * n)
 * Logn comes from the fact that we do divide into sub lists
 * and do this n number of times till it is finally sorted.
 * 
 * In worse case, when the list is already sorted, it is O(n^2)
 * in every partition, there will be n-1 elements that needs to be sorted
 * one partition will always be 0
 * */


public class QuickSort {
	public void sort_quick(int beg, int end, int arr[]) {
		if (end <= beg) {
			return;
		}
		
		//choose last element as pivot.
		int pivot = arr[end];
		int pivotIndex = end;
		//from beg to end -1 scan and find the location for pivot.
		int t1 = beg;
		int t2 = end - 1;
		int temp;

		//keep on moving till appropriate location is found
		while (t1 < t2) {
			while(arr[t1] <= pivot && t1 < t2) {
				t1++;
			}
			while(arr[t2] > pivot && t2 > t1) {
				t2--;
			}
			
			if(t1 == t2) {
				break;
			}
			else {
				temp = arr[t1];
				arr[t1] = arr[t2];
				arr[t2] = temp;
			}
		}		
		
		//find which element to replace pivot with.
		if(arr[t1] >= pivot) {
			temp = arr[t1];
			arr[t1] = arr[pivotIndex];
			arr[pivotIndex] = temp;
			pivotIndex = t1;
		} else {
			temp = arr[pivotIndex];
			arr[pivotIndex] = arr[t1 + 1];
			arr[t1 + 1] = temp;
			pivotIndex = t1 + 1;
		}
		sort_quick(beg, pivotIndex - 1, arr);
		sort_quick(pivotIndex + 1, end, arr);
	}
}
