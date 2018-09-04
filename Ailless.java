
public class Ailless 
{
	public static void main(String[] args)
	{
		int a = 5, b = 6 ;
		System.out.println(a==b);
		Car c = new Car();	
		c.speed = 555;
		System.out.println(c.speed);
		c.acc = 123;
		System.out.println(c.acc);
		
		System.out.println(c.pushAcc());
		SimpleDice dice1 = new SimpleDice(5);
		System.out.println(dice1.faceValue);
		dice1.roll();
		System.out.println(dice1.faceValue);
		System.out.println(dice1);
		
	}
	

}
