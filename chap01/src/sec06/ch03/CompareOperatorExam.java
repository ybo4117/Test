package sec06.ch03;

public class CompareOperatorExam {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		boolean result4 = (num1 < num2);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println("result4 = " + result4);
		
		System.out.println("----------------------");
		
		char ch1 = 'A'; // A = 65
		char ch2 = 'a'; // a = 97
		boolean result5 = ch1 < ch2;
		System.out.println("result5 = " + result5);
		System.out.println('a' == 97);
		System.out.println(0.1 == 0.1f);
		System.out.println(0.1 == (double)0.1f);
		
		// <, >, >=, <=, ==, != 원시형 숫자타입 (include char)
		
		System.out.println("----------------------");
		String str1 = "A";
		String str2 = "A";
		System.out.println("str1 == str2" + str1 == str2); // << 이 방법은 x
		System.out.println("str1.equals(str2) : " + str1.equals(str2)); // << 중요 문자열은 !! 변수.equals(변수) !! 비교
		
		
	}
}