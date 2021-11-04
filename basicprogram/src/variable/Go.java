package variable;

public class Go { 
	
	public Go(int a)
	{
		
	
	System.out.println(" clss go"+a+"kms");
}


public class Run extends Go{  
	public Run(double k)
	{  
		super(10);
		
		System.out.println("sub class value"+88.5);
		
	}

	
   public static void main(String[]args)
   {
	   Run r=new Run(88.5);
   }
}
}
	
	

	
	

	