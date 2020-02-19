/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card("3", "Hearts", 3);
		Card two = new Card("2", "Spades", 3);
		Card three = new Card("3", "Hearts", 3);

		System.out.println("One matches Two? " + one.matches(two));
		System.out.println("One matches Three? " + one.matches(three));
		System.out.println("Suit of Card Three: " + three.suit());
		System.out.println("Card Three: " + two.toString());
	}
}
