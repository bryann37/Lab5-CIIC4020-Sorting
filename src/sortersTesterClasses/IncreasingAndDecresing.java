package sortersTesterClasses;

import java.util.Arrays;

import sorterClasses.SelectionSortSorter;

public class IncreasingAndDecresing {
	
	public static void main(String[] args) {
		
		
		Object[] Example = {5,9,20,22,20,5,4,13,17,8,22,1,3,7,11,9,10};
		
		SelectionSortSorter selectionSortObject = new SelectionSortSorter();
		System.out.println("Original Array: " + Arrays.toString(Example));
		selectionSortObject.sort(Example, new IntegerComparator1());
		System.out.println("Array sorted increasing order: " + Arrays.toString(Example));
		selectionSortObject.sort(Example, new IntegerComparator2());
		System.out.println("Array sorted decreasing order: " + Arrays.toString(Example));
			
			
			
		}
	}


