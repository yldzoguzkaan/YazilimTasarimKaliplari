package BuilderPattern;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		SnackBuilder sb = new SnackBuilder();
		
		Snack s1 = sb.menu1();
		System.out.println("--> MENU 1 <--");
		s1.showItems();
		System.out.println("Total Price: " + s1.getTotalPrice());
		
		/** **************** **/
		
		Snack s2 = sb.menu2();
		System.out.println("--> MENU 2 <--");
		s2.showItems();
		System.out.println("Total Price: " + s2.getTotalPrice());
	}
}
