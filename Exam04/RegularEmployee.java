package Exam04;

public class RegularEmployee extends Employee{
//	String empno;
//	String name;
//	int pay;
	int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno , name, pay);
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		this.bonus = bonus;
	}

	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

//	public String print() {
//		return empno + " : " + name + " : " + pay;
//	}

	@Override
	public String toString() {
		return "RegularEmployee [empno=" + empno + ", name=" + name + ", pay=" + pay + ", bonus=" + bonus + "]";
	}
}
