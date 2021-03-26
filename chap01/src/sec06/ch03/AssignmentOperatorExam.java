package sec06.ch03;

public class AssignmentOperatorExam {
	public static void main(String[] args) {
		int n1 = 0;
		n1 = n1 + 5;
		System.out.println("n1 : " + n1);
		
		int n2 = 0;
		n2 += 5;
		System.out.println("n2 : " + n2);
		
		int n3 = 10;
		n3 -= 4;
		System.out.println("n3 : " + n3);
		 
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		System.out.println(z);
		
		/*
		 * if( ) { System.out.println("0.0으로 못나눔"); } else { double result = z+10;
		 * System.out.println("결과 :" + result); }
		 */		
	}
}