package java_250219.ch04.third;

public class People {
public static void main(String[] args) {
	
	User user = new User("김삼순");
	user.showMyName();
	Admin admin = new Admin("김연용");
	admin.showMyName();
	
	Member member = new Admin("김연용");
	member.showMyName();
	
	member = new User("김삼순");
	member.showMyName();
	
	
	
}
}
