package sec06.ch06;

public class StaticExam4 {

	public static void main(String[] args) {
		// CalcInstance2 객체화
		// num1 = 10, num2 = 20;
		// 더한 값을 콘솔에 출력
		ClacInstance2 ci2 = new ClacInstance2();
		ci2.num1 = 10;
		ci2.num2 = 20;
		int result = ci2.num1 + ci2.num2;
		System.out.println(result);
		
		String.format("%d", result);

	}

}

class CalcStatic2 {
	static int num1;
	static int num2;

	static int sum() {
		return num1 + num2;
	}
}

class ClacInstance2 {
	int num1;
	int num2;

	int sum() {
		return num1 + num2;
	}

	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}
