// Dog is inheriting Animal.java methods and fields
public class Dog extends Animal {

	public Dog() {
		
	}
	
	
	// Overrides Animal grrr sound by adding custom sound for Dog
	public String makeSound() {
		// Can be called from Animal.java to produce the correct sound
		return "Woof";
	}
	
}
