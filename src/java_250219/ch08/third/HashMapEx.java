package java_250219.ch08.third;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> friends = new HashMap<>();
		
		friends.put("키 150","연용15");
		friends.put("몸무게 300","연용16");
		friends.put("키190","연용17");
		
//		System.out.println(friends.get(3));
		
		for(String friend : friends.keySet()) {
			System.out.println(friend +" : "+friends.get(friend)); 
		}
		
	}
}
