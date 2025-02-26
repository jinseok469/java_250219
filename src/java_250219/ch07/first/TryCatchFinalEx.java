package java_250219.ch07.first;

import java.awt.Toolkit;

public class TryCatchFinalEx{
	public static void main(String[] args) throws InterruptedException  {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i <5; i++) {
			
//			try {
				toolkit.beep();
				Thread.sleep(500);
				
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
