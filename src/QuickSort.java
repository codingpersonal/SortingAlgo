
public class QuickSort {
	public void sort_quick(int beg, int end, int arr[]) {
		if (end <= beg) {
			return;
		}
		int pivot = arr[end];
		int pivotIndex = end;
		int t1 = beg;
		int t2 = end - 1;
		int temp;

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
