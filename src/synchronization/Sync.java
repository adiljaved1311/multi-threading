package synchronization;

public class Sync {
	public static void main(String[] args) {
		Math1 m=new Math1();
		C c=new C(m);
		D d=new D(m);
		c.start();
		d.start();
	}
}

class Math1{
	int x,y;
	public synchronized void add(int a,int b) {
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

class C extends Thread{
	Math1 m;
	public C(Math1 t) {
		m=t;
	}
	public void run() {
		m.add(5, 7);
	}
}

class D extends Thread{
	Math1 m;
	public D(Math1 t) {
		m=t;
	}
	public void run() {
		m.add(6, 4);
	}
}

