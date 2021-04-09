package sec06.ch06;

public class PolymorExam {

	/*
	 * 메소드 !!!!! 다형성
	 * 
	 * 1. 부모타입의 변수는 자식객체를 가리킬 수 있다. 
	 * 2. 자식타입의 변수는 부모객체를 가리킬 수 없다. 
	 * # 자신의 타입의 변수는 자신의 객체를 가리킬 수 있다. ( ex) 객체화 ) 
	 * 3. 타입은 아는 메소드만 호출할 수 있다. 호출이 되었다면 기준은 객체이다.
	 * 
	 */

	public static void main(String[] args) {
		Animal ani_1 = new Cat(); // 1번
		// Cat cat 1 = new Animal(); // 2번
		Cat cat = (Cat) ani_1;
		Animal ani_2 = cat;

		// Cat cat1 = (Cat) new Animal("", 0); << 에러터짐 부모객체르 강제형변환 할 수 없음
		
		ani_1.howling();
		// ani_1.lick(); << 에러터짐 3번을 배반
		cat.howling();
		
		
		System.out.println("끝!");
	}

}
