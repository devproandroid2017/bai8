package bai_8;

import java.util.Calendar;

public class DaLuong1  implements Runnable{
	@Override
	public void run() {
		long begin = Calendar.getInstance().getTimeInMillis(); 
		testThread1 (1000000);
		long end = Calendar.getInstance().getTimeInMillis(); 
		System.out.println("Executed Time: " + (end - begin)); 
	}
	public static void testThread1(int y){
		int t=0;
		for(int i=500001;i<=y;i++){
			t=t+i;
		}
		System.out.println("Tong 2:" + t);
	}

	

}
