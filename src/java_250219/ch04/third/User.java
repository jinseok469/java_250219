package java_250219.ch04.third;

public class User implements Member{
	private String name;
	
	User(String name){
		this.name = name;
	}

	@Override
	public void showMyName() {
		// TODO Auto-generated method stub
		System.out.println("내이름은 "+ this.name);
	}
	

}
