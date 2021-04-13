package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam2 {
	
	public static void main(String[] args) {
		List<Card> list = new ArrayList();
		// <@@@@> 는 제약조건이 생김이다 @@@@타입으로 들어가고 나와야함
		
		Card c1 = new Card("", "");
		
		list.add(c1);
		
		Card c2 = list.get(0);
		
		
		
	}

}