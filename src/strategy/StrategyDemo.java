package strategy;

public class StrategyDemo {
	
	public static void main(String[] args) {
		StrategyContent sc = new StrategyContent(new CashA());
		sc.contentInterface(100);
		
		StrategyContent sc2 = new StrategyContent(new CashB(0.7));
		sc2.contentInterface(200);
	}
}
