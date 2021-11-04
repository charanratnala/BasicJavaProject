package variable;

public class upcasting {public int x=10;
public void run()
{System.out.println("hii there thisis super cls");

}
}
class B extends upcasting{ public void go()
	{ 
	System.out.println("hii there im useing sub class");
	
}
}
class C extends upcasting { public void jump()
	{System.out.println("hii there is another sub clss oooo i think it is hiracical inheritance");
	
	}
}
class Z {public static void main(String []args)
	{   upcasting a1     = (upcasting) new B();
	 a1.run();
	 B b1=(B) a1;
	 b1.run();
	 b1.go();
	 
	}
}
