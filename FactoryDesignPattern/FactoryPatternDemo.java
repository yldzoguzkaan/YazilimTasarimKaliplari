package FactoryDesignPattern;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal animal1 = animalFactory.getAnimal("BIRD");
		animal1.talk();
		
		Animal animal2 = animalFactory.getAnimal("CAT");
		animal2.talk();
		
		Animal animal3 = animalFactory.getAnimal("DOG");
		animal3.talk();
		
		
	}
}
