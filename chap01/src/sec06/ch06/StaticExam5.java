package sec06.ch06;

public class StaticExam5 {
	public static void main(String[] args) {
		n1 = 10;
		n2 = 20;
		int result = sum();
		
		System.out.println("result : " + result);
		
		StaticExam5 se5 = new StaticExam5();
		se5.n1 = 10;
		se5.n2 = 20;
		result = se5.sum();
		System.out.println(result);
		

	}

	static int n1;
	static int n2;

	public static int sum() {
		return n1 + n2;
	}

}

class Test{
	int n1;
	int n2;
	
	public int sum() {
		return n1 + n2;
	}
}