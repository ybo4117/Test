package sec06.ch06;

import sec06.ch06.acc.Access2;

public class AccessExam2 {

	public static void main(String[] args) {
		Access acc = new Access();
		//acc.num << private 때문에 쓸수없음
		
		Access2 acc2 = new Access2();
	}
}