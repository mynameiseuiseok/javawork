package Interfaceex.tire;

public class Car {
	// 필드(객체) - 부모형으로 형 변환
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire BackLeftTire = new KumTire();
	Tire BackRightTire = new KumTire();
	
	// 메서드
	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
	}
}
