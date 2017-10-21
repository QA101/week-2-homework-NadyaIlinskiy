
public class For_loops_coding {

	public static void main(String[] args) {
	
		//FOR LOOPS Coding exercises:
		//
		//Write a program using FOR loop to print following outputs:
		//
		//* * * * * * *
		//* * * * * * *
		//* * * * * * *
		//* * * * * * *
		//
		for (int j = 0; j < 4; j ++) {
			for (int i = 0; i < 7; i ++) {
			System.out.print("* ");
			} 
		System.out.print("\n");
		}
		
		
		//2
		//2 2
		//2 2 2
		//2 2 2 2
		
		for (int j = 0; j < 5; j ++) {
			for (int i = 0; i < j; i ++) {
			System.out.print("2 ");
			}
		System.out.print("\n");
		}
		
		System.out.print("\n");
		
		//$
		//$ $ $
		//$ $ $ $ $
		//$ $ $ $ $ $ $
		
		for (int j = 0; j < 7; j+=2) {
			for (int i = 0; i < j+1; i++) {
			System.out.print("$ ");
			}
		System.out.print("\n");
		}
		
		System.out.print("\n");
		
		//* *
		//* * * *
		//* * * * * *
		//* * * * * * * *
		
		for (int j = 0; j < 9; j+=2) {
			for (int i = 0; i < j; i++) {
			System.out.print("* ");
			}
		System.out.print("\n");
		}
		
		System.out.print("\n");
		
		//1
		//1 2
		//1 2 3
		//1 2 3 4
		
		for (int j = 0; j < 6; j++) {
			for (int i = 1; i < j; i++) {
			System.out.print(i+ " ");
			}
		System.out.print("\n");
		}
		
		System.out.print("\n");
		
		
		//1 2 3
		//1 2 3 4 5
		//1 2 3 4 5 6 7
		
		for (int j = 0; j < 9; j+=2) {
			
			for (int i = 1; i+1 < j; i++) {
			System.out.print(i+ " ");
			}
			
		System.out.print("\n");
		}
		
		System.out.print("\n");
		
		//1 => 1
		//2 2 2 => 3
		//3 3 3 3 3 => 5
		//4 4 4 4 4 4 4 => 7
		//k k k ... k => 2*k-1
		
		for (int j = 1; j <= 4; j++) {
			for (int i = 0; i < 2*j-1; i++) {
			System.out.print(j + " ");
			}
		System.out.print("\n");
		}
		
		

	} // end main

} //end class
