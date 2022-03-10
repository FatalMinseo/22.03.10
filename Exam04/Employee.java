package Exam04;

public abstract class Employee {
	String empno;
	String name;
	int pay;

	public abstract int getMoneyPay();
	
	public String print() {
		return empno+" : "+name+" : "+pay;
	}

//	public abstract String print();

	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

}
