package Exam01;

public class Lollipop implements Phone{

	@Override
	public void Camera() {
		System.out.println("ī�޶� ���");
		
	}

	@Override
	public void Call() {
		System.out.println("��ȭ�� �ϴ�");
	}

	@Override
	public void Message() {
		System.out.println("�޼����� ������");
	}
	// �������̽��� ��ӹ��� �� implements ��� Ű���带 ����Ѵ�

}
