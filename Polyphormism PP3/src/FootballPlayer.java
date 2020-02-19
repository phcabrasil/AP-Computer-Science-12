
public class FootballPlayer implements Player {

	public int touchdownsScored;
	private String name;
	private int salary;
	private int age;
	private int throwDistance;
	public int sprintSpeed;
	
	public FootballPlayer(String name, int age, int salary, int sprintSpeed) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.sprintSpeed = sprintSpeed;
		touchdownsScored = 0;
	}

	public void setThrowDistance(int distance) {
		throwDistance = distance;
	}
	
	public void printThrowDistance() {
		System.out.println(throwDistance);
	}
	
	public void touchdownScored() {
		touchdownsScored++;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSalary() {
		return salary;
	}

	@Override
	public int getAge() {
		return age;
	}
	
}
