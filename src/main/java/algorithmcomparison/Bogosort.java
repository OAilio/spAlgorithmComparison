package algorithmcomparison;

public class Bogosort {
	/**
	 * Sorts the array using Bogosort 
	 * 
	 * @param arr The unsorted dataset
	 * 
	 * @return sorted The sorted dataset
	 */
	public static int[] bogosort(int[] arr) {
		
		//Clones the array
		int[] sorted = arr.clone();
		
		//Checks if the array is sorted
		//If not shuffles the array again
		while(isSorted(sorted) == false) {
			shuffle(sorted);
		}
		
		return sorted;
	}
	
	/**
	 * Shuffles the array
	 * 
	 * @param a The unsorted array
	 */
	public static void shuffle(int[] a) {
		//Goes through the array and shuffles the elements
		for(int i = 1; i<a.length; i++) {
			swap(a, i, (int) (Math.random()*i));
		}
	}
	
	/**
	 * Swaps two array elements
	 * 
	 * @param a, i, j
	 */
	public static void swap(int[] a, int i, int j) {
		//Swaps the elements
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	/**
	 * Checks if the array is sorted
	 * 
	 * @param a The unsorted or sorted array
	 * 
	 * @return true or false
	 */
	public static boolean isSorted(int[] a) {
		//Goes through the array and checks if it is sorted
		for(int i = 1; i<a.length; i++) {
			if(a[i] < a[i-1]) {
				return false;
			}
		}
		
		return true;
	}
}