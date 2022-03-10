package Exam04;

public class EmployeeMain {

	public static void main(String[] args) {

		RegularEmployee regular = new RegularEmployee("201101", "박병관", 4000, 800);
		System.out.println(regular.print());
//		System.out.println(regular.print());
//		System.out.println(regular.getMoneyPay() + "만원");
		System.out.println(regular.toString());
		
		PartTimeEmployee partTime = new PartTimeEmployee("201001", "임승환", 20, 25);
		System.out.println(partTime.print());
//		System.out.println(partTime.print());
//		System.out.println(partTime.getMoneyPay()+"만원");
		System.out.println(partTime.toString());
		
		TempEmployee temp = new TempEmployee("2012", "장민서", 9600);
		System.out.println(temp.print());
//		System.out.println(temp.print());
//		System.out.println(temp.getMoneyPay()+"만원");
		System.out.println(temp.toString());
		
		Manager manager = new Manager("200101", "동원", 5000, 100);
		System.out.println(manager.print());

	}
}
