package BuilderPattern;

public class SnackBuilder {
	public Snack menu1() {
		Snack s1 = new Snack();
		s1.addItem(new Biskrem());
		s1.addItem(new Tea());
		return s1;
	}
	public Snack menu2() {
		Snack s2 = new Snack();
		s2.addItem(new Cizi());
		s2.addItem(new Coffee());
		return s2;
	}
}
