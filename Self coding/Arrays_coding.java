import java.util.Arrays;

//ARRAYS

public class Arrays_coding {

	public static void main(String[] args) {
		
		//1) Write a program, which takes an input as Integers of arrays, and print them.
		//EX: input : int[] a ={1,2,3,4};
		//Output:
		//a [0] = 1
		//a[1] =2
		//a[2] =3
		//a[3] = 4
		
		int[] data = {1, 2, 3, 4};
		
		System.out.println("Task 1 result: \n");
		
	
		for (int i = 0; i < data.length; i++) 
		{
			System.out.println("data["+i+"] = "+ data[i]);
			
		}
		
		
		//2) Write a program which takes an input as Integers of arrays and prints in reverse
		//order
		//EX: input : int[] a ={1,2,3,4};
		//Output:
		//a [0] = 4
		//a[1] =3
		//a[2] =2
		//a[3] = 1
		
		System.out.print("\n\n");
		System.out.println("Task 2 result: \n");
		
		for (int i = data.length -1; i >= 0; i--) 
		{
			 System.out.println("data["+i+"] = "+ data[i]);
			
		} 
		
		System.out.print("\n\n");
		System.out.println("Task 3 result: \n");
		
		//3) Write a program which takes an input as Integers of arrays and it finds product
		//of all arrays.
		//EX: input : int[] a ={1,2,3,4};
		//Output: 1*2*3*4 = 24 
		
		int product = 1;
		for (int i = 0; i < data.length; i++) 
		{
			product *= data[i];
		
			if (i != 0) {
				System.out.print(" * ");
			}
			
			System.out.print(data[i]);
		} 
		
		System.out.print(" = " + product);
	
		
		//4) Write a program which takes an input as doubles of arrays and print them.
		//EX: input: double[] a ={1.2, 2.5, 3.8, -12};
		//Output:
		//a [0] = 1.2
		//a[1] =2.5
		//a[2] =3.8
		//a[3] = -12 
		
		System.out.print("\n\n");
		System.out.println("Task 4 result: \n");
		
		double [] data2 = {1.2, -20, 3.89, 400.0};
		
		for (int i = 0; i < data2.length; i++) 
		{
			System.out.println("data2["+i+"] = "+ data2[i]);
			
		}
		
		//5) Write a program which takes an input as doubles of arrays and prints in reverse
		//order
		//EX: input: double[] a ={1.2, -20, 3.89, 400.0};
		//Output:
		//a [0] = 400.0
		//a[1] =3.89
		//a[2] = -20
		//a[3] = 1.2
		
		System.out.print("\n\n");
		System.out.println("Task 5 result: \n");
		
		for (int i = data2.length -1; i >= 0; i--) 
		{
			 System.out.println("data2["+i+"] = "+ data2[i]);
			
		} 
		
		//
		//6) Write a program which takes an input as doubles of arrays and it finds product
		//of all arrays.
		//EX: input : double[] a ={1.0, 2.0, 3.89, 4.78};
		//Output: 1.0*2.0*3.89* 4.78= 37.1884
		
		
		System.out.print("\n\n");
		System.out.println("Task 6 result: \n");
		
		double product2 = 1;
		for (int i = 0; i < data2.length; i++) 
		{
			product2 *= data2[i];
		
			if (i != 0) {
				System.out.print(" * ");
			}
			
			System.out.print(data2[i]);
		} 
		
		System.out.print(" = " + product2);
		
		//7) Write a program which takes an input as doubles of arrays and it finds average
		//of all arrays.
		
		System.out.print("\n\n");
		System.out.println("Task 7 result: \n"); 
		
		double sum = 0;
		for (int i = 0; i < data2.length; i++) 
		{
			sum += data2[i];
		
		} 
		
		System.out.print(sum/data2.length);
		

	} // end main
	
} //end class
