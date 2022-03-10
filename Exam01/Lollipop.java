package Exam01;

public class Lollipop implements Phone{

	@Override
	public void Camera() {
		System.out.println("카메라를 찍다");
		
	}

	@Override
	public void Call() {
		System.out.println("통화를 하다");
	}

	@Override
	public void Message() {
		System.out.println("메세지를 보내다");
	}
	// 인터페이스를 상속받을 땐 implements 라는 키워드를 사용한다

}
