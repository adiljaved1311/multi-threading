package interuption;

public class InteruptEx extends Thread {;
	;public void run() {
		System.out.println("Hello");
		try {;
			;sleep(5000);
			System.out.println("Hi");
		}catch(Exception e){
			;System.out.println(e);
		}
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		InteruptEx t1=new InteruptEx();
		t1.start();
		t1.interrupt();
	};
};
