/*
 * Callum Takasaka, 16835019
 * COSC 499 Indiv. Assignment - Git Exercise
 * 16/09/2020
 */

// Initializes Integer & String Arrays then sorts in ascending order

public class MergeSort {
	public static void main(String[] args) {
		// our sample arrays which will be sorted
		Integer[] intArray = {7, 3, 8, 1, 2, 0, 6, 5, 4, 9};
		String[] stringArray = {"Steve", "Bulma", "Eelektross", "Zekrom", "Yasuo", "Callum", "Oolong", "Ezreal", "Tracer", "Ramsey"};
		
		// sort an integer array
		mergeSort(intArray);
		
		// sort a string array
		mergeSort(stringArray);
	}	
	
	public static void mergeSort(Integer[] unsortedArray) {
		System.out.println("Sorting... *beep boop*");
	}
	
	public static void mergeSort(String[] unsortedArray) {
		System.out.println("Sorting... *boop beep*");
	}
}
