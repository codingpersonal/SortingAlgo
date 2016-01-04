
public class SortingDriver {

	public static void main(String[] args) {
		int list[] = { 1,67,46,12,90, 15,8,4,54,34, 5, 2, 7, 1};
		
		SortingDriver sd = new SortingDriver();
		BubbleSort bs = new BubbleSort();
		
		System.out.println("Original List is:");
		sd.display(list);
		
		bs.sort(list);
		
		//System.out.println("\nBubble sorted list:");
		//sd.display(list);
		
//		SelectionSort ss = new SelectionSort();
//		System.out.println("\nSelection sort display:");
//		ss.sort_sel(list);
//		sd.display(list);
		
//		InsertionSort is = new InsertionSort();
//		System.out.println("\nSorted list is:");
//		is.insertionSort(list);
//		sd.display(list);
		
//		Merge m = new Merge();
//		int[] a1 = {1,4,6,10, 23, 30, 211};
//		int[] a2 = {2,20,67,89,99, 200, 201};
//		int[] a3 = m.merge_sorted_arr(a1, a2);
//		
//
//		System.out.println("\n\nMerged array is:");
//		m.mergeSort(list);
//		sd.display(list);
		
		System.out.println("\n\nQuick sorted array is:");
		QuickSort qs = new QuickSort();
		qs.sort_quick(0, list.length - 1, list);
		sd.display(list);

	}

	public void display(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
