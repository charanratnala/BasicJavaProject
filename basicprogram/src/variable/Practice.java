package variable;
import java.util.Scanner;
public class Practice {
	
	int x;
	int y;
	Scanner scan=new Scanner(System.in);

	
	public int demo()
	{System.out.println("enter the value");
		x=scan.nextInt();
		System.out.println("enter the value B");
		y=scan.nextInt();
		System.out.println("the value is "+(x+y));
		return (x+y);
	}
public static void main(String[]args)
{
	Practice p=new Practice();
	p.demo();
	
}}