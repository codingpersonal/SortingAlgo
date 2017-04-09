/*heap is something with elements with min or max
 * min heap is where parent is smaller than both child
 * max heap is where parent is more than both children.
 * 
 * for a node, its children will be 2x+1 and 2x+2
 * and for a child parent will be x-1/2
 * 
 * also, insertion can be done only at the last leaf node
 * deletion can be done from the root only.
 * 
 * nodes need to be swapped within the heap to make the remaining nodes as a heap.*/

public class HeapSort_Improved {
		int max_size;
		int curr_size;
		public int arr[];
		
		public HeapSort_Improved(int max_size) {
			this.max_size = max_size;
			arr = new int[max_size];
			curr_size = 0;
		}
		
		public void insert(int item) {
			if(curr_size == max_size) {
				System.out.println("No more elements can be inserted in the heap.");
				return;
			}
			
			//insert an element in the end.
			arr[curr_size] = item;
			curr_size++;
			
			int i = curr_size - 1;
			int temp;
			while(i > 0) {
				//check the element with its parent, if it is small, swap it.
				int parent = (i - 1) /2;
				if(arr[i] < arr[parent]) {
					temp = arr[i];
					arr[i] = arr[parent];
					arr[parent] = temp;
					i = parent;
				}
				else {
					break;
				}
			}	
		}
		
		public int delete() {			
			int item = -1;
			
			//delete the root if it exists
			if(curr_size > 0) {
				item = arr[0];
			}
			
			//after removing the root, just swap the last element with the root.
			arr[0] = arr[curr_size - 1];
			curr_size--;
			
			//now heapify the remaining elements
			int i = 0;
			int temp;
			
			while(i < curr_size - 1) {
				int left = -1, right= -1;
				//take out the left and right child value if present
				if(2 * i + 1 < curr_size) {
					left = arr[2 * i + 1];
				}
				
				if(2 * i + 2 < curr_size) {
					right = arr[2 * i + 2];
				}
				
				//if no child is present
				if(left == -1 && right == -1) {
					break;
				}
				
				//if both children are present.
				else if(left != -1 && right != -1) {
					//swap the parent with smallest of its children.
					if(left <= right) {
						temp = arr[i];
						arr[i] = arr[2* i + 1];
						arr[2 * i + 1] = temp;
						i = 2 * i + 1;
					}
					else {
						temp = arr[i];
						arr[i] = arr[2* i + 2];
						arr[2 * i + 2] = temp;
						i = 2 * i + 2;
					}
				}
				
				//if only one child is present, left
				else if(left != -1) {
					if(left < arr[i]) {
						temp = arr[i];
						arr[i] = arr[2* i + 1];
						arr[2 * i + 1] = temp;
					}
					i = 2 * i + 1;
				}
				
				//if only right child is present.
				else {
					if(right < arr[i]) {
						temp = arr[i];
						arr[i] = arr[2* i + 2];
						arr[2 * i + 2] = temp;
					}
					i = 2 * i + 2;
				}
			}	
			
			
			return item;
		}
		
		public void display() {
			for(int i = 0; i < curr_size; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
