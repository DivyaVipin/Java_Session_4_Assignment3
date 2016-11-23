
 class C
{
	 protected String name;
	public C()
	{
		System.out.println("I am in class C");
	}
	public C(String name)
	{
		this.name=name;
		System.out.println("I am in class C with one parameter");
	}
	public void test()
	{
		System.out.println("I am in class C with test()");
	}
}
class B extends C
{
	public B()
	{

		System.out.println("I am in class B");
		super.test();
	}
	public B(String name)
	{
		super(name);
		
		System.out.println("I am in class B and my parent class is class C with one parameter");
	}
	public void test()
	{
		System.out.println("I am in class B with test()");
	}
}
class A extends B
{
	public A()
	{

		System.out.println("I am in class A");
	}
	public A(String name)
	{
		//super.super.test();//It is not allowed
		System.out.println("I am in class A and my parent class is class B with one parameter");
	}
	public void test()
	{
		System.out.println("I am in class A with test()");
	}
	
}
public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.test();
		A ab=new A("Divya");
		ab.test();

	}

}
/*Output
 * =======
 * There are 3 classes and one main class
 * class C is the Base class
 * class B derives class C
 * class A derives class B
 * When created an object of class A with no parameter
 * ----------------------------------------------------
 * Output is 
 * I am in class C
I am in class B
I am in class A
I am in class A with test()
->class A's test() is finally overridded and it goes to default constructor of class C,class B,classA
 * When created an object of class A with parameter
 * ----------------------------------------------------
 * Output is:
 I am in class C
I am in class B
I am in class A and my parent class is class B with one parameter
I am in class A with test()
-----------------------------------
It is not possible to call super.super.test();
 * 
 * 
 * 
 * 
 * 
 * 
 * */
