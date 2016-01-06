
public class HeapSort {

	public void heapSort(int arr[]) {
		int size = arr.length;
		int j = size - 1;
		makeHeap(arr, j);
		
		while (j > 0) {

			// swap the element at 0 to last element
			int temp = arr[0];
			arr[0] = arr[j];
			arr[j] = temp;
			j--;

			if(j==0)
				break;
			// rearrange the elements to form a heap again
			if(j > 1) {
				makeHeap(arr, j);
			}
			else {
				if(arr[0] < arr[1]) {
					int t = arr[0];
					arr[0] = arr[1];
					arr[1] = t;
				}
			}
		}
	}

	public void makeHeap(int arr[], int end) {
		int size = end + 1;
		boolean swap = false;
		do {
			swap = false;
			int range = (size - 1) / 2;
			
			for (int i = 0; i < range;) {
				int left = arr[2 * i + 1];
				int right = arr[2 * i + 2];
				if (arr[i] >= left && arr[i] >= right) {
					i++;
				} else {
					int max, loc;
					if (left >= right) {
						max = left;
						loc = 2 * i + 1;
					} else {
						max = right;
						loc = 2 * i + 2;
					}

					if (arr[i] < max) {
						// swap the locations
						int temp = arr[i];
						arr[i] = arr[loc];
						arr[loc] = temp;
						swap = true;
					}
				}
			}
		}while(swap);
	}
}
