package variable;
import java.util.Scanner;
public class Exception {
	
	public static void main(String []args)
	{  
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=scan.nextInt();
		System.out.println("enter the second number");
		
		int b=scan.nextInt();
		
		for(int i=4;i>=1;i--)
		{
			
			try 
			{ System.out.println("the vale is "+ (a/b));
			
			}
			catch(ArithmeticException  e)
			{
				if(i==1)
				{
					System.out.println(" the last chance also over ....ur program is terminated");
				}
				else { System.out.println("re enter the b value ");
					  System.out.println(" the chances u hv is"+(i-1)+" u left");
					  b=scan.nextInt();
					  
				}
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
