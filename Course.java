import java.util.ArrayList;
public class Course {
	private int weight;
	private String name;
	private ArrayList<Category> categories;

	public Course(int weight, String name) {
		this.weight = weight;
		this.name = name;
	} 

	public Course(int weight, String name, ArrayList<Category> categories) {
		this(weight, name);
		this.categories = categories;
	}

	public void changeName(String newName) {
		this.name = newName;
	}

	public void changeWeight(double newWeight) {
		this.weight = newWeight;
	}

	public String getName(){
		return name;
	}

	public int getWeight() {
		return weight;
	}
}