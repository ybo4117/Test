package sec06.ch06;

public class PolymorMisson {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster();

		Hamster ham = (Hamster) hamster;
		ham.runRail();

		((Hamster) hamster).runRail();

		System.out.println(hamster instanceof Hamster); // 좌측 주소값이 오른쪽 값으로 형변환이 가능한지 알아보는 녀석
		System.out.println(pig instanceof Hamster); //

		PolymorMisson pm = new PolymorMisson();

		pm.cry(cat);
		PolymorMisson.cry(pig);
		cry(hamster);
	}

	// static 안붙으면 PolymorMisson을 객체화 해줘야 가능
	static void cry(Animal ani) {
		if (ani instanceof Hamster) {
			((Hamster) ani).runRail();
		} else {
			ani.howling();
		}
	}

}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~ 꿀");
	}
}

class Hamster extends Animal {
//	@Override
//	void howling() {
//		System.out.println("찍! 찍!");
//	}

	public void runRail() {
		System.out.println("쳇바퀴를 굴린다.");
	}
}