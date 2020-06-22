package multi.threading;

public class ThreadByClass 
{
	public static void main(String[] args)
	{
		System.out.println("Hello Main");
		C c = new C();
		c.start();
		System.out.println("Hi Main");
		D d = new D();
		d.start();
		System.out.println("Bye Main");
	}
}

class C extends Thread
{
	public void run() 
	{
		System.out.println("C 1");
		System.out.println("C 2");
		System.out.println("C 3");
		System.out.println("C 4");
		System.out.println("C 5");
	}
}

class D extends Thread
{
	public void run() 
	{
		System.out.println("D 1");
		System.out.println("D 2");
		System.out.println("D 3");
		System.out.println("D 4");
		System.out.println("D 5");
	}
}

