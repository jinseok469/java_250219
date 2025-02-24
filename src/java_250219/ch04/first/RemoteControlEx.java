package java_250219.ch04.first;

public class RemoteControlEx implements RemoteControl{

	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원을 켭니다");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
	System.out.println("전원을 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
	System.out.println("볼륨을 조절합니다");
	}

}
