package java_250219.ch04.first;

public interface RemoteControl {
		
	//추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메서드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리 합니다");
		}else {
			System.out.println("무음해제 합니다");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
}
