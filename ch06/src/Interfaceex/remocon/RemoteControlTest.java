package Interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {
		//  부모 타입으로 형 변환
		RemoteControl rcTV = new Television();
		
		rcTV.turnOn();
		rcTV.setVolume(7);
		rcTV.turnOff();
		
	}

}
