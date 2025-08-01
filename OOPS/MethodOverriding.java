package Day4;

// Method Overriding.....

class Animal{
	
	public void Sound() {
		System.out.println("Animal Sound");
	}
}

class Dog extends Animal{
	
	@Override
	public void Sound() {
		System.out.println("Dog is Barking");
	}
}

class Cat extends Animal{
	
	@Override
	public void Sound() {
		System.out.println("Cat is meyou...");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		dog.Sound();
		
		Animal cat = new Cat();
		cat.Sound();
		
	}
}

/*
Dog is Barking
Cat is meyou...

 * */

