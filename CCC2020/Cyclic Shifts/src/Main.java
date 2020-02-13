import java.util.Scanner;

public class Main {
	
	public static String cycle(String s, int n) {
		return s.substring(s.length() - (n)) + s.substring(0, s.length() - (n));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String text = in.nextLine();
		String refer = in.nextLine();
		String variation;
		int count = 0;
		
		for(int i = 0; i <= refer.length(); i++) {
			variation = cycle(refer, i);
			for(int j = 0; j <= (text.length() - refer.length()); j++) {
				if(variation.contentEquals(text.substring(j, j + refer.length()))) count++;
			}
		}
		
		if(count > 0) System.out.println("yes");
		else System.out.println("no");
		
		in.close();
	}

}
