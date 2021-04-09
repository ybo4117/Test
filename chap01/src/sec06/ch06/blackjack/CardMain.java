package sec06.ch06.blackjack;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card("Spade", "K");
//		System.out.println(c1); // Spade (K) 	
		
		Card c2 = new Card("Herat", "2");
//		System.out.println(c2); // Herat (2)
		
		Card c3 = new Card("club", "J");
//		System.out.println(c3); // club (J)
		new CardDeck();
		System.out.println();
	
	}
	
	public static void println(String str) {
		System.out.println(str);
		
	}
	
	public static void println(Object obj) {
		System.out.println("obj !!");
		String str = obj.toString();
		println(str);
	}

}
