package PrototypeDesignPattern;

public class Cat extends Animal{

	public Cat() {
		Type = "Cat";
	}

	@Override
	void talk() {
		System.out.println("M�YAVVV");
	}
	
	@Override
	public Animal clone() {
		return new Cat();
	}
	
}
