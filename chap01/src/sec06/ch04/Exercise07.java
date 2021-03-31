package sec06.ch04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			int inputVal = scanner.nextInt();

			if (inputVal == 1) {
				System.out.print("예금액> ");
				inputVal = scanner.nextInt();
				balance += inputVal;
			} 
			
			else if (inputVal == 2) {
				System.out.print("출금액> ");
				inputVal = scanner.nextInt();
				balance -= inputVal;
			} 
			
			else if (inputVal == 3) {
				System.out.printf("잔고> %d\n", balance);
			} 
			
			else if (inputVal == 4) {
				break;
			} 
			
			else {
				System.out.println(" 1~4 중 골라주세요");
			}
		}
		System.out.println("프로그램 종료");
	}
}