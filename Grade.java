public class Grade {

	private double value;
	private String name;

	public Grade(double value, String name) {
		this.value = value;
		this.name = name;
	}

	public void changeName(String newName) {
		this.name = newName;
	}

	public void changeGrade(double newValue) {
		this.value = newValue;
	}

	public String getName(){
		return name;
	}

	public double getValue() {
		return value;
	}
}