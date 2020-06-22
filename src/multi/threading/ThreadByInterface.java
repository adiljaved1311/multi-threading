package multi.threading;

public class ThreadByInterface 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Main");
		A a = new A();
		Thread t1 = new Thread(a);
		t1.start();
		System.out.println("Hi Main");
		B b = new B();
		Thread t2 = new Thread(b);
		t2.start();
		System.out.println("Bye Main");
	}
}

class A implements Runnable 
{
	public void run() 
	{
		System.out.println("A 1");
		System.out.println("A 2");
		System.out.println("A 3");
		System.out.println("A 4");
		System.out.println("A 5");
	}
}

class B implements Runnable 
{
	public void run() 
	{
		System.out.println("B 1");
		System.out.println("B 2");
		System.out.println("B 3");
		System.out.println("B 4");
		System.out.println("B 5");
	}
}


