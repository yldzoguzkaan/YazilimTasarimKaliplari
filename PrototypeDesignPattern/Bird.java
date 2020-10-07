package PrototypeDesignPattern;

public class Bird extends Animal{

	public Bird() {
		Type = "Bird";
	}

	@Override
	void talk() {
		System.out.println("C�K C�K");
	}

	@Override
	public Animal clone() {
		return new Bird();
	}	
}
