package Exam01;

public interface Phone {
	// �������̽��� ������ ���(������ ��)�� �� �� �ִ�.
	// final�� ���� ����
	
	// ��ư
	int button = 12;
	// ����Ŀ
	int speak = 4;
	// ����ũ
	final int mic =2;
	String name ="��μ�";
	
	
	// �������
	public abstract void Camera();
	// ��ȭ���
	public abstract void Call();
	// �������̽����� �Ϲ� �޼ҵ�� ���� �� ����.
	// ������ �߻� �޼ҵ�� �ν� �ϱ� ������
	// public abstract
	// ����
	void Message(); // default abstract void Message();
	
}
