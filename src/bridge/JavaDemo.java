package bridge;

public class JavaDemo {
	public static void main(String[] args) {
		PhoneBrand brand1 = new BrandM();
		brand1.setSoft(new Game());
		brand1.run();
		
		brand1.setSoft(new AddressList());
		brand1.run();
		
		PhoneBrand brand2 = new BrandN();
		brand2.setSoft(new Game());
		brand2.run();
		
		brand2.setSoft(new AddressList());
		brand2.run();
		
		
	}
}
