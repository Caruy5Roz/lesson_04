package task_01;

public class Main {

	public static void main(String[] args) {
		
		Cow cow = new Cow("brown", 5, 300);
		cow.voice();
		System.out.println(cow);
		System.out.println();
		
		Cat cat = new Cat("black", 3, 4.2);
		cat.voice();
		System.out.println(cat);
		System.out.println();
		
		Dog dog = new Dog("grey", 7, 20.7);
		dog.voice();
		System.out.println(dog);
		

	}

}
