
package variable;

import java.util.Scanner;

public class ScannerClass {
	int a;
	double b;

	public double sum() {
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number only int data type");
		a = scan.nextInt();
		System.out.print("enter a number only double"
				+ " data type");
		b = scan.nextDouble();
		double c = (a * b);

		System.out.println(c);
		return c;
	}

	public static void main(String[] args)

	{
		ScannerClass obj = new ScannerClass();

		System.out.println("here's the data");
		System.out.println("enter your marks");
		
		obj.sum();

		// obj.enterMarks();

	}

}
