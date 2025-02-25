package java_250219.ch05.first;

import java.awt.Toolkit;
import java.util.Iterator;

public class BeepEx {
	public static void main(String[] args) {
		
		//Runnable runnable = new 새로운클래스();
		//Thread thread = new Thread(runnable);

		
//		Thread thread = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (Exception e) {
//						// TODO: handle exception
//					}
//					
//				}
//			}
//			
//		});
//		thread.start();
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("12");
//			try {
//				Thread.sleep(500);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
		
		Thread tread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					Toolkit toolkit = Toolkit.getDefaultToolkit();
				}
				
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		
			
		});
	}

}
