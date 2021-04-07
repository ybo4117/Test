package sec06.ch06;

public class ConstructorExam {
	// 생성자
	// 객체지향 언어는 모두 생성자를 사용한다.
	// 생성자는 객체가 만들어질 때 무조건 호출을 해야한다.

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.brand = "Samsung";
		tv1.inch = 100;
		tv1.maxChannel = 100;
		tv1.maxVolume = 100;
		tv1.displayState();

		Tv tv2 = new Tv("Lg", 120, 300, 200);
		tv2.displayState();

//		tv1.volumeUp();
//		tv1.volumeUp();
//		tv1.volumeUp();
//		tv1.displayVolume(); // 현재 볼륨 : 3
//		tv2.displayVolume();

	}
}

class Tv {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	// 기본 생성자
	// 생성자 vs 메소드
	// 생성자는 이름이 클래스명이랑 같다. (Java 기준)
	// 생성자는 리턴타입이 없다.

	// 생성자는 객체 생성할때만 사용 할 수 있다.

	// 기본 생성자는 컴파일러가 생성자가 하나도 없을 시 넣어준다.

	Tv(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}

	Tv() {
	}

	void volumeUp() {
		int currentVolume = 0;
		this.currentVolume += 1; // this 는 자기자신의 주소값

	}

	void displayVolume() {
		System.out.printf("현재볼륨 : %d\n", currentVolume);

	}

	void displayState() {
		System.out.printf("%s, %dinch, %dChannel, %dVolume\n", brand, inch, maxChannel, maxVolume);
	}
}