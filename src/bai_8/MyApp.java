package bai_8;

public class MyApp {
	public static void main(String[] args) {
		

		MyThread obj = new MyThread();
		Thread thr1 = new Thread(obj);
		thr1.start();
		
//		MyThread2 thr2 = new MyThread2();
//		thr2.start();

		try {
			Thread.sleep(3000);// 5s
			synchronized (MyThread.objSync) {
				MyThread.objSync.notify();	
			}
			System.out.println("Notify");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// try{
		// System.out.println("Start application");
		// //do something
		// File f = File.createTempFile("test", ".txt");
		// Dog adog = new Dog();
		// adog.doSomething();
		//
		// System.out.println("end application");
		// }catch(DogException dogEx){
		//// System.out.println("DogException!!");
		// }catch(IOException ioex){
		//// System.out.println("IOException!!");
		// }catch(Exception ex){
		//// System.out.println("Exception");
		// }finally{
		// System.out.println("quit");
		// }
	}

}