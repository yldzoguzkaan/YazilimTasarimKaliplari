package SingletonPattern;

public class Device {
	
	private static final Device instance = new Device();
	
	private Device() {}

	public static Device getInstance() {
		return instance;
	}
			
	public void showIDNumber() {
		System.out.println("123321");
	}
}
