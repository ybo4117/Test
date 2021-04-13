package sec06.ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam {
	public static void main(String[] args) {
		List list = new ArrayList(); // List(부모타입) 와 ArrayList는 상속관계
		// List list2 = new LinkedList();

		list.add(10);
		list.add(10.1);
		list.add("ddd");
		list.add(new Card("", ""));
		
		int val2 = (int)list.get(0);
		System.out.println("val2 : " + val2);
		
		Object obj = list.get(1);
		double val = (double)obj;
		System.out.println("val : " + val);
		/*
		 * Box box1 = new Box(); box1.val = 10;
		 * 
		 * Box box2 = new Box(); box2.val =20;
		 * 
		 * box1.nextBox = box2; System.out.println(box1.val);
		 * System.out.println(box2.val);
		 */
	}
}

class Box {
	int val;
	Box nextBox;
}