package sec06.ch05;

public class MethodMisson8 {

	public static void gugudan(int n) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n * i);
		}
	}

	public static void gugudan(int n1, int n2) {
		for (int i = 2; i <= 9; i++) {
			gugudan(i);
			System.out.println("-----------------");
		}
	}

	public static void main(String[] args) {

		gugudan(9);
		System.out.println("-----------------");
		gugudan(2, 8);
	}
}