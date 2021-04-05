package sec06.ch05;

import java.util.Scanner;

public class MethodMisson7 {

	public static String chk(String gender, int height) {
		int stand = 0;
		String result = "평균";
		switch (gender) {
		case "남":
			stand = 175;
			break;
		case "여":
			stand = 163;
			break;
		default:
			return "측정 할 수 없습니다.";
		}
		if (height > stand) {
			result = "평균 초과";
		} else if (height < stand) {
			result = "평균 미만";
		}
		return String.format("성별 : %s, 키: %dcm, %s", gender, height, result);
//		return "성별: " + gender + ", 키 : " + height + "cm, " + result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;

		do {
			System.out.print("성별 : ");
			String gender = scan.next(); // 남, 여

			System.out.print("키 : ");
			int height = scan.nextInt();

			String result = chk(gender, height);
			System.out.println(result);

			System.out.print("계속하시겠습니까? ( y , n )");
			answer = scan.next();
		} while (answer.equals("y"));
		System.out.println("끝");
		scan.close();
	}
}