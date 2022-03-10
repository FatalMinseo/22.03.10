package Exam02;

import java.util.Random;
import java.util.Scanner;

public class KartMain {

	public static void main(String[] args) {

		MyKart Paragon = new MyKart();
		Scanner sc = new Scanner(System.in);
		Random rd =new Random();
		
		while (Paragon.myPosition < 100) {
			System.out.println("[1] 전진 [2] 후진 [3] 부스터");
			int menu = sc.nextInt();
			int run = rd.nextInt(21)-10;
			if (menu == 1) {
				Paragon.Go(run);
			
			} else if (menu == 2) {
				Paragon.Back(run);
				
			} else if (menu == 3) {
				Paragon.Booster(run);
			
			} else {
				System.out.println("다시 입력해주세요.");
			}
			System.out.println("현재위치는 "+Paragon.myPosition+"입니다");
		}
		System.out.println("결승점에 도착했습니다");
	}

}
