import java.util.Scanner;

public class Main {

	public static int room[][];
	
	public static boolean isPrime(int n) {
		int m = n / 2;
		if (n == 0 || n == 1) {
			return false;
		} 
		else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();

		room = new int[col][row];

		for (int j = 0; j < row; j++) {
			for (int i = 0; i < col; i++) {
				room[i][j] = Integer.parseInt(in.next());
			}
		}

		int currX = room[0][0];
		int finalX = room[col-1][row-1];
		int lastX;
		int count = 0;
		
		while(currX != finalX) {
			count++;
			lastX = currX;
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					if ((i + 1) * (j + 1) == currX) {
						currX = room[j][i];
					}
				}
			}
			if(currX == finalX) {
				System.out.println("yes");
				break;
			}
			else {
				if(lastX == currX) {
					System.out.println("no");
					break;
				}
			}
			if(count > (row*col)) {
				System.out.println("no");
				break;
			}
		}

		in.close();
	}

}
