package lab1;

import java.util.Scanner;

public class Lab1 {
	
	public static double average(int[] arr) {
		
		double sum = 0;	
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		return sum/arr.length;
	}

	public static void main(String[] args) {
		
		System.out.println("hello world.");
		Scanner scan = new Scanner(System.in);
//		System.out.println("enter something: ");
//		String val = scan.nextLine();
//		System.out.println("you entered " + val);
//		scan.close();

		
		int elements = 10;
		int[] input = new int[elements]; 
		for(int i=0; i<elements; i++) {
			
			System.out.print("Enter an Integer: ");
			String val = scan.nextLine();
//			System.out.println("You entered " + val);
			
			
			
			
			try {
				input[i] = Integer.parseInt(val);
			}
			catch (NumberFormatException exception){
				System.out.println("Not a number.");
				i--;
			}
			
			
		}
		
		System.out.println("inputs: ");
		for(int i=0; i<elements; i++) {
			System.out.println("input["+i+"] = "+input[i]);
		}
		
		
		double average = average(input);
		System.out.println("The average is "+ average);
		
		
	}

	

}
