package factory;

public class TestOpetate {
	
	public static void main(String[] args) {
		Operation operation = OperateFactory.getOperation("-");
		
		double result = operation.operate(10, 15);
		
		System.out.println(result);
		
		
	}
}
