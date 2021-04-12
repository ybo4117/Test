package sec06.ch07;

public abstract class Animal {
	private int age;
	private String name;	
	
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
	
	public void breath() {
		System.out.println("숨쉰다.");
	}
	
	public abstract void howling(); // 구현부가 없는것을 추상메소드라 함
}

class Cat extends Animal{

	@Override
	public void howling() {
		System.out.println("야옹 ~~ 야옹~");
		
	}
	
}

class Dog extends Animal{

	@Override
	public void howling() {
		System.out.println("멍! 멍!");
		
	}
	
}