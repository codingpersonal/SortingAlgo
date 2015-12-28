import java.awt.DisplayMode;
import java.util.ArrayList;

public class SortingDriver {

	public static void main(String[] args) {
		int list[] = { 1,3,6,7,12,34,13,14,89,67,46,54,34};
		
		SortingDriver sd = new SortingDriver();
		BubbleSort bs = new BubbleSort();
		
		System.out.println("Original List is:");
		sd.display(list);
		
		bs.sort(list);
		
		//System.out.println("\nBubble sorted list:");
		//sd.display(list);
		
		SelectionSort ss = new SelectionSort();
		System.out.println("\nSelection sort display:");
		ss.sort_sel(list);
		sd.display(list);

	}

	public void display(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
