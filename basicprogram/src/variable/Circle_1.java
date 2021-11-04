package variable;

public class Circle_1 
	{ public static double pi=3.14;

	public int radius;

		public static void findArea() 
		{
			double area =pi*radius*radius;
			System.out.println("area of circle";+area);

		}
	public static void main(String[]args)
		{
		Circle c1=new Circle();
	   Circle c2=new Circle();
	   Circle c3=new Circle();
	   Circle c4=new Circle();
	   c1.radius= 6;
	  c2.radius=3;
	  c3.radius =12;
	  c4.radius =7;
	  c1.findArea();
	 c2.findArea();
	 c3.findArea();
	 c4.findArea();

		}    
		}

}
