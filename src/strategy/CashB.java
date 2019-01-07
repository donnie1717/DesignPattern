package strategy;

public class CashB extends CashSuper{

	private double account = 0;
	public CashB(double account) {
		this.account = account;
	}
	
	public double cash(double money) {
		System.out.println("当前折扣为："+account+" 折后价格为："+money*account);
		return money*account;
	}
	
	
	
}
