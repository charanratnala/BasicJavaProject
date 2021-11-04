package variable;
import java.util.Scanner;
public class ForLoop {
	int a=50;
	
	
	Scanner scan=new Scanner(System.in);
	int multnum=scan.nextInt();
	
	void printNumb() {
		for(int i=1;i<=a;i++) {
			System.out.println(multnum+"* "+i+" "+"="+(multnum*i));
		}
		
	}
	
	
	public static void main(String[] args) {
		
	
		ForLoop obj=new ForLoop();
		obj.printNumb();

}
}