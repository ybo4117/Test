package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMisson {
	public static void main(String[] args) {

		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 2000 };

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("<메뉴>");
			for (int i = 0; i < menuPriceArr.length; i++) {
				System.out.printf("%d. %s (%,d원)\n", i + 1, menuNmArr[i], menuPriceArr[i]);
			}
			System.out.print("선택> ");
			int select = scan.nextInt();

			if (select == 0) {
				System.out.printf("종료 - 사용한 금액은 : %,d원\n", sum);
				break;
			} else if (select == 1) {
				System.out.println("콜라를 선택하셨습니다.");
			} else if (select == 2) {
				System.out.println("사이다를 선택하셨습니다.");
			} else if (select == 3) {
				System.out.println("환타를 선택하셨습니다.");
			} else if (select == 4) {
				System.out.println("스프라이트를 선택하셨습니다.");
			} else if (select == 5) {
				System.out.println("망고주스를 선택하셨습니다.");
			}

			System.out.println();
		}
	}
}
