package variable;

import java.util.Scanner;

public class loopDemo {
	
	int num;
	
	Scanner scan=new Scanner(System.in);
	

	public static void main(String[] args) {
		loopDemo obj=new loopDemo();
		obj.userInput();
		obj.checkEvenOdd();
		
		
		
		 
		 
		
	}

	private void checkEvenOdd() {
		if(num%2==0) 
			System.out.println("even number----->"+ num);
		else
			System.out.println("odd number----->"+ num);
	}

	private  void userInput() {
		System.out.println("enter a number??");
		
		 num=scan.nextInt();
		 
		 
		
		
		 
	}

}
