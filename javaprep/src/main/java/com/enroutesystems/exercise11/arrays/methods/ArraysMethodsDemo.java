package com.enroutesystems.exercise11.arrays.methods;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.IntBinaryOperator;

public class ArraysMethodsDemo {

	public static void main(String[] args) {
		
		String[] objArray = { "val1", "val2", "val3" };
		System.out.println("Object array");
		for (String string : objArray) {
			System.out.print( string + ", " );
		}
//		*********************** fILL  **************************
		System.out.println();
		System.out.println();
		int [] primitiveArray = { 8, 9, 4, 1, 6 };
		System.out.println("Primitive array");
		for (int string : primitiveArray) {
			System.out.print( string + ", " );
		}
		
		
//		*********************** fILL  **************************
		System.out.println();
		System.out.println();
		System.out.println("SORT");
		Arrays.sort(primitiveArray);
		for (int string : primitiveArray) {
			System.out.print( string + ", " );
		}
//		*********************** BINARY SEARCH  **************************
		System.out.println();
		System.out.println();
		System.out.println("BINARY SEARCH");
		System.out.println("IN ARRAY " + Arrays.toString(primitiveArray) );
		System.out.println("looking for 6 =" + Arrays.binarySearch(primitiveArray, 4) );
//		*********************** COPY OF  **************************
		System.out.println();
		System.out.println("COPY OF");
		System.out.println("20 spaces are the new length");
		for (int string : Arrays.copyOf(primitiveArray, 20) ) {
			System.out.print( string + ", " );
		}
//		*********************** copyOfRange  **************************
		System.out.println();
		System.out.println();
		System.out.println("copyOfRange");
		System.out.println("Range from 2 to 4 ");
		System.out.println("IN ARRAY " + Arrays.toString(primitiveArray) );
		for (int string : Arrays.copyOfRange(primitiveArray, 2, 4) ) {
			System.out.print( string + ", " );
		}
//		*********************** deepEquals  **************************
		System.out.println();
		System.out.println();
		System.out.println("deepEquals");
		StringBuilder item1 = new StringBuilder("val1");
		StringBuilder item2 = new StringBuilder("val2");
		StringBuilder[] arrDeep1 = {  
				item1 ,
				item2
				};
		System.out.println("Array 1");
		for (StringBuilder stringBuilder : arrDeep1) {
			System.out.print(stringBuilder + ", ") ;
		}
		StringBuilder[] arrDeep2 = {  
				item1 ,
				item2
			};
		
		System.out.println();
		System.out.println("Array 2");
		for (StringBuilder stringBuilder : arrDeep2) {
			System.out.print(stringBuilder + ", ");
		}
		System.out.println();
		System.out.println( "Array 1 & array 2 are deepEqual=" + Arrays.deepEquals(arrDeep1, arrDeep2) );
//		*********************** deepHashCode  **************************
		System.out.println();
		System.out.println("deepHashCode");
		Arrays.deepHashCode(objArray);
		System.out.println( "Array 1 & array 2 are deepHashCodeEqual=" + (Arrays.deepHashCode(arrDeep1) == Arrays.deepHashCode(arrDeep2)) );
//		*********************** deepToString  **************************
		System.out.println();
		System.out.println("deepToString");
		System.out.println( Arrays.deepToString(arrDeep1) );
//		*********************** equals  **************************
		System.out.println();
		System.out.println("equals");
		
		StringBuilder i1 = new StringBuilder("val1");
		StringBuilder i2 = new StringBuilder("val2");
		StringBuilder[] arr1 = {  
				i1 ,
				i2
				};
		System.out.println("Array 1");
		for (StringBuilder stringBuilder : arr1) {
			System.out.print(stringBuilder + ", ") ;
		}
		StringBuilder[] arr2 = {  
				i1 ,
				i2
			};
		
		System.out.println();
		System.out.println("Array 2");
		for (StringBuilder stringBuilder : arr2) {
			System.out.print(stringBuilder + ", ");
		}
		System.out.println();
		System.out.println( Arrays.equals(arr1, arr2) );
		
//		*********************** fILL  **************************
		System.out.println();
		System.out.println("fill");
		String[] newArray = {"val" , "tmp"};
		System.out.println("Values in array " + Arrays.toString(newArray));
		String sameValue = "sameValue";
		
		Arrays.fill(newArray, sameValue);
		for(String i : newArray ) {
			System.out.print(i + ", ");
		}

//		*********************** hashCode  **************************
		System.out.println();
		System.out.println("hashCode");
		StringBuilder[] arrHash1 = {  
				new StringBuilder("val1") ,
				new StringBuilder("val2")
				};
		System.out.println("Array 1");
		for (StringBuilder stringBuilder : arr1) {
			System.out.print(stringBuilder + ", ") ;
		}
		StringBuilder[] arrHash2 = {  
				new StringBuilder("val1") ,
				new StringBuilder("val2")
			};
		
		System.out.println();
		System.out.println("Array 2");
		for (StringBuilder stringBuilder : arr2) {
			System.out.print(stringBuilder + ", ");
		}
		System.out.println();
		System.out.println( "arrHash 1 & arrHash 2 are HashCodeEqual=" + (Arrays.hashCode(arrHash1) == Arrays.hashCode(arrHash2)) );
		
//		*********************** parallelPrefix  **************************
		System.out.println();
		System.out.println("parallelPrefix");
		System.out.println("Array = [1, 2, 3, 4, 5]");
		System.out.println("parallelPrefix from 0 to 3");
		int[] paralArray = {1, 2, 3, 4, 5}; 
		Arrays.parallelPrefix(paralArray, 0, 3, (i, j) ->  { return i + j; }  );
		for (int i : paralArray) {
			System.out.print(i + ", ");
		}
		
//		*********************** parallelSetAll  **************************
		System.out.println();
		System.out.println();
		System.out.println("parallelSetAll");
		System.out.println("Array = [6, 6, 4, 8]");
		int[] parallelSetAll = {6, 6, 4, 8}; 
		Arrays.parallelSetAll(parallelSetAll, i -> { return i*5; });
		for (int i : parallelSetAll) {
			System.out.print(i + ", ");
		}
		
//		*********************** parallelSort  **************************
		System.out.println();
		System.out.println();
		System.out.println("parallelSort");
		System.out.println("Array = [{3, 2, 8, 9, 4, 1]");
		int[] parallelSort = {3, 2, 8, 9, 4, 1}; 
		Arrays.parallelSort(parallelSort);
		for (int i : parallelSort) {
			System.out.print(i + ", ");
		}
		
//		*********************** setAll  **************************
		System.out.println();
		System.out.println();
		System.out.println("setAll");
		System.out.println("Array = [{6, 6, 4, 8}]");
		int[] setAll = {6, 6, 4, 8}; 
		Arrays.setAll(setAll, i -> { return 1 + setAll[i]; });
		for (int i : setAll) {
			System.out.print(i + ", ");
		}
				
//		*********************** spliterator  **************************
		System.out.println();
		System.out.println();
		System.out.println("spliterator");
		int[] array2Split = {6, 6, 4, 8}; 
		Spliterator<Integer> s = Arrays.spliterator(array2Split);
		System.out.println("estimateSize " + s.estimateSize());
		Spliterator<Integer> n1 =  s.trySplit();
		Spliterator<Integer> n2 =  n1.trySplit();
		System.out.println("characteristics " + s.characteristics());
		System.out.println("trySplit " );
		System.out.println("n1" );
		n1.forEachRemaining(System.out::println);
		System.out.println("n2: " );
		n2.forEachRemaining(System.out::println);
			
//		*********************** stream  **************************
		System.out.println();
		System.out.println("stream");
		Arrays.stream(primitiveArray).forEach(System.out::println);
		
//		*********************** toString  **************************
		System.out.println();
		System.out.println("toString");
		System.out.println( Arrays.toString(primitiveArray) );
		
	}

}
