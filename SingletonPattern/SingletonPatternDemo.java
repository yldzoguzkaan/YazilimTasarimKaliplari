package SingletonPattern;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		Device obj = Device.getInstance();
		obj.showIDNumber();
	}
}
