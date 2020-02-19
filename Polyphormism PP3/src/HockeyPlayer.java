
public class HockeyPlayer implements Player {

	public int timeOutMinutes;
	private String name;
	private int salary;
	private int age;
	private int teethIntact;
	public int puckSpeed;
	
	public HockeyPlayer(String name, int age, int salary, int puckSpeed) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.puckSpeed = puckSpeed;
		timeOutMinutes = 0;
	}

	public void setTeethIntact(int teethCount) {
		teethIntact = teethCount;
	}
	
	public void printTeethIntact() {
		System.out.println(teethIntact);
	}
	
	public void foulMade() {
		timeOutMinutes += 2;
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
