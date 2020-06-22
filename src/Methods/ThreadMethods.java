package Methods;

public class ThreadMethods {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println("start thread A");
		a.start();
		System.out.println("start thread B");
		b.start();
	}
}

class A extends Thread{
	public void run() {
		System.out.println("A 1");
		System.out.println("A 2");
		try {
			sleep(2000);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("A 3");
		System.out.println("A 4");
		System.out.println("A 5");
	}
}

class B extends Thread{
	public void run() {
		System.out.println("B 1");
		System.out.println("B 2");
		stop();
		System.out.println("B 3");
		System.out.println("B 4");
		System.out.println("B 5");
	}
}
