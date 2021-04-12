package sec06.ch06;

public class PolyExam2 {
/*
 * 		1. 부모타입은 자식객체 주소값을 참조할 수 있다.(가리킬 수 있다.)
 * 		2. 자식타입은 부모객체 주소값을 참조할 수 없다.	
 */	
	public static void main(String[] args) {
		Animal ani1 = new Hamster();
		Animal ani2 = new Animal();
		// Animal ani3 = new String();
		// Hamster ham = ani2; //  << 2번을 배반함
		// Hamster ham = (Hamster)ani1; // << 이 또한 2번을 배반 컴파일에러는 피해도 런타임에러는 못피함
		
		System.out.println("끝");
	}

}
