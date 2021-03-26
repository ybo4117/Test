package sec06.ch04;

public class IfMisson3 {
	public static void main(String[] args) {
		final int SCORE = (int)(Math.random()*40) + 61;
		System.out.println("SCORE : " + SCORE);
		// SCORE 값은 61~100 점 사이의 값이 된다. (실행할때마다 달라짐)
		int result = SCORE%10; // 0~3 , 4~6, 6~9 
		String grade = ""; // 등급
		String sign_grade = ""; // 등호
		
		if (SCORE > 90) {
			grade = "A";
		} else if (SCORE > 80) {
			grade = "B";
		} else if (SCORE > 70) {
			grade = "C";
		} else {
			grade = "D";
		}

		if (result == 0 || result > 6) {
			sign_grade = "+";
		} else if (result < 4) {
			sign_grade = "-";
		}

		System.out.printf("당신의 등급은 : %s%s", grade, sign_grade);
		
//		if(SCORE > 90) { grade = "A"; }
//		else if (SCORE > 80){ grade = "B"; }
//		else if (SCORE > 70){ grade = "C"; }
//		else{ grade = "D"; }
//		
//		if(result == 0 || result > 6) { sign_grade = "+"; }
//		else if(result < 4) { sign_grade = "-"; }
//				
//		System.out.printf("당신의 등급은 : %s%s", grade, sign_grade);
		
		
	}
}