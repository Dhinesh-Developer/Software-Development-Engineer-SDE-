package _3A_HandsOn;

abstract class Animal{
	protected String animalName;

	public Animal(String animalName) {
		super();
		this.animalName = animalName;
	}
	
	abstract void eat();
}

interface Sound{
	public static final String CATEGORY = "Domestic Animal";
	
	void makeSound();
	
	default void info() {
		System.out.println("All animals make some sound.");
	}
}

class Dog extends Animal implements Sound{

	
	public Dog(String animalName) {
		super(animalName);
	}

	@Override
	public void makeSound() {
		System.out.println(animalName +" says: Woof Woof!");
	}

	@Override
	void eat() {
		System.out.println(animalName+" eats bones.");
	}
}

class Cat extends Animal implements Sound{

	public Cat(String animalName) {
		super(animalName);
	}

	@Override
	public void makeSound() {
		System.out.println(animalName+" says: Meow Meow!");
	}

	@Override
	void eat() {
		System.out.println(animalName+" eats fish.");
	}
	
}

public class program6 {

	public static void main(String[] args) {
		
		Animal dog = new Dog("Buddy");
		dog.eat();
		
		Sound sound = new Dog("Buddy");
		sound.makeSound();
		sound.info();
		System.out.println("Category: "+sound.CATEGORY);
		
		System.out.println("------------------");
		Animal cat = new Cat("Whiskers");
		cat.eat();
		
		Sound sound1 = new Cat("Whiskers");
		sound1.makeSound();
		sound1.info();
		System.out.println("Category: "+sound1.CATEGORY);
		
		
	}

}
