package sec06.ch03;

public class OperatorExam {
	public static void main(String[] args) {
		//산술연산자
		int n1 = 10;
		int n2 = 3;
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println((float)n1 / n2); // float데이터타입으로 int데이터타입으로 변환 우선순위 float > int
		float result = (float)n1 / n2;
		System.out.println("result : " + result);
		System.out.println(n1 * n2);
		
		System.out.println("----------------------");
		int result2 = (3 + 4 + 5) * 6;
		System.out.println("result2 : " + result2);
		
		int mod = 10 % 4;
		System.out.println("mod : " + mod);
		
		int odd = 3 % 2; // 홀수 구하기
		int even = 6 % 2; // 짝수 구하기
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		System.out.println("----------------------");
		
		int n3 = -1; // 단항 연산자
		System.out.println("n3 : " + -n3);
		
	}

}
