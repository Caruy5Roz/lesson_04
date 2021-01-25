package task_01;

public class Dog extends Pet {

	public Dog(String color, int age, double weight) {
		super(color, age, weight);
	}

	@Override
	void voice() {
		System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");
	}
	
	

}
