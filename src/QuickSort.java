
public class QuickSort {
	public void sort_quick(int beg, int end, int arr[]) {
		int size = arr.length;
		if(end <= beg) {
			return;
		}
		int pivot = arr[end];
		int pivotIndex = end;
		for(int i= beg; i <= end; i++) {
			if(arr[i] > pivot) {
				int temp = arr[i];
				arr[i] = arr[pivotIndex];
				arr[pivotIndex] = temp;
				pivotIndex = i;
			}
		}
		
		sort_quick(beg, pivotIndex - 1, arr);
		sort_quick(pivotIndex + 1,  end, arr);
	}
}
