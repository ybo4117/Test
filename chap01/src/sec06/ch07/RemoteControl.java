package sec06.ch07;

public interface RemoteControl {
	public final static int AGE = 10; // public final static << 요녀석이 생략되어있다.
	
	public abstract void volumeUp(); // public abstract <<요녀석이 생략되어있다
	abstract void volumeDown();
	void chkVolume();
}


/*
 * 		추상클래스						인터페이스
 * 		객체화 불가능					객체화 불가능
 * 		부모타입 역할					부모타입 역할
 *  자식한테 추상 메소드					자식한테 추상 메소드
 *  오버라이딩 강제성 부여				오버라이딩 강제성 부여
 *  
 * 
 *  	다중 상속 x					다중 상속 O
 *  	변수 가질수 있음				변수 가질수 없음	
 *  	상수 가질수 있음				(상수만 가질 수 있음)
 *  구현부 있는 메소드 가질수 있음			구현부에 있는 메소드 가질 수 없음
 *  추상 메소드 가질수 있음				(추상 메소드만 가질수 있음)
 *  
 */
