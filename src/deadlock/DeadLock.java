package deadlock;

public class DeadLock {

	public static void main(String[] args) {
		String R1="Hello";
		String R2="Hi";
		new A(R1,R2).start();
		new B(R1,R2).start();
	}
}

class A extends Thread{
	String r1,r2;
	A(String s1,String s2){
		r1=s1;
		r2=s2;
	}
	public void run() {
		synchronized(r1) {
			System.out.println("A locked r1");
			try {
				sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		synchronized(r2) {
			System.out.println("A locked r2");
		}
		}
	}
}
class B extends Thread{
	String r1,r2;
	B(String s1,String s2){
		r1=s1;
		r2=s2;
	}
	public void run() {
		synchronized(r2) {
			System.out.println("B locked r2");
		try {
			sleep(400);
		}catch(Exception e) {
			System.out.println(e);}
		synchronized(r1) {
			System.out.println("B locked r1");
	}
}
	}
}
