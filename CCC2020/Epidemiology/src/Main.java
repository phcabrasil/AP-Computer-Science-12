import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int days;

		Scanner in = new Scanner(System.in);
		
		int p = in.nextInt();
		int n = in.nextInt();
		int r = in.nextInt();
		int newN = n;
		
		for(days = 0; n <= p; days++) {
		    newN *= r;
			n += newN;
		}
		
		in.close();
		
		System.out.println(days);
	}
}
