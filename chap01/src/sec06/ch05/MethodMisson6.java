package sec06.ch05;

public class MethodMisson6 {

	public static int getRandomScore(int n1, int n2) {
		return (int) (Math.random() * (n2 - n1 + 1)) + n1;
		
	}

	public static int getGrade(int n) {
		if (n >= 90) {
			return n = 'A';
		} else if (n >= 80) {
			return n = 'B';
		} else if (n >= 70) {
			return n = 'C';
		} else if (n >= 60) {
			return n = 'D';
		} else {
			return n = 'E';
		}
	}

	public static int getGradeSign(int n) {
		if (n % 10 > 7 || n % 100 == 0) {
			return n = '+';
		} else if (n % 10 < 4) {
			return n = '-';
		} else {
			return n = ' ';
		}
	}

	public static void main(String[] args) {

		int score = getRandomScore(50, 100);
		System.out.println("score = " + score);

		char grade = (char) getGrade(score);
		char gradeSign = (char) getGradeSign(score);

		System.out.printf("%d : %c%c\n", score, grade, gradeSign);

	}
}