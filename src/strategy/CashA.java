package strategy;

public class CashA extends CashSuper{

	@Override
	public double cash(double money) {
		System.out.println("没有打折:当前价格为："+money);
		return money;
	}

}
