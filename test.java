package test;

public class TestClassDemo1 {
	static int a=10;
	int b=40;
	public static void main(String[]args)
	{
		//can access static from static direct
		System.out.println(a);
		
		//cannot access non static from static direct, need object
		TestClassDemo1 t1=new TestClassDemo1();
		System.out.println(t1.b);
		t1.display();
		
		//can access static from static direct
		System.out.println(TestClassDemo2.a);
		
		//cannot access non static from static direct, need object
		TestClassDemo2 t2=new TestClassDemo2();
		System.out.println(t2.b);
		
		
		
	}
	public void display()
	{
		int a=46;
		//can access static from non static direct
		System.out.println(a);
		
		//can access non static from non static direct
		System.out.println(b);
		
		//cannot access static directly from non static for another class
		TestClassDemo2 t2=new TestClassDemo2();
		System.out.println(t2.b);
	}

}
