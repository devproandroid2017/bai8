package bai_8;

public class MyThread2 extends Thread{
	@Override
	public void run() {
		MyThread.doSomething(100);
//		System.out.println("MyThread2 from Thread running");
//		super.run();
	}
}
