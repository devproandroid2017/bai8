package bai_8;

public class MyThread implements Runnable {

	public static Object objSync = new Object();

	@Override
	public void run() {
		doSomething(100);
		// System.out.println("MyThread from Runnable running");
		// synchronized (objSync) {
		// try{
		// System.out.println("waitting");
		// objSync.wait();
		// System.out.println("running");
		// }catch(InterruptedException ie){
		// ie.printStackTrace();
		// }
		// }
	}

	public static synchronized void doSomething(int x) {
		for (int i = 0; i < x; i++) {
			System.out.println("print " + i);
		}
	}
}
