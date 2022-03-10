package Exam02;

public interface Kart {

	// 카트의 설계도

	// 시작 위치 = 0;
	int startPoint = 0;

	// 전진
	// 후진
	// 부스터

	public abstract void Go(int num);

	public abstract void Back(int num);

	public abstract void Booster(int power);

}
