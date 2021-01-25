package task_01;

public abstract class Pet {
	
	private String color;
	private int age;
	private double weight;
	
	public Pet(String color, int age, double weight) {
		super();
		this.color = color;
		this.age = age;
		this.weight = weight;
	}
	
	abstract void voice();


	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Pet [color=" + color + ", age=" + age + ", weight=" + weight + "]";
	}

}
