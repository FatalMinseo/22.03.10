package Exam02;

import java.util.Random;
import java.util.Scanner;

public class KartMain {

	public static void main(String[] args) {

		MyKart Paragon = new MyKart();
		Scanner sc = new Scanner(System.in);
		Random rd =new Random();
		
		while (Paragon.myPosition < 100) {
			System.out.println("[1] ���� [2] ���� [3] �ν���");
			int menu = sc.nextInt();
			int run = rd.nextInt(21)-10;
			if (menu == 1) {
				Paragon.Go(run);
			
			} else if (menu == 2) {
				Paragon.Back(run);
				
			} else if (menu == 3) {
				Paragon.Booster(run);
			
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
			System.out.println("������ġ�� "+Paragon.myPosition+"�Դϴ�");
		}
		System.out.println("������� �����߽��ϴ�");
	}

}
