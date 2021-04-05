package sec06.ch05;

public class MethodMisson5 {

	public static void printStarLine(int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("*");
		}
	}

	public static void printStarSqure(int n) {
		for (int i = 0; i < n; i++) {
			printStarLine(n);
			System.out.println();
		}
	}

	public static void printStarTri(int n) {				
		
		for(int i = 1 ; i <= n ; i++) {
			printStarLine(i);
			System.out.println();
		}
		
		for(int i = n ; i >= 0 ; i--) {
			printStarLine(n-i);
			System.out.println();
		}
	}

	// 중볻된 소스 최대한 제거
	// 메소드 재활용 !!!
	public static void main(String[] args) {

		int star = 5;
//		printStarLine(star);// *****
//		printStarSqure(star);
		printStarTri(star);

		System.out.println();

		star = 3;
//		printStarLine(star);// ***
//		printStarSqure(star);
		printStarTri(star);
	}

}