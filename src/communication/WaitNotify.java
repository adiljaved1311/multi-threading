package communication;

public class WaitNotify {

	public static void main(String[] args) {
		Shared obj = new Shared();
		new MyThread1(obj).start();
		new MyThread2(obj).start();
	}
}

class Shared{
	int flag=0,data=0;
	synchronized void submit() {
		flag=1;
		try {
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println(e);
		}
		data=10000;
		System.out.println("Data Submitted");
		notify();
	}
	synchronized int withdraw() {
		if(flag==0) {
			try {
				System.out.println("Wait Block");
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		return data;
	}
}
class MyThread1 extends Thread{
	Shared s;
	MyThread1(Shared t){
		s=t;
	}
	public void run() {
		System.out.println(s.withdraw());
	}
}
class MyThread2 extends Thread{
	Shared s;
	MyThread2(Shared t){
		s=t;
	}
	public void run() {
		s.submit();
	}
}









