package opps;
class Computer{
	public void m1()
	{
		System.out.println("This is m1 method from Computer class");
	}
}
class Mouse extends Computer{
	public void m1()
	{
		System.out.println("This is m1 method from Mouse class");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating the object of parent class Computer
		Computer c = new Computer();
		c.m1();
		
		// creating the object of mouse class
		Mouse m = new Mouse();
		m.m1();
	}

}
