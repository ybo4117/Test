package sec06.ch07;

public class AbstExam {
	
	public static void main(String[] args) {
//		Animal animal = new Animal(); // << 추상 클래스는 자식들만 가리키겠다는 뜻
		
		
		Animal ani = new Cat();
		ani.breath();
		ani.howling();
	}
}