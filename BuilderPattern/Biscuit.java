package BuilderPattern;

public abstract class Biscuit implements ItemINT {

	@Override
	public TypeINT type() {
		// TODO Auto-generated method stub
		return new Food();
	}

	@Override
	public abstract float price();
	
}
