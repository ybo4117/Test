package sec06.ch04;

public class IfMission {
	public static void main(String[] args) {

		int score = 79;

		if (score < 70) { // ~ 69
			System.out.println("D 등급");
		} else if (score < 80) { // 70 ~ 79
			System.out.println("C 등급");
		} else if (score < 90) { // 80~ 89
			System.out.println("B 등급");
		} else { // 90 ~
			System.out.println("A 등급");
		}
		System.out.println("끝");

		if (score >= 90) { // 90~
			System.out.println("A 등급");
		} else if (score >= 80) { // 80~89
			System.out.println("B 등급");
		} else if (score >= 70) { // 70~79
			System.out.println("C 등급");
		} else { // ~ 69
			System.out.println("D 등급");
		}
		System.out.println("끝"); 

	}
}