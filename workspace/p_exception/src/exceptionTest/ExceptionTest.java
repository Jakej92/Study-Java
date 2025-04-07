package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
//		int[] arData = new int[5];
//
//		try {
//			System.out.println(arData[4]);
//			System.out.println("오류 없음");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		사용자에게 정수를 입력받고 10을 더해서 출력하기
//		만약, 정수가 아닌 다른 값을 입력했다면 예외를 처리해준다.
		Scanner sc = new Scanner(System.in); // 스캐너 호출
		String message = "정수 :"; // 출력하고 싶은걸 메세지에 담아줌
		int number = 0; // 정수형 타입의 number를 0으로 초기화
		
		System.out.print(message); // 메세지를 출력함
		try { // try, catch로 오류를 잡아줌
			number = sc.nextInt(); // number를 스캐너로 입력 받음
			System.out.println(number + 10); // 입력받은 number에 10을 더해줌
//		만약 InputMismatchException 오류가 난다면,
		} catch (InputMismatchException e) { 
			e.printStackTrace();  // 오류 내용 출력
			System.out.println("정수만 입력하세요."); // 정수만 입력해달라는 메세지를 출력하고
		} catch (Exception e) { // 혹시 모를 상황을 대비해 Exception를 추가로 잡아줌(모든 오류)
			e.printStackTrace(); // 오류 내용을 출력해줌
		}
	}
}


















