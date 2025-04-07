package lambdaTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyMath {
	public static Calc operate(String oper) {
		// oper가 +면 두 정수의 덧셈으로 구현하여 리턴
		// oper가 -면 두 정수의 뺄셈으로 구현하여 리턴
		return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
	} // 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // sc로 스캐너 호출
		String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요."; // 출력메세지
		String example = "예)9+7-5"; // 출력메세지
		String expression = null; // 문자열 타입의 expression을 null로 초기화
		String[] opers = null; // 문자열 배열 타입의 opers를 null로 초기화
		String[] temp = null; // 문자열 배열 타입의 temp를 null로 초기화
		int number1 = 0, number2 = 0; // int number1, number2를 0으로 초기화

		System.out.println(message); // 메세지 출력
		System.out.println(example); // example메세지 출력
		expression = sc.next(); // expression을 입력받음

//		사용자가 입력한 expression에서 +와 -를 추출한다.
		OperCheck operCheck = (e) -> { // Lambda(->)식을 이용하여 OperCheck interface구현
			String result = ""; // result를 ""로 초기화
			// 하나씩 문자 검사해서 + 또는 -면 계속 연결
			for (int i = 0; i < e.length(); i++) { 
				char c = e.charAt(i); // 문자를 하나씩 검사함
				if (c == '+' || c == '-') {  // 만약 문자가 +거나 -라면
					result += c; // 해당 문자를 result문자열에 추가해줌
				}
			}
			return result.split(""); // "" 기준으로 배열로 나눠줌
		};

// opers에 operCheck 객체의 getOpers 메서드를 호출한 결과를 저장 (expression 입력값 사용)
		opers = operCheck.getOpers(expression); 
//		식을 + , - 기준 배열로 나눠줌
		temp = expression.split("\\+|\\-");
//		0번방에 담긴수가 음수인지를 확인해줌
		number1 = Integer.parseInt(temp[0].equals("") ? opers[0] + temp[1] : temp[0]);
		for (int i = 0; i < opers.length; i++) {  // opers의 length만큼 반복해줌
			if(i == 0 && number1 < 0) {continue;} // 음수로 시작하면 첫번째를 건너 뛰어줌
			number2 = Integer.parseInt(temp[i + 1]); // 현재 연산자에 2번째를 가져옴
//			연산을 수행해줌
			number1 = MyMath.operate(opers[i]).calc(number1, number2); 
		}
		
		System.out.println(number1); // 결과를 출력함
	}
}

















