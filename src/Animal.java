// Importing utils library to access methods -- in this case Scanner which detects user input

import java.util.Scanner;
import java.util.*;


// A class defines the attributes (fields) and capabilities (methods) of a real world object
public class Animal {

	
	// static means this number is shared by all objects of type animals
	// final means that this value cannot be changed
	public static final double FAVNUMBER = 1.6180;

	
	// Variables can start with a letter, underscore or $
	// Private fields can only be accessed by other methods in the class
	private String name;
	
	// int can be -2^31 to (2^31)-1
	private int weight;
	private boolean hasOwner = false;
	
	// byte can hold values between -128 to 127
	private byte age;
	
	// long can hold values from -2^63 to (2^63)-1
	private long uniqueID;
	
	// Chars are unsigned ints that represent UTF-16 codes from 0 to 65,535
	private char favoriteChar;
	
	// REVIEW THIS:
	// Doubles are 64-bit IEEE 754 floating points with decimal values
	private double speed;
	// Floats are 32-bit IEEE 754 floating points with decimal values
	private float height;

	
	// Static variables have the same value for every objects
	// Any variable or function that doesn't make sense for an object to have should be made static
	// Protected means that this value can only be accessed by other code in the same package or subclassess in other packages
	protected static int numberOfAnimals = 0;

	
	// Scanner object allows you to accept user input from the keyboard
	static Scanner userInput = new Scanner(System.in);

	
	// Any time an Animal object is created this function called the constructor is called to initialize the object
	public Animal() {
		numberOfAnimals++;

		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers);

		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers);

		int multOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " + multOfNumbers);

		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " + divOfNumbers);

		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 = " + modOfNumbers);

		
		// \n adds a break after the input
		System.out.print("Enter the name: \n");

		// hasNextInt, hasNextFloat, hasNextDouble, hasNextBoolean, hasNextByte
		// nextInt, nextFloat, nextDouble, nextBoolean, nextByte

		if (userInput.hasNextLine()) {

			this.setName(userInput.nextLine());

		}

		this.setFavoriteChar();
		this.setUniqueID();
	}

	// Source > Generate Getters and Setters (input vs using the input)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	
	// Method overloading allows you to accept different input with the same method name
	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
	}

	public void setUniqueID() {
		long minNumber = 1;
		long maxNumber = 1000000;

		// Math.random to generate a random ID for the object
		this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
		String stringNumber = Long.toString(maxNumber);

		int numberString = Integer.parseInt(stringNumber);
		System.out.println("Unique ID set to: " + this.uniqueID);

	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}

	public void setFavoriteChar() {
		int randomNumber = (int) (Math.random() * 126) + 1;

		this.favoriteChar = (char) randomNumber;

		if (randomNumber == 32) {
			System.out.println("Favorite character set to Space");

		} else if (randomNumber == 10) {
			System.out.println("Favorite character set to Newline");

		} else {
			System.out.println("Favorite character set to " + this.favoriteChar);
		}

		/*
		 * Logical Operators:
		 * & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
		 * && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
		 * | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
		 * || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
		 * ^ : Returns true if there is 1 true and 1 false boolean value on the right or left
		 */
		
		
		
		
		if ((randomNumber > 97) && (randomNumber < 122)) {
			System.out.println("Favorite character is a lowercase letter");
		}

		if (((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))) {
			System.out.println("Favorite character is a letter");
		}

		// Ternary operator
		int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;

		switch (randomNumber) {

		case 8:
			System.out.println("Favorite character set to backspace");
			break;

		case 10:
		case 11:
		case 12:
			System.out.println("Favorite character set to backspace");
			break;

		default:
			System.out.println();
			break;

		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	protected static void countTo(int startingNumber) {
		for (int i = startingNumber; i <= 100; i++) {
			if (i == 90)
				continue;
			System.out.println(i);
		}
	}

	protected static String printNumbers(int maxNumbers) {
		int i = 1;

		while (i < (maxNumbers / 2)) {
			System.out.println(i);
			i++;

			if (i == (maxNumbers / 2))
				break;
		}

		Animal.countTo(maxNumbers / 2);

		return "End of printNumbers";
	}

	protected static void guessMyNumber() {
		int number;
		do {
			System.out.println("Guess number up to 100");

			// verifies they entered an integer
			while (!userInput.hasNextInt()) {
				String numberEntered = userInput.next();
				System.out.printf("%s is not a number\n", numberEntered);
			}

			// assigns the user input to "number"
			number = userInput.nextInt();
			// 50 is our "secret number"
		} while (number != 50);
	}

	public String makeSound() {

		return "Grrrr";

	}

	public static void speakAnimal(Animal randAnimal) {

		System.out.println("Animal says " + randAnimal.makeSound());

	}
	
	
	// Public allows other classes to use this method
	// static means that only a class can call for this to execute
	// void means it doesnt return a value when it finishes executing
	// This method can accept strings that can be stored in the string array args when it's executed
	public static void main(String[] args) {

		Animal theAnimal = new Animal();

		int[] favoriteNumber = new int[20];
		favoriteNumber[0] = 100;

		String[] stringArray = { "Random", "Words", "Here" };

		for (String word : stringArray) {
			System.out.println(word);
		}

		// [How many down], [How many Across], [How Many of the groups]
		String[][][] arrayName = { { { "000" }, { "100" }, { "200" }, { "300" } },
				{ { "010" }, { "110" }, { "210" }, { "310" } }, { { "020" }, { "120" }, { "220" }, { "320" } } };

		// Prints out the entire array of arrays
		for (int i = 0; i < arrayName.length; i++)
		{
			for (int j = 0; j < arrayName[i].length; j++)
			{
				for (int k = 0; k < arrayName[i][j].length; k++)
				{
					System.out.print("| " + arrayName[i][j][k] + " ");
				}
			}
			System.out.println("|");
		}
		
		// Copy an array (stringToCopy, indexes to copy)
		String[] cloneOfArray = Arrays.copyOf(stringArray, 3);
		
		// Print the whole array
		System.out.println(Arrays.toString(cloneOfArray));
		
		// Return the index or a negative number
		System.out.println(Arrays.binarySearch(cloneOfArray, "Random"));

	}

}
