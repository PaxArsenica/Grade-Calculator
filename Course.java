import java.util.ArrayList;
public class Course {
	private int weight;
	private double currentGrade;
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

	public String addCategory(Category category) {
		categories.add(category);
		return "Category added to " + this.name;
	}

	public void changeName(String newName) {
		this.name = newName;
	}

	public void changeWeight(int newWeight) {
		this.weight = newWeight;
	}

	public String getName(){
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public double calculateCurrentGrade() {
		currentGrade = 0;
		for (Category c : categories) {
			currentGrade += c.average() * c.getWeight() / 100;
		}
		return currentGrade;
	}
}