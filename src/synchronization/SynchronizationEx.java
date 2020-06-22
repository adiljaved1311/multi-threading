package synchronization;

public class SynchronizationEx {

	public static void main(String[] args) {
		Math m=new Math();
		A a=new A(m);
		B b=new B(m);
		a.start();
		b.start();
	}
}

class Math{
	int x,y;
	//Non Synchronization method
	public void add(int a,int b) {
		x=a;
		y=b;
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}
		int sum=x+y;
		System.out.println("Addition= "+sum);
	}
}

class A extends Thread{
	Math m;
	public A(Math t) {
		m=t;
	}
	public void run() {
		m.add(5, 7);
	}
}

class B extends Thread{
	Math m;
	public B(Math t) {
		m=t;
	}
	public void run() {
		m.add(6, 4);
	}
}
