package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5개의 정수만 입력받기
//		- 무한 입력 상태로 구현(5번 이상 입력 가능)
//		- q 입력 시 나가기
//		- 각 정수는 배열에 담기
//		- if문은 딱 한 번만 사용하기(q입력 시 나가기)
		int[] arData = new int[5]; // 5칸 배열 선언
		Scanner sc = new Scanner(System.in); // 스캐너 호출
		String temp = null; // 문자열 타입 temp를 null로 초기화
		int count = 0; // 정수형 배열 count를 0으로 초기화

		while (true) { // 반복문 사용
			System.out.print(++count + "번째 정수: "); // 1씩 증가시키며 몇번째 정수입력 요청
			temp = sc.next(); // temp를 입력받음

			if (temp.equals("q")) { // 만약 q를 입력하면
				break; // 반복문 탈출
			}

//			오류 상황
			try { // 오류가 발생 할 가능성이있는 코드를 try에 담아줌
//				문자열 temp를 정수로 변환 후 배열 arData의 count - 1 번째 인덱스에 저장
				arData[count - 1] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
//				정수가 아닌 다른 것을 입력했을 때
				System.out.println("정수만 입력해주세요."); // 정수만 입력해달라는 메세지 출력
				count--; // 카운트를 하지않음
			} catch (ArrayIndexOutOfBoundsException e) {
//				6번째 정수를 입력했을 때
				System.out.println("5개 정수까지만 입력이 가능합니다."); // 5개만 입력해달라 출력
				break; // 탈출
			} catch (Exception e) { // 모든오류를 잡아줌
				e.printStackTrace(); // 오류 내용 출력해줌
				System.out.println("다시 시도해주세요."); // 다시 시도해달라 요청
			}
		}
//		for 반복문으로 arData배열의 length 만큼 증가하며 반복해줌
		for (int i = 0; i < arData.length; i++) {
			System.out.print(arData[i] + " "); // 정수 뒤에 띄어 쓰기를 추가해서 한줄로 출력
		}

		System.out.println(); // 줄을 바꿔줌

	}
}
