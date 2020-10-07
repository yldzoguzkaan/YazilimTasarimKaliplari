package BuilderPattern;

public abstract class HotDrink implements ItemINT {

	@Override
	public TypeINT type() {
		// TODO Auto-generated method stub
		return new Drink();
	}

	@Override
	public abstract float price();
	
}
