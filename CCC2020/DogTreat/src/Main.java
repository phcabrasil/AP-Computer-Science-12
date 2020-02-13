import java.util.Scanner;

public class Main {

	public static String calculateHappy() {
		Scanner in = new Scanner(System.in);
				
		int s = in.nextInt();
		int m = in.nextInt();
		int l = in.nextInt();
		
		int score = (1 * s) + (2 * m) + (3 * l);
		
		in.close();
		
		if(score >= 10) return "happy";
		else return "sad";
		}
	
	public static void main(String[] args) {
		System.out.println(calculateHappy());
	}
	
}
