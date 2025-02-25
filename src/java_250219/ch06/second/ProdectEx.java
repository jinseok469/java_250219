package java_250219.ch06.second;

public class ProdectEx {
	public static void main(String[] args) {
	Product<String,Integer> iphone = new Product<>();
	
	iphone.setModel(6);
	
	System.out.println(iphone.getModel());
	}
}
