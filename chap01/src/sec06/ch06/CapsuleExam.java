package sec06.ch06;

public class CapsuleExam {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		h1.setAge(10);
		h1.setName("홍길동");
//		System.out.printf("h1 나이는 %d, 이름은 %s\n", h1.getAge(), h1.getName());
		h2.setAge(20);
		h2.setName("신사임당");
//		System.out.printf("h2 나이는 %d, 이름은 %s\n", h2.getAge(), h2.getName());

		h1.whoAmI();
		h2.whoAmI();
	}

}

class Human {
	private int age;
	private String name;	
	// 생성자 !!!! >> 생성자 이름은 클래스 이름이랑 같아야 함 , 리턴타입이 없음 ( 생성자 생성에 순서가중요 !)
	// => 생성자와 메소드로 private에 값을 넣을수 있다 !!!
	// 메소드 !!!!
	// this( ) << 생성자 호출
	// this.~~~ << 멤버필드 호출
	Human() {
		this(10);	
	}

	Human(int age) {
		this("미상", age);		
	}
	
	Human(String name) {
		this(name, 10);		
	}

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d입니다.\n", name, age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}