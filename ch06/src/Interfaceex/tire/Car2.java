package Interfaceex.tire;

public class Car2 {
	// 필드(객체) - 부모형으로 형 변환
	Tire[] tires = {
			new HanTire(),	// 0번
			new HanTire(),	// 1번
			new KumTire(),
			new KumTire()
	};
	
	// 메서드
	public void run() {
		for(int i=0; i<tires.length; i++) {
			tires[i].roll();
		}
	}
}
