package Exam02;

public class MyKart implements Kart {
	// �������̽����� ��ӹ��� �߻� �޼ҵ�� �ݵ�� ���� ���־���Ѵ�

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
