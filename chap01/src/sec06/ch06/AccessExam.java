package sec06.ch06;

public class AccessExam {

	public static void main(String[] args) {
		Access acc = new Access();
//		acc.printNum(); << private void printNum() private를 가지고 있기때문에 사용 불가능

	}

}

class Access {
	private int num;

	private void printNum() {
		num = 10;
		System.out.println("num : " + num);
	}

}
