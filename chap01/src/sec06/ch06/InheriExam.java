package sec06.ch06;

public class InheriExam {

	public static void main(String[] args) {
		Cat cat = new Cat();		
		cat.howling();
	}

}

// Object는 자바의 최상위 부모(객체)라고 생각하면 된다.
class Animal extends Object {
	String name;
	int age;	
		
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void howling() {
		System.out.println("운다");
	}
}

// super();  << 내 바로위의 부모를 뜻함
// this 자기자신
class Cat extends Animal {	

	public Cat(){
		super("", 0);		
	}

	void lick() {
		System.out.printf("%s가 핥다\n", name);
	}
	
	// 오버로딩은 같은 이름의 메소드를 여러개만들때
	// 오버라이딩은 부모에게 있는 메소드의 내용을 바꾸고싶은때
	@Override
	void howling() {
		System.out.println("야옹");
	}
}

class koShort extends Cat {

	void pee() {
		System.out.printf("%s가 소변을 본다\n", name);
	}
	
}
