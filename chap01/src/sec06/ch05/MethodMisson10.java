package sec06.ch05;

import java.util.Scanner;

public class MethodMisson10 {

//	public static void printMenu1(String[] menuNmArr, int[] menuPriceArr) {
//		System.out.println("<메뉴>");
//		for(int i = 0 ; i < menuNmArr.length ; i++) {
//			System.out.printf("%d. %s (%,d)원\n", i+1, menuNmArr[i], menuPriceArr[i]);
//		}
//	}

	// 아래방법에 익숙해야함
	public static void printMenu2(String[] menuNmArr, int[] menuPriceArr) {
		String str = "<메뉴>\n";
		str += "0. 종료\n";
		for (int i = 0; i < menuNmArr.length; i++) {
			str += String.format("%d. %s (%,d)원\n", i + 1, menuNmArr[i], menuPriceArr[i]);
		}
		System.out.println(str);
	}

	public static void printMenu3(Drink[] drinkArr) {
		String str = "<메뉴>\n";
		str += "0. 종료\n";
		System.out.print(str);
		for (int i = 0; i < drinkArr.length; i++) {
			System.out.printf("%d. %s (%,d)원\n", i + 1, drinkArr[i].nm, drinkArr[i].price);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };

		Drink[] drinkArr = new Drink[6];
		for (int i = 0; i < drinkArr.length; i++) {
			Drink drink = new Drink();
			drink.nm = menuNmArr[i];
			drink.price = menuPriceArr[i];

			drinkArr[i] = drink;
		}

//		for(int i = 0 ; i < drinkArr.length ; i++) {
//			Drink drink = drinkArr[i];
//			System.out.printf("%d. %s (%,d)원\n", i+1, drink.nm, drink.price);
//		}

		printMenu3(drinkArr);

	}
}