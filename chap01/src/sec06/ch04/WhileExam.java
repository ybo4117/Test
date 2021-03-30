package sec06.ch04;

public class WhileExam {
	public static void main(String[] args) {
		// while문은 조건식이 true인 동안 반복함
		// for문 과 while문의 차이
		// for문은 내가 몇번 반복해야하는지 알때 많이 쓰임
		// While문은 내가 언제 반복을 끝내야하는지 알때 많이 쓰임
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("i : " + i);
		}
		System.out.println();
		int i = 0 ;
		while(i < 5) {
			System.out.println("i : " + i);
			i++;
		}
		
	}
}