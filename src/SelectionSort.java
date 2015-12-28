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
