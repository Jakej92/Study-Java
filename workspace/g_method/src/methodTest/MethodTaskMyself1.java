package methodTest;

import java.util.Scanner;

public class MethodTaskMyself1 {

//	   ==================[1]=================
//    1 ~ 10까지 println()으로 출력하는 메소드
	void oneToTen() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//	   ==================[2]=================
//    "홍길동"을 n번 println()으로 출력하는 메소드
	void printHong(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i + 1 + ". 홍길동");
		}
	}

//	   ==================[3]=================
//    이름을 n번 println()으로 출력하는 메소드
	void printName(int n, String name) {
		for (int i = 0; i < n; i++) {
			System.out.println(i + 1 + ". " + name);
		}
	}

//	   ==================[4]=================
//   세 정수의 뺄셈 메소드
	int subtract(int[] arData) {
		int result = 0;
		arData[0] *= -1; 
		for(int i = 0; i < arData.length; i++) {
			result -= arData[i];
		}
		return result;
	}	
//	   ==================[5]=================
//   정수 1개를 입력받고, 차수도 입력받는다.
//   해당 차수만큼의 값을 구해주는 메소드 선언
	int square(int number, int degree) {
		int result = 1; 
		for (int i = 0; i < degree; i++) {
			result *= number;
		}
		return result;
	}
//	   ==================[6]=================
//	정수 2개를 입력받고 차수도 각각 입력받는다.
//	해당 차수만큼 값을 구해주는 메소드를 만든다.
	int[] square2(int[] numbers, int[] degrees) {
	    // 결과를 저장할 배열. 입력받은 숫자 배열과 같은 크기.
	    int[] result = new int[numbers.length];

	    // 모든 숫자에 대해 처리
	    for (int i = 0; i < numbers.length; i++) {
	        int tempResult = 1; // 제곱 계산을 위한 초기값
	        
	        // 차수(degrees[i])만큼 반복해서 곱하기
	        for (int j = 0; j < degrees[i]; j++) {
	            tempResult *= numbers[i]; // 숫자를 계속 곱함
	        }
	        result[i] = tempResult; // 계산 결과를 결과 배열에 저장
	    }
	    return result; // 최종 결과 반환
	}

	
//	   ==================[7]=================
//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//   반드시 리턴한다.
	int[] divide(int num1, int num2) {
		int[] result = null;
		if(num1/num2 != 0) {
		result = new int[] {(num1 / num2) ,(num1 % num2)};
		}
		return result;
	}

//	   ==================[8]=================
// 두 정수의 덧셈과 뺄셈을 구해주는 메소드
	int[] calculate(int num1, int num2) {
		int[] result = null;
		result = new int[] {num1 + num2, num1 - num2};
		return result;
	}
//	   ==================[9]=================
// 1 ~ n까지의 합을 구해주는 메소드

//	   ==================[10]=================
// 홀수는 짝수로, 짝수는 홀수로 리턴

//	   ==================[11]=================
//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	int[] minNmax(int[] numbers) { 
	    // 결과를 저장할 배열을 선언. 크기는 2로 설정 (최댓값과 최솟값을 저장).
	    int[] result = new int[2]; 

	    // max와 min의 초기값을 입력받은 배열의 첫 번째 값으로 설정.
	    int max = numbers[0]; 
	    int min = numbers[0];

	    // 배열의 모든 값을 순회하며 최대값과 최소값을 찾음
	    for (int i = 0; i < numbers.length; i++) {
	        // 현재 값이 max보다 크면 max를 업데이트.
	        if (max < numbers[i]) {
	            max = numbers[i];
	        } 
	        
	        // 현재 값이 min보다 작으면 min을 업데이트.
	        if (min > numbers[i]) {
	            min = numbers[i];
	        }
	    }

	    // 최댓값과 최솟값을 배열에 저장하여 반환.
	    return new int[] {max, min};
	}

//	   ==================[12]=================
//   ★ 고수만 하기
//   위에서 해결한 문제를 아래의 방법으로 해결한다.
//   리턴 타입은 void로 설정하고, 사용하는 부분에서 메소드 내부의 결과값을 사용할 수 있도록 구현

	public static void main(String[] args) {
		MethodTaskMyself1 m = new MethodTaskMyself1();

//	   ==================[1]=================
		m.oneToTen();
//	   ==================[2]=================
		m.printHong(5);
//	   ==================[3]=================
		m.printName(5, "정도영");
//	   ==================[4]=================
		int result = 0;
		result = m.subtract(new int[] {5, 2, 1});
		System.out.println(result);
//	   ==================[5]=================
		result = m.square(5, 2);
		System.out.println(result);
//	   ==================[6]=================
	    int[] arResult = m.square2(new int[] {5,2}, new int[] {3,5});
		System.out.println(arResult[0]+ "\n" + arResult[1]);
//	   ==================[7]=================
		arResult = m.divide(6, 2);
		if (arResult == null) {
			System.out.println("나눌수 없습니다.");
		} else {
			System.out.println("몫:" + arResult[0] + "\n나머지: " + arResult[1]);
		}
//	   ==================[8]=================
		arResult = m.calculate(6, 3);
		System.out.println("두 정수의 덧셈: " + arResult[0] + "\n두 정수의 뺄셈: " + arResult[1]);
//	   ==================[9]=================

//	   ==================[10]================
		int[] result10 = m.minNmax(new int[] {15,39,-22,44,-10});
		System.out.println("최대값: " + result10[0] + "\n최소값: " +result10[1]);
//	   ==================[11]=================
		
	}
}
