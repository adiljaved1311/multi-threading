package synchronization;

public class SyncBlock {

	public static void main(String[] args) {
		Math2 m=new Math2();
		T1 t1 = new T1(m);
		T2 t2 = new T2(m);
		t1.start();
		t2.start();
	}
}
class Math2{
	int x,y;
	public void add(int a, int b) {
		synchronized(this)
		{
		 x=a;
		 y=b;
		 try 
		 {
			Thread.sleep(200);
		 }catch(Exception e) {
			System.out.println(e);
		 }
		int sum=x+y;
		System.out.println("Addition= "+sum);
		}
	}
}

class T1 extends Thread{
	Math2 m;
	public T1(Math2 t) {
		m=t;
	}
	public void run() {
		m.add(7, 5);
	}
}

class T2 extends Thread{
	Math2 m;
	public T2(Math2 t) {
		m=t;
	}
	public void run() {
		m.add(6, 4);
	}
}