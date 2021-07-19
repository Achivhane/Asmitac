package opps;
//creating the objecEx class
public class ObjectEx {
 
	//creating the method of m1()
	public void m1()
	{
		//body of the method
		System.out.println("this is the m1 method");
	}

	//defining the main method
	public static void main(String[] args) {
		
		//creating the object of the class
		// syntax : class_name obj_name = new class_name()
		ObjectEx o = new ObjectEx();
		
		// where ObjectEx is the class name and ObjectEx() is the constructor of the class
		//new is the keyword
		
		//calling the method using obj_name
		
		o.m1();

	}

}
