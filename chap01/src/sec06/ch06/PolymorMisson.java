package sec06.ch06;

public class PolymorMisson {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
		
		PolymorMisson pm = new PolymorMisson();
		
		pm.cry(cat);
		pm.cry(pig);
		pm.cry(hamster);
	}
	// static 안붙으면 PolymorMisson을 객체화 해줘야 가능
	void cry(Animal cry) {
		cry.howling();		
	}

}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~ 꿀");
	}
}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("찍! 찍!");
	}
}