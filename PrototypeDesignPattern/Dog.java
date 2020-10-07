package PrototypeDesignPattern;

public class Dog extends Animal {

	public Dog() {
		Type = "Dog";
	}

	@Override
	void talk() {
		System.out.println("HAV HAV");
	}
	
	@Override
	public Animal clone() {
		return new Dog();
	}
}
