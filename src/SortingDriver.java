
public class SortingDriver {

	public static void main(String[] args) {
		int list[] = {7,1,9,3,0,100,2,4,8,45};
		
		SortingDriver sd = new SortingDriver();
//		BubbleSort bs = new BubbleSort();
		
		System.out.println("Original List is:");
		sd.display(list);
		
//		bs.sort(list);
		
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
		
		Merge m = new Merge();
//		int[] a1 = {1,4,6,10, 23, 30, 211};
//		int[] a2 = {2,20,67,89,99, 200, 201};
//		int[] a3 = m.merge_sorted_arr(a1, 0, a1.length - 1, a2 ,0 , a2.length - 1);
//		sd.display(a3);		

//		System.out.println("\n\nMerged array is:");
//		m.mergeSort(list,0,list.length-1);
//		sd.display(list);
		
//		System.out.println("\n\nQuick sorted array is:");
//		QuickSort qs = new QuickSort();
//		qs.sort_quick(0, list.length - 1, list);
//		sd.display(list);

//		System.out.println("\n\nHeap sorted array is:");
//		HeapSort hs = new HeapSort();
//		hs.heapSort(list);
//		sd.display(list);
		
		System.out.println("\n");
		HeapSort_Improved hp = new HeapSort_Improved(10);
		for(int i = 0; i < list.length; i++) {
			hp.insert(list[i]);
		}
		
		System.out.println("Heaped formed is:");
		sd.display(hp.arr);
		
		System.out.println("\n\nSorted using heap is:");
		int size = hp.curr_size;
		int temp_arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			temp_arr[i] = hp.delete();
		}
		sd.display(temp_arr);
		
	}

	public void display(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
