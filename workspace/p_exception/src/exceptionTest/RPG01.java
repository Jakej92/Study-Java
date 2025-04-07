package exceptionTest;

import java.util.Scanner;

public class RPG01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너 호출
		String message = "닉네임: "; // 닉네임을 요청하는 message
		String nickName = null; // nickName을 null로 초기화
		
		System.out.print(message); // 메세지를 출력해줌
		nickName = sc.next(); // nickName을 입력 받음
		
		if(nickName.contains("바보")) { // 만약 nickName에 바보가 포함된다면
//			반드시 예외를 처리할 때 사용하는 클래스
//			throw new Exception();
			
//			일부러 프로그램을 강제 종료시킬 때에 사용하는 클래스
//			throw new NicknameException("비속어 사용");
			try { // 오류가 일어날 가능성이 있는 코드를 try에 담아줌
				throw new NicknameException("비속어 사용"); // 새로운 오류를 던져서 발생시켜줌
			} catch (NicknameException e) { // 이 오류가 잡힌다면
				System.out.println("비속어는 사용하실 수 없습니다."); // 이 메세지를 출력
			}
		}else { // 위의 오류에 걸리지 않았다면
			System.out.println(nickName + " 용사님 어서오세요."); // 이 메세지를 출력
		}
		
	}
}















