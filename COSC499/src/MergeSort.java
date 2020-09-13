/*
 * Callum Takasaka, 16835019
 * COSC 499 Indiv. Assignment - Git Exercise
 * 16/09/2020
 */

// Initializes Integer & String Arrays then sorts in ascending order

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		// our sample arrays which will be sorted
		Integer[] intArray = {7, 3, 8, 1, 2, 0, 6, 5, 4, 9};
		String[] stringArray = {"Steve", "Bulma", "Eelektross", "Zekrom", "Yasuo", "Callum", "Oolong", "Ezreal", "Tracer", "Ramsey"};
		
		// sort an integer array & print result
		mergeSort(intArray, 10);
		System.out.println(Arrays.toString(intArray));
		
		// sort a string array & print result
		mergeSort(stringArray, 10);
		System.out.println(Arrays.toString(stringArray));
	}	
	
	public static void mergeSort(Integer[] unsortedArray, int len) {
		// return if the list is a single item
		if(len < 2) return;
		
		// find the midpoint in the array to split on
		int m = len / 2;
		
		// now create 2 arrays
		Integer[] left = new Integer[m];
		Integer[] right = new Integer[len - m];
		
		// split the original array into the 2 new ones
		for(int i = 0; i < m; i++)
			left[i] = unsortedArray[i];
		for(int i = m; i < len; i++)
			right[i - m] = unsortedArray[i];
		
		// now recurse on the 2 new slices
		mergeSort(left, m);
		mergeSort(right, len - m);
		
		// merge slices
		merge(unsortedArray, left, right, m, len - m);
	}
	
	public static void merge(Integer[] array, Integer[] left, Integer[] right, int leftLen, int rightLen) {
		// index values for the actual merge step
		int i, j, k;
		i = j = k = 0;
		
		// while there are unsorted items in both slices...
		while(i < leftLen && j < rightLen) {
			// if left half contains the smaller number, send to array
			if(left[i] < right[j])
				array[k++] = left[i++];
			// else do the opposite
			else
				array[k++] = right[j++];
		}
		// if there are items left in the front half, throw them into the array
		while(i < leftLen) 
			array[k++] = left[i++];
		// same for right half
		while(j < rightLen - 1)
			array[k++] = right[j++];
	}
	
	public static void mergeSort(String[] unsortedArray, int len) {
		// if the array has a single item, stop recursion
		if(len < 2) return;
		
		//determine midpoint to split array
		int m = len / 2;
		
		// create 2 arrays to split the original into
		String[] left = new String[m];
		String[] right = new String[len - m];
		
		// now populate those 2 slices with the proper values from the original array
		for(int i = 0; i < m; i++)
			left[i] = unsortedArray[i];
		for(int i = m; i < len; i++)
			right[i - m] = unsortedArray[i];
		
		// recurse on the new arrays
		mergeSort(left, m);
		mergeSort(right, len - m);
		
		// merge now-sorted arrays
		merge(unsortedArray, left, right, m, len-m);
	}
	
	public static void merge(String[] array, String[] left, String[] right, int leftLen, int rightLen) {
		// holds the indices for our merge process
		int i, j, k;
		i = j = k = 0;
		
		// compare items in the arrays by their first character & then continuing on
		while(i < leftLen && j < rightLen) {
			// comparing first character
			if((int)left[i].charAt(0) < (int)right[j].charAt(0))
				array[k++] = left[i++];
			else if((int)left[i].charAt(0) > (int)right[j].charAt(0))
				array[k++] = right[j++];
			// comparing second char if first is inconclusive
			else if((int) left[i].charAt(1) < (int)right[i].charAt(1))
				array[k++] = left[i++];
			else if((int) left[i].charAt(1) > (int)right[i].charAt(1))
				array[k++] = right[j++];
		}	
		// now fill the array with any unchecked values
		while(i < leftLen)
			array[k++] = left[i++];
		while(j < rightLen)
			array[k++] = right[j++];
	}
	
}
