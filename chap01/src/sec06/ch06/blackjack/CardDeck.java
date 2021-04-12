package sec06.ch06.blackjack;

public class CardDeck {

	private final Card[] CARD_ARR = new Card[52];
	private final String[] CARD_PATTERN = { "Spades", "Hearts", "Diamonds", "Clubs" };

	public CardDeck() {
		super();
		int idx = 0;
		for (int i = 0; i < CARD_PATTERN.length; i++) {
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

	private int getRandomIdx() {
		return (int)(Math.random()*CARD_ARR.length);
	}

	public Card getOneCard() {
		int ran = getRandomIdx();
		Card card = new Card();

		while (CARD_ARR[ran] == null) {
			ran = getRandomIdx();
			if (CARD_ARR[ran] != null) {
				card = CARD_ARR[ran];
				CARD_ARR[ran] = null;
				return card;
			}			
		}
		card = CARD_ARR[ran];
		CARD_ARR[ran] = null;
		return card;
	}

	public void printAll() {
		
		for(int i = 0 ; i < CARD_ARR.length ; i++) {
			System.out.println(CARD_ARR[i]);
		}
		
		// foreach문도 사용가능
		
	}
	

}
