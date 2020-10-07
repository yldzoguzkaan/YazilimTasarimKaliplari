package PrototypeDesignPattern;

public class PrototypeDesignPatternDemo {

	public static void main(String[] args) {
		AnimalCache.loadCache();
		
		Animal clonedAnimal = (Animal) AnimalCache.getAnimal("1");
		System.out.println("Animal : " + clonedAnimal.getType());
		
		Animal clonedAnimal1 = (Animal) AnimalCache.getAnimal("2");
		System.out.println("Animal : " + clonedAnimal1.getType());
		
		Animal clonedAnimal2 = (Animal) AnimalCache.getAnimal("3");
		System.out.println("Animal : " + clonedAnimal2.getType());

	}

}
