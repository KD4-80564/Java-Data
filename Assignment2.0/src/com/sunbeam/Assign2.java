//2. A generic sort method for implementing selection sort algorithm is given below. In main(), create array of Double and sort it by calling selectionSort(


package com.sunbeam;

import java.util.Comparator;

 class Assign2
{
	static <T> void selectionSort(T[] arr, Comparator<T> c) 
	{
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		
		}
		}
	}
		public static void main(String args[])
		{
		Double[] arr1= {22.11, 11.22,3.44,55.55};
		Comparator<Double> doubleComparator =(a,b) -> Double.compare(a,b);
		selectionSort(arr1,doubleComparator);

		for(Double ele: arr1)
		{
		System.out.println("After Sorting"+ele);
		}
		}
}
