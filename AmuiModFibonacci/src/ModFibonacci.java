
public class ModFibonacci {

	public static int modFib(int k) {
		if (k == 0) return 3;
		if (k == 1) return 5;
		if (k == 2) return 8;
		else return modFib(k-1) + modFib(k-2) + modFib(k-3);
	}

}
