package bai_8;
import java.util.Calendar;

public class DaLuong implements Runnable{

	public static Object obj= new Object();
	@Override
	public void run() {
		long begin = Calendar.getInstance().getTimeInMillis(); 
		testThread(500000);
		long end = Calendar.getInstance().getTimeInMillis(); 
		System.out.println("Executed Time: " + (end - begin)); 
		
		
		
	}
	public static synchronized void testThread(int x){
		int t=0;
		for(int i=1;i<=x;i++){
			 t= t+i;			 
		}
		System.out.println("Tong 1:" + t);
	}
	
	

}
