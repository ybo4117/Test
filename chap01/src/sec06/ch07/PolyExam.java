package sec06.ch07;

public class PolyExam {
/*
 *		1. 부모타입은 자식 객체를 가리킬 수 있다. (참조, 저장 가능)
 *		2. 자식타입은 부모 객체를 가리킬 수 없다. (참조, 저장 불가능)
 *		3. 변수타입은 메소드 호출 여부만 결정 !!
 *			(자기가 아는 것만 호출가능)
 *			호출 되었다면
 */
	public static void main(String[] args) {
		
		Car car1 = new Bus();
		Car car2 = new Car();
		Car car3 = new LocalBus();
		
		//Bus bus1 = (Bus)car2; // 형변환을 해도 런타임 에러가 뜬다
		Bus bus1 = (Bus)car1;
		bus1.openDoor();
		bus1.hoot();
		
		Car carP = bus1;
		carP.hoot();
		
		System.out.println("----------------");
		
		
		
		
		System.out.println("끝!");
	}

}

