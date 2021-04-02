package sec06.ch05;

public class MethodMisson2 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		double result = divide(10, 3);
		System.out.println("result : " + result);

		result = divide(10, 5);
		System.out.println("result : " + result);

		System.out.println("절대값 : " + abs(10)); // 10
		System.out.println("절대값 : " + abs(-10)); // 10
	}

	public static double divide(int n1, int n2) {
		return (double) n1 / n2;
	}

	public static int abs(int n) {
		if (n < 0) {
			return -n;
		}
		return n;

	}
}