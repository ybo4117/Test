package sec06.ch05;

public class ArrayMisson {
	public static void main(String[] args) {
		//정수형 배열 생성(10칸)
		//모든방에 정수값 20을 세팅
		
		int[] intArr = new int[20];
		
		
		for(int i = 0 ; i < intArr.length ; i++) {
			intArr[i]=20;
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
		
	}
}