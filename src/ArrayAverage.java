

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


/**
 * Write a class that will get input from the user through the terminal
 * Only int will be passed in through the terminal. Any other input will likely fail.
 * 
 * This class will put all the ints into an array then average them together.
 * The average will be printed to the console.
 * 
 * @author dustin
 *
 */
public class ArrayAverage {

	/**
	 * The main method will read from the console to first determine the size of the array
	 * 
	 * Then, the main method should cycle through input from the user to populate the array
	 * 
	 * Then, the main method should average the populated array
	 * 
	 * Finally, the main method should print the average
	 * 
	 * @param args
	 */
	
	/**
	 * 	to run from Terminal do this -> from project root: 
     *    [week-2-homework-NadyaIlinskiy]$ java -cp bin ArrayAverage 
     *    cp stands for class path ; bin where the executable files are 
	 *    @author nadya.ilinskaya
	 */
	
	
	public static void main(String[] args) {
		int ArraySize;
		double average = 0;
		int sum = 0;
		
		//Creating a scanner to read input from console
		Scanner console = new Scanner(System.in);
		System.out.println("How many ints to average?");
		ArraySize = console.nextInt();
		
		// TODO -- define an array
		int[] myArray = new int [ArraySize];
				
		// TODO -- write a for loop here to ask the user for input.

		
		
		for(int i=0; i < myArray.length; i++){
			System.out.print("gimme number: ");
			myArray[i] = console.nextInt();
			 sum += myArray[i];
		}
/////////////////////////////////////////	ADDED IN CLASS  ///////////////////////////////////////////////
		
		
//		//passing args from main arguments to print ==> we can use that here instead of Scanner
//		// when run from Terminal - add args : 
//				System.out.println("Printing argument from main method" + Arrays.toString(args)); 
//				int count = 0;
//	 // adding arguments into myArray from args=> 	java -cp bin ArrayAverage 123 // 123 <-args
//				for (String s: args) {
//					myArray[count] = Integer.parseInt(s);// приводит строку к инту
//				}
//		
		
//////////////////////////////////////////////END OF ADDED IN CLASS //////////////////////////////////////////
				
		
		// TODO -- average across the array
		//System.out.println(sum);
		average = IntStream.of(myArray).sum()/ArraySize;  //with IntStream
		System.out.println("myArray avarage is: " + average);
		
		average = sum/ArraySize; // with sum calculated in the loop 
		
		System.out.println("myArray avarage is: " + average);
		
		//Closing the scanner
		console.close();
	}

}

