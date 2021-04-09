package sec06.ch06.blackjack;

public class Card {

	private String pattern;
	private String symbol;
	
	public Card() {
		super();				
	}	
	
	public Card(String pattern, String symbol) {
		super();
		this.pattern = pattern;
		this.symbol = symbol;
	}

	public String getPattern() {
		return pattern;
	}

	public String getSymbol() {
		return symbol;
	}

	@Override
	public String toString() {
		return String.format("%s (%s)", pattern, symbol);

	}
}
