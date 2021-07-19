package opps;

//creating the class Parent 
class Parent {
 
	public String m4(String str)
	{
		return str;
	}
	public int sum(int a , int b)
	{
		return a+b;
	}
	//defining the method m1()
	void m1()
	{
		System.out.println("This is m1 method present in the parent class");
	}
	void m2()
	{
		System.out.println("This is m2 method present in the parent class");
	}
}

// creating the class InheritanceEx. This is the child class 
// to inherit the property from parent class to child class  we used extends keyword
public class InheritanceEx extends Parent{

	// creating the m3()
	void m3()
	{
		System.out.println("This is m3 method present in the chilld class");
	}
	public static void main(String[] args) {
		
		// creating the object of child class i.e. InheritanceEx class 
		InheritanceEx i = new InheritanceEx();
		
		//using object we can inherit the property of the parent class 
		//i.e we are going to inherit the two methods m1(), m2()
		
		i.m1();
		i.m2();
		System.out.println("m4 method "+i.m4("asmitataaaa"));
		System.out.println("sum of a and b "+i.sum(10, 15));
		// calling m3() present in the child class
		i.m3();

	}

}
