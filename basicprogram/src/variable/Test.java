package variable;
import java.util.Scanner;
public class Test 
	
	{
		public static void main(String[] args) 
		{  Scanner scan=new Scanner(System.in);
	  
	  System.out.println(" enter ur name");

	  String name =  scan.next();
	  System.out.println("enter the number");
	    int i=scan.nextInt();

for(int s=1;s<=4;s++)
{
	
try
{  System.out.println("enter the num properly!!");
	System.out.println( name.charAt(i));
}
		
	catch(StringIndexOutOfBoundsException a)
{
		if(s==4)
		{
			System.out.println("last chance over ur program is terminated tq");
		}
		else {
			System.out.println("enter the value againn");
			System.out.println("here's ur "+(s-4)+"hv chances left");
			i=scan.nextInt();
		}
}

}
	}
	}



