package java_250219.ch08.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> test = new ArrayList<>();
		
		test.add("연용");
		test.add("연용1");
		test.add("연용2");
		test.add("연용3");
		test.add("연용4");
		test.add("연용5");
		test.add("연용6");
		test.add("연용7");
		test.add("연용8");
		test.add("연용9");
		System.out.println(test.get(8));
		test.remove(8);
		System.out.println(test.get(8));
		test.add(8,"연용8");
		System.out.println(test.get(8));
		System.out.println(test.size());
		for(int i = 0 ; i < test.size();i++) {
			if(test.get(i).equals("연용2")){
					test.remove(2);
			}
			System.out.println("test.get("+i+") : "+test.get(i));
		}
//		for(String a : test) {
//			
//			System.out.println(" 미키연용: "+a);
//		}
		
		
		
		
		
		

	}

}
