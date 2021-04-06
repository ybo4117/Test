package sec06.ch06;

public class InstanceExam {
	
	public static void main(String[] args) {
		// !! 중요 !!
		Dog d1 = new Dog(); // 여기서 Dog 는 Type도 된다 , new 는 객체화를 시켜주는 녀석
		Dog d2 = new Dog();
		d1.name = "뽀삐";
		d2.name = "돌쇠";
		
		d1.bark();
		d2.bark();
		
	}
}

// 멤버필드 (값을 저장할 수 있는 것) - 명사 담당,				\
//														 |  => 객체
// 멤버메소드 (값을 수정할 수 있는 것) - 동사 담당 으로 이루어져있다 /
class Dog{
	String name; // 이녀석들은 클래스 Dog의 전역변수
	String jong;
	int age;
	
	
	void bark() {
		
		System.out.printf("%s가 멍멍\n", name);
	}	
}