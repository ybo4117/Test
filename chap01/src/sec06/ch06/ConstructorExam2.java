package sec06.ch06;

public class ConstructorExam2 {
	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
	}

}

class Tv2 {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		super();
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}

	Tv2() {
		this("일렉트로", 50, 100, 50);
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