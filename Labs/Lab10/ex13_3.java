
import java.util.ArrayList;

public class ex13_3 {
	
	public static void main(String[] args) {
		
		/**Create a random ArrayList and fill with random digits from 0-200**/
		ArrayList<Number> n = new ArrayList<>(100);
		for(int i = 0; i <= 100; i++) {
			n.add((int)(Math.random() * 200));
		}
		
		/**Run the sort algorithm**/
		sort(n, 0, 100);
		
		/**Print each element**/
		for(int i = 0; i <= 100; i++){
			System.out.println("Element " + i + ": " + n.get(i));
		}
		System.out.println("\n100 Random Elements from 0 to 200 sorted in an ArrayList");
		
	}
	
	/**Run a quicksort algorithm to order the ArrayList**/
	public static void sort(ArrayList<Number> list, int low, int high) {
		int i = low;
		int j = high;
		int pivot = (int) list.get(low + (high - low) / 2); //Setting pivot point
		
		while (i <= j) {
			while ((int)(list.get(i)) < pivot) {
				i++;
			}
			while ((int)(list.get(j)) > pivot) {
				j--;
			}
			if (i <= j) {
				exchange(list, i, j);
				i++;
				j--;
			}
		}
		if(low < j) { //Order lower pivot
			sort(list, low, j);
		}
		if(i < high) { //Order higher pivot
			sort(list, i, high);
		}

	}
	/**Swap two values in ArrayList**/
	private static void exchange(ArrayList<Number> list, int i, int j) {
		int temp = (int) list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
		
}

