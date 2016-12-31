import java.util.ArrayList;
public class Category {
	private int weight;
	private String name;
	private ArrayList<Grade> grades;

	public Category(int weight, String name) {
		this.weight = weight;
		this.name = name;
	} 

	public Category(int weight, String name, ArrayList<Grade> grades) {
		this(weight, name);
		this.grades = grades;
	}

	public String addGrade(Grade grade) {
		if (grade.getValue() >= 0) {
			grades.add(grade);
			return "Grade added to " + this.name;
		} else {
			return "Grade Invalid.";
		}
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