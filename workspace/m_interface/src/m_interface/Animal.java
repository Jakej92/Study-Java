package m_interface;

public interface Animal {
//	final static int eyes = 2; 
// interface는 구현이 안되서 객체화 해서 쓸수가없음
	int eyes = 2; // interface는 무조건 상수와 추상메소드뿐이없음.
	int nose = 1; // 그래서 앞에 final static이 생략됨.
	
//	abstract void showHands();
	void showHands(); // 앞에 abstract가 생략됨
	void sitDown();
	void poop();
	void waitNow();
}
