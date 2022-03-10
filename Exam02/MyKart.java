package Exam02;

public class MyKart implements Kart {
	// 인터페이스에서 상속받은 추상 메소드는 반드시 구현 해주어야한다

	int myPosition = startPoint;

	@Override
	public void Go(int num) {
		myPosition += num;
	}

	@Override
	public void Back(int num) {
		myPosition -= num;
	}

	@Override
	public void Booster(int power) {
		myPosition += power*2;
	}

}
