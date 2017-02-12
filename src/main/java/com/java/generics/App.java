package com.java.generics;

import java.lang.reflect.Array;

/**
 * Hello world!
 *
 */
public class App {

	// create generic method to print the input value
	public static <E> void printNumber(E Number) {

		System.out.println("Input Number is " + Number);
	}

	// create generic method to print the input array
	public static <E> void printArray(E[] inputArray) {

		for (E e : inputArray) {
			System.out.printf("%s ", e);
		}
	}

	public static void main(String[] args) {
		Integer intVal = 5;
		Double doubleVal = 3.14;
		Long longVal = 10304050506L;

		System.out.println("**** Example :: Generic Method **** \n");

		System.out.println("Print Value :: Int");
		printNumber(intVal);

		System.out.println("Print Value :: Double");
		printNumber(doubleVal);

		System.out.println("Print Value :: Long");
		printNumber(longVal);

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Character[] charArray = { 'G', 'E', 'N', 'E', 'R', 'I', 'C', 'S' };

		System.out.println("Print Value :: Int Array");
		printArray(intArray);

		System.out.println("Print Value :: Double Array");
		printArray(doubleArray);

		System.out.println("Print Value :: Character Array");
		printArray(charArray);

		System.out.println("\n**** Example :: Generic Class **** \n");

		// String Object instantiated using Generic Class
		GenericClass<String> genericClass = new GenericClass<>();
		genericClass.setT("Hello World");
		System.out.printf(" %s \n", genericClass.getT());

		
		System.out.println("Example :: Generic Class using RAW Type");
		// RAW Object instantiated using Generic Class
		GenericClass genericRaw = new GenericClass();
		genericRaw.setT("Hello World");
		System.out.printf(" %s ", genericRaw.getT());
		genericRaw.setT(10);  // Also valid due to RAW type Class
		System.out.printf(" %s ", genericRaw.getT());
		
		System.exit(0);
	}
}
