package variable;

public class inHeritance { public int f=10;
}

class b extends inHeritance{
	public int x=10;
	public int run()
	{System.out.println(f);
	System.out.println(x);
	}

public static void main(String []args)
{
	b obj=new b();
	obj.run();
	


}
}

