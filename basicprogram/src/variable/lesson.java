package variable;

public class lesson { public String empname;
public String emp_email;
public double emp_sal;

	public static String emp_company="IBM" ;
	
	public static String emprole="developer";
	public double findAnnualSalary()
	{  return emp_sal*12;
	
	}
public lesson(String a,String e,double s)
{  empname=a;
emp_email=e;
emp_sal=s;
}


public  void empdetails()
{System.out.println(empname);
System.out.println(emp_email);
System.out.println(findAnnualSalary()+"hii");
}





public static void main (String []args)
{

lesson obj=new lesson("saichan","sai007@",44.2);

obj.empdetails();
}
}





