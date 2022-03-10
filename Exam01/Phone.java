package Exam01;

public interface Phone {
	// 인터페이스의 변수는 상수(고정된 값)만 올 수 있다.
	// final은 생략 가능
	
	// 버튼
	int button = 12;
	// 스피커
	int speak = 4;
	// 마이크
	final int mic =2;
	String name ="장민서";
	
	
	// 사진찍기
	public abstract void Camera();
	// 통화기능
	public abstract void Call();
	// 인터페이스에서 일반 메소드는 만들 수 없다.
	// 무조건 추상 메소드로 인식 하기 때문에
	// public abstract
	// 문자
	void Message(); // default abstract void Message();
	
}
