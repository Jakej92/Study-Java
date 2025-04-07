package exceptionTest;

// Exception을 상속받으면,
// 사용자 예외는 발생시키는 순간 try ~ catch로 잡아서 처리해야 한다.

// RuntimeException을 사용하면,
// 사용자 예외는 발생시켰을 때 try ~ catch를 강제하지 않는다.
public class NicknameException extends Exception /*RuntimeException*/{
	public NicknameException() {;} // 기본 생성자
	
	public NicknameException(String message) { // 메세지를 받아오는 생성자
		super(message); // 부모 클래스의 생성자를 호출 후 메세지를 초기화해줌
	}
}
