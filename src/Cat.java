// since cat extends Animal it gets all of Animals fields and methods
// This is inheritance
public class Cat extends Animal {

	
	public Cat() {
		
	}
	
	// Overrides the Animal Method can by creating a custom sound for Cats
	public String makeSound() {
		return "Meow";
	}
	
	public static void main(String[] args) {
		Animal fido = new Dog();
		Animal fluffy = new Cat();
		
		Animal[] theAnimals = new Animal[10];
		
		theAnimals[0] = fido;
		theAnimals[1] = fluffy;
		
		System.out.println("Fido says " + theAnimals[0].makeSound());
		System.out.println("Fluffy says " + theAnimals[1].makeSound());
		
		
		speakAnimal(fluffy);
	}
	
}
