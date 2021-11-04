package variable;

public class carz {  public String series;
public String color;
public int speed;
public static String brand="audi";
public int time;



public carz(int  speed,int time)
{
 speed=speed;
time=time;
}
public void findDistance()
{ int distance;
distance=speed*time;
System.out.println(distance);
}
public static void main(String args[])
{carz obj=new carz(240,2);

obj.findDistance();


}
}