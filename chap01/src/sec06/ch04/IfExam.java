package sec06.ch04;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 93;
		if (score >= 90) {
			System.out.println("score가 90보다 큽니다.");
			System.out.println("A 등급");
		}

		if (score < 90) {
			System.out.println("score가 90보다 작습니다.");
			System.out.println("B 등급");
		}

		System.out.println("끝");
		System.out.println("--------------------");
		if (score >= 90) {
			System.out.println("score가 90보다 큽니다.");
			System.out.println("A 등급");
		} else {
			System.out.println("score가 90보다 작습니다.");
			System.out.println("B 등급");
		}
		System.out.println("끝2");

	}
}