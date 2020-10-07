package FactoryDesignPattern;

public class AnimalFactory {
	public Animal getAnimal(String animalType) {
		if(animalType == null) {
			return null;
		}
		if(animalType.equalsIgnoreCase("BIRD")) {
			return new Bird();
			
		}else if(animalType.equalsIgnoreCase("CAT")) {
			return new Cat();
		}else if(animalType.equalsIgnoreCase("DOG")) {
			return new Dog();
		}
		return null;
	}
}
