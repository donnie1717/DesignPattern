package strategy;

public class StrategyContent {

	private CashSuper cashSuper;
	
	public StrategyContent(CashSuper cashSuper) {
		this.cashSuper = cashSuper;
	}
	
	public double contentInterface(double money) {
		return cashSuper.cash(money);
	}
	
}
