package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMisson3 {
	public static void main(String[] args) {

		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 2000 };

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.print("돈을 주입해 주세요 : ");
		int money = scan.nextInt();
		while (true) {
			System.out.println("<메뉴>");
			for (int i = 0; i < menuPriceArr.length; i++) {
				System.out.printf("%d. %s (%,d원)\n", i + 1, menuNmArr[i], menuPriceArr[i]);
			}
			System.out.print("선택 > ");
			int select = scan.nextInt();
			
			if (select == 0) {
				
				System.out.printf("종료 - 사용한 금액은 : %,d원\n", sum);
				System.out.printf("종료 - 남은 금액은 : %,d원\n", money);
				break;
			} else if (select >= 1 && select <= menuNmArr.length) {
				if(money < menuPriceArr[select-1]) { 
					System.out.printf("금액이 부족합니다. (남은 금액 %,d원)\n", money);
					continue;					
				}				
				sum = sum + menuPriceArr[select-1];
				money = money - menuPriceArr[select-1];
				System.out.printf("%s를 선택하셨습니다.\n", menuNmArr[select - 1]);
				System.out.printf("현재까지 사용한 금액은 : %,d원입니다.\n", sum);
				System.out.printf("현재까지 남은 금액은 : %,d원입니다.\n", money);
			}
			else {
				System.out.println("잘못선택하셨습니다.");
			}
			System.out.println();
		}
	}
}