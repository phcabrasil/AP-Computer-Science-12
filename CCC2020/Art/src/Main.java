import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = (in.nextInt());
		int[] xP = new int[n];
		int[] yP = new int[n];
		
		for(int i = 0; i < n; i++) {
			String coords = in.next();
			int cut = coords.indexOf(",");
			xP[i] = Integer.parseInt(coords.substring(0, cut));
			yP[i] = Integer.parseInt(coords.substring((cut + 1), coords.length()));
		}
		
		int minX = xP[0];
		int maxX = xP[0];
		int minY = yP[0];
		int maxY = yP[0];
		
		for(int i = 0; i < n; i++) {
			minX = (xP[i] < minX ? xP[i] : minX);
			maxX = (xP[i] > maxX ? xP[i] : maxX);
			minY = (yP[i] < minY ? yP[i] : minY);
			maxY = (yP[i] > maxY ? yP[i] : maxY);
		}
		
		System.out.println((minX - 1) + "," + (minY - 1));
		System.out.println((maxX + 1) + "," + (maxY + 1));
		
		in.close();
	}
}
