package variable;

public class Car {
	 public String series;
	public String colour;
	public int speed;
	public static String company ="audi";
	public int time;
	public void findDistance()
		{
		int Distance=speed*time;
		System.out.println("speed of the car"+Distance);
		}


		public static void main(String[] args) 
		{
			Car b=new Car();
			Car c= new Car();
	      b.colour="red";
			b. series ="a4";
			b. speed=240;
			b. time=2;
			b.findDistance();
			c.colour="blue";
			c.speed=320;
			c.time=4;
			c.findDistance();

		
	}


}
