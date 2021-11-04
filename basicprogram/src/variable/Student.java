package variable;

public class Student { public static String trainername="jspiders";


	public String name;

public String gender;
public String stream;
public int yop;
public double tenth;
public double inter;
public double degree;
  public Student (String n,String g,String s,int y,double t,double i, double d) 
 
  {   name=n;
  gender=g;
  stream=s;
  yop=y;
  tenth=t;
  inter=i;
  degree=d;
  
  
  }
  public void printAllInfo()
  {  
	  System.out.println("my name is "+name);
	  System.out.println("gender"+gender);
	  System.out.println("my stream "+stream);
	  System.out.println("yea of pass"+yop);
	  System.out.println("tenth"+tenth);
	  System.out.println("inter"+inter);
	  System.out.println("degree"+degree);
	  System.out.println();
	  
  }
public static void main(String []args)
{ Student obj=new Student("saicharan","m","mechanical",2016,8.2,70.45,75.45);

obj.printAllInfo();
Student obk=new Student("vijaykumar","m","mechanical",2018,8.2,70.45,75.45);
obk.printAllInfo();

}
}

