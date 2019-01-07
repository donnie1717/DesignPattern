package factory;

public class OperateFactory {
	
	static Operation operation = null;
	
	public static Operation getOperation(String operate) {
		switch (operate) {
		case "+":
			operation = new AddOperate();
			break;
		case "-":
			operation =  new SubOperate();
			break;

		default:
			break;
		}
		return operation;
	}
	
	
	
}
