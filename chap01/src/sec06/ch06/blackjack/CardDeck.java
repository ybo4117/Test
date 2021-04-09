package sec06.ch06.blackjack;

public class CardDeck {

	private final Card[] CARD_ARR = new Card[52];
	private final String[] CARD_PATTERN = { "Spades", "Hearts", "Diamonds", "Clubs" };

	public CardDeck() {
		super();
		int idx = 0;
		for (int i = 0 ; i < CARD_PATTERN.length ; i++) {
//		for(String pattern : CARD_PATTERN){
			for (int z = 1; z <= 13; z++) {
				String symbol;
				if (z == 1) {
					symbol = "A";
				} else if (z == 11) {
					symbol = "J";
				} else if (z == 12) {
					symbol = "Q";
				} else if (z == 13) {
					symbol = "K";
				} else {
					symbol = Integer.toString(z);
//					symbol = String.valueOf(z); << 제일 유연함
//					symbol= i + " ";
				}
				Card card = new Card(CARD_PATTERN[i], symbol);
				CARD_ARR[idx] = card;
				System.out.println(CARD_ARR[idx]);
				idx++;
			}
			System.out.println();
		}
	}

}
