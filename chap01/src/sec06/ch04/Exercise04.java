package sec06.ch04;

public class Exercise04 {
	public static void main(String[] args) {
		System.out.println("(실행결과)");
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.printf("(%d , %d) \n", num1, num2);
			if(num1 + num2 ==5) {
				break;
			}			
		}
		System.out.println("끝!");
		System.out.println("----------------");
		int num1 = 0 , num2 = 0;
		while(num1 + num2 != 5) {
			num1 = (int)(Math.random()*6)+1;
			num2 = (int)(Math.random()*6)+1;
			System.out.printf("(%d , %d) \n", num1, num2);						
		}
		System.out.println("끝!");
	}
}