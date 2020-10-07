package PrototypeDesignPattern;

import java.util.Hashtable;

public class AnimalCache {
	private static Hashtable<String, Animal> animalMap = new Hashtable<String, Animal>();
	
	public static Animal getAnimal(String animalID) {
		Animal cachedAnimal = animalMap.get(animalID);
		return (Animal) cachedAnimal.clone();
	}
	
	public static void loadCache() {
		Bird b = new Bird();
		b.setId("1");
		animalMap.put(b.getId(), b);
		
		Cat c = new Cat();
		c.setId("2");
		animalMap.put(c.getId(), c);
		
		Dog d = new Dog();
		d.setId("3");
		animalMap.put(d.getId(), d);
	}
}
