import java.util.Arrays;

public class Advanced_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1)Write a program which takes as input 1D- array and finds maximum number , it’s
//		index value.
		int[] myArray = {-1, -4, -27, -5, 2, -16, -17};
		
		int max = myArray[0];
		int index = 0;
		
		for (int i = 0; i< myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
				index = i;
		 	}
			
		}
		System.out.println("Task 1. Maximum number is: " + max+"; index is: " + index);
		
//
//		2)Write a program which takes as input 1D- array and finds minimum number, it’s
//		index value.
//
		
		int min = myArray[0];
		int index2 = 0;
		
		for (int i = 0; i< myArray.length; i++) {	
		 if (myArray[i] < min) {
				min = myArray[i];
				index2 = i;
		 	}
			
		}
		System.out.println("Task 2. Minimum number is: " + min+"; index is: " + index2);
		
		
//		3) Write a program which takes as input 2D- array and finds maximum number , it's
//		index value.
		
//		XXXXX
//		XXXXX
//		XXXXX
		
			double[][] my2Array = new double[][]{
				  { 1.2, 1.5, 2.0, 4.6, 7.0},
				  { 0, 0, 14.7, 2.25, 5.0 },
				  { 13.3, -77.9, 18.4, -9.32, 12.6}
				  };
				 
			
			double max3 = my2Array[0][0];
			int index3[] = new int [2];
			for (int i = 0; i < my2Array.length; i++) {
		        for (int j = 0; j < my2Array[i].length; j++) {
		        	       if (my2Array[i][j] > max3) {
		 					max3 = my2Array[i][j];
		 					index3[0] = i;
		 					index3[1] = j;
		 					}
		        	       
		 		}
			}
			
	        System.out.print ("Task 3. Maximum number is: "+ max3 + "; ");
	        System.out.println ("index is: "+ Arrays.toString(index3));
			
		
//
//		4) Write a program which takes as input 2D- array and finds minimum number, it's
//		index value.
	        
	        double min4 = my2Array[0][0];
			int index4[] = new int [2];
			for (int i = 0; i < my2Array.length; i++) {
		        for (int j = 0; j < my2Array[i].length; j++) {
		        	       if (my2Array[i][j] < min4) {
		 					min4 = my2Array[i][j];
		 					index4[0] = i;
		 					index4[1] = j;
		 					}
		        	       
		 		}
			}
	        
			  System.out.print ("Task 4. Minimum number is: " +min4+ "; ");
		      System.out.println ("index is: "+ Arrays.toString(index4));
				   
	        
//
//		5) Write a program which takes as input 1D- array and reverse an array.
		      
		      for (int i = 0; i< myArray.length/2; i++) {	
		 	     int temp = myArray[i];
		 	     myArray[i] = myArray[myArray.length-i-1];
		 	     myArray[myArray.length-i-1]=temp;
		 			
		 		}
		      
		      System.out.println ("Task 5. "+ Arrays.toString(myArray));
				
		      
//
//		6) 
//		6.1 Write a program which takes as input two 1D- array and find the sum of two
//		array and store results in new array.
 
		      int [] a = {1,2,3,4};
		      int [] b = {10,20,30,40};
		      int [] absum = new int [4];
		
		      for (int i = 0; i< a.length; i++) {	
		    	  		absum[i] = a[i]+b[i];
			
		      }
		      
		      System.out.println ("Task 6.1. "+ Arrays.toString(absum));
				
//
//
//		6.2 Write a program which takes as input two 1D- array and find the difference of
//		two array and store results in new array.
//		Example: input : int [] a ={1,2,3,4};
//		int[] b = {10,20,30,40};
//		output : int [] c = {-9,- 18, -27,- 36};
		      
		      int [] abdiff = new int [4];
		      
		      for (int i = 0; i< a.length; i++) {	
	    	  		abdiff[i] = a[i]-b[i];
		
		      }
		      
		      System.out.println ("Task 6.2. "+ Arrays.toString(abdiff));
				
		      
//
//		7) Write a program which takes as input 1D- array and prints even numbers in the
//		array.
		      System.out.print ("Task 7. ");
		      
		      int ifeven = 0;
		      for (int i = 0; i< myArray.length; i++) {	
	    	  		if (myArray[i] % 2 == 0) {
	    	  			ifeven = myArray[i];
	    	  			System.out.print (ifeven + "; " );
	    	  		}
		
		      }
		      System.out.println(); 
		      
//
//		8) Write a program which takes as input 1D- array and prints odd numbers in the
//		array.
//
		      System.out.print ("Task 8. ");
		      
		      int ifodd = 0;
		      for (int i = 0; i< myArray.length; i++) {	
	    	  		if (myArray[i] % 2 != 0) {
	    	  			ifodd = myArray[i];
	    	  			System.out.print (ifodd + "; " );
	    	  		}
		
		      }
		      System.out.println(); 
		      
//		9) Write a program which takes as input 1D- array and prints positive numbers in
//		the array.
		      
		      System.out.print ("Task 9. ");
		      
		      int ifpositive = 0;
		      for (int i = 0; i< myArray.length; i++) {	
	    	  		if (myArray[i] > 0) {
	    	  			ifpositive = myArray[i];
	    	  			System.out.print (ifpositive + "; " );
	    	  		}
		
		      }
		      System.out.println(); 
		      
//
//		10) Write a program which takes as input 1D- array and prints negative numbers
//		in the array.
		      
		      System.out.print ("Task 10. ");
		      
		      int ifnegative = 0;
		      for (int i = 0; i< myArray.length; i++) {	
	    	  		if (myArray[i] < 0) {
	    	  			ifnegative = myArray[i];
	    	  			System.out.print (ifnegative + "; " );
	    	  		}
		
		      }
		      
		      System.out.println(); 
		      
//
//		11) Write a program which takes as input 1D- array which contains first 25
//		numbers and prints prime numbers in the array.
//		prime nos: divisible by itself. Examples are 2, 3, 5, 7, 11,13, 17,19, 23.
		
		       int numbers[] = new int[25]; 
		       
		       for (int i = 0; i < numbers.length; i++){
		    	    numbers[i]=i+1;
		       }
		       
		       System.out.println ("Task 11. Array of numbers 1-25: "+ Arrays.toString(numbers));
		       System.out.print ("Prime numbers in the array: ");
		       for (int i = 0; i < numbers.length; i++){
		    	   		
		    	   		int dev = 2;	
		    	   		boolean flag = false;
		    	   		while (dev <= (int)Math.sqrt(numbers[i])) {
		    	   			if (numbers[i] % dev == 0) {
		    	   				flag = true;
		    	   				break;
		    	   			}
		    	   			dev++;
		    	   		} 
		    	   		if (!flag) {
		    	   			System.out.print (numbers[i] + "; " );
		    	   		}
		    	   
		       }
		      
		
		      

	} // end main

}// end class
