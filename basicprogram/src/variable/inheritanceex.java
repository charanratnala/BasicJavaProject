package variable;

public class inheritanceex { public int x=10;

}
class b extends inheritanceex
{public int c=20;

public void move()
{System.out.println(x);
System.out.println(c);

}
}
class z
{
	
	public static void main(String []agrs)

	

	{b obj=new b();
	obj.move();
	}
}
	


