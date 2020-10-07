package PrototypeDesignPattern;

public class Bird extends Animal{

	public Bird() {
		Type = "Bird";
	}

	@Override
	void talk() {
		System.out.println("CÝK CÝK");
	}

	@Override
	public Animal clone() {
		return new Bird();
	}	
}
