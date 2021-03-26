package sec06.ch03;

public class LogicalOPeratorExam {
	public static void main(String[] args) {	
			// &&, ||, ! << 연산자 3개 and or Not
		
		boolean res1 = (1<7) && true && true; // and 연산자는 true 되기가 힘들다
		System.out.println("res1 : " + res1);
		
		boolean res2 = (10>2) || false || true; // or 연산자는 false 되기가 힘들다
		System.out.println("res2 : " + res2);
		
		System.out.println("----------------------");
		// and 의 앞에 연산이 true가 되면 뒤에 연산은 하지 않는다.
		// or 의 앞에 연산이 false가 되면 뒤에 연산은 하지 않는다.
		int n = 2;
		boolean res = true || (1 > n++);
		System.out.println("n : " + n);
		res = true || (1 < n++);
		System.out.println("n : " + n);
		res = false && (1 < n++);
		System.out.println("n : " + n);
		res = false && (1 > n++);
		System.out.println("n : " + n);
	}
}