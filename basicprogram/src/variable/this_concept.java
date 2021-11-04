package variable;

public class this_concept { int speed;

public this_concept (int a)
{ speed=a;
}
	


public void move()
{System.out.println(this.speed);
}

public static void main(String[]args)
{this_concept obj=new this_concept(4);
obj.move();

}
}