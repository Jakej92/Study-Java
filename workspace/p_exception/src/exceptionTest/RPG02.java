package exceptionTest;

import java.util.Scanner;

public class RPG02 {
//	캐릭터 이름을 입력받고,
//	"멍청이", "바보", "똥개"가 포함된 이름은
//	예외를 발생시켜 사용자에게 경고 메세지를 출력해준다.
//	※ 강제 종료하지 않는다.
//	닉네임을 체크해주는 메소드로 문자열 nickname을 받아서 NicknameException을 던져줌
	void checkNickname(String nickname) throws NicknameException {
//		문자열 배열 arName에 멍청이 바보 똥개를 넣어줌
		String[] arName = { "멍청이", "바보", "똥개" };
//		arName의 length만큼 반복해서 검사함
		for (int i = 0; i < arName.length; i++) {
//			만약 닉네임에 arName 배열에 있는 문자열을 포함했다면
			if (nickname.contains(arName[i])) {
				throw new NicknameException(); // NicknameException을 던져줌(발생시킴)
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너 호출
		RPG02 rpg = new RPG02(); // 클래스 RPG02를 rpg로 사용함
		String message = "캐릭터명: "; // 캐릭터명을 입력해달라는 message
		String nickname = null; // 문자열타입의 nickname을 초기화

		System.out.print(message); // message를 출력
		nickname = sc.next(); // nickname을 입력받아옴

		try { // 오류 날 가능성이 있는 코드를 try에 담아줌
//			Rpg02클래스 checkNickname메소드에 입력받은 nickname을 넣어줌
			rpg.checkNickname(nickname);
			System.out.println("캐릭터명: " + nickname); // 캐릭터명이 뭔지 출력해줌
		} catch (NicknameException e) { // 만약 NicknameException 오류에 걸린다면
			System.out.println("사용할 수 없는 닉네임입니다."); // 사용할수없다고 출력해줌
		}
	}
}
