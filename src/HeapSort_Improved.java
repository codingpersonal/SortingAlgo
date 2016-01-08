
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
			
			arr[curr_size] = item;
			curr_size++;
			
			int i = curr_size - 1;
			int temp;
			while(i > 0) {
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
				
				//if only one child is present
				else if(left != -1) {
					if(left < arr[i]) {
						temp = arr[i];
						arr[i] = arr[2* i + 1];
						arr[2 * i + 1] = temp;
					}
					i = 2 * i + 1;
				}
				
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
