package bridge;

public abstract class PhoneBrand {
	
	public Soft soft;
	
	public void setSoft(Soft soft) {
		this.soft = soft;
	}
	
	public abstract void run();
}
