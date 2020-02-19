
public class SoccerPlayer implements Player {

	public int goalsScored;
	private String name;
	private int salary;
	private int age;
	private String position;
	private int kickStrength;
	
	public SoccerPlayer(String name, int age, String position, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.position = position;
		goalsScored = 0;
	}

	public void setKickStrength(int force) {
		kickStrength = force;
	}
	
	public void printKickStrength() {
		System.out.println(kickStrength);
	}
	
	public void goalScored() {
		goalsScored++;
	}
	
	public void getPosition() {
		System.out.println(position);
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
