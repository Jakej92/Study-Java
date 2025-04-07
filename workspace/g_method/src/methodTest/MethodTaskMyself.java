package methodTest;

import java.util.Scanner;

public class MethodTaskMyself {

//	   ==================[1]=================
//    1 ~ 10까지 println()으로 출력하는 메소드
	void OneToTen() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println();
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
	void subtract(int num1, int num2, int num3) {
		int result = num1 - num2 - num3;
		System.out.println("세 정수의 뺄셈 결과는? " + result);
	}

//	   ==================[5]=================
//   정수 1개를 입력받고, 차수도 입력받는다.
//   해당 차수만큼의 값을 구해주는 메소드 선언
	int squar(int number, int degree) {
		int result = 1;
		for (int i = 0; i < degree; i++) {
			result *= number;
		}
		return result;
	}

//	   ==================[6]=================
//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//   반드시 리턴한다.
	int[] divide(int num1, int num2) {
		int[] result = null;
		int result1 = num1 / num2;
		int result2 = num1 % num2;
		if (num2 != 0) {
			result = new int[] { result1, result2 };
		}
		return result;

	}
//	   ==================[7]=================
// 두 정수의 덧셈과 뺄셈을 구해주는 메소드
//	void calculate(int num1, int num2) {
//		int result1 = num1 + num2;
//		int result2 = num1 - num2;
//		System.out.println("두 정수의 덧셈 결과: " + result1);
//		System.out.println("두 정수의 뺄셈 결과: " + result2);
//	}

	int[] calculate(int num1, int num2) {
		int[] result = { num1 + num2, num1 - num2 };
		return result;
	}
//	   ==================[8]=================
// 1 ~ n까지의 합을 구해주는 메소드
//	void sum1ToN(int n) {
//		int sum = 0;
//		for(int i=0; i<n; i++) {
//			sum += i + 1; 
//		}
//		System.out.println(sum);
//	}

	int sum1ToN(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i + 1;
		}
		return sum;
	}

//	   ==================[9]=================
// 홀수는 짝수로, 짝수는 홀수로 리턴
//	void change(int num) {
//		if(num %2 != 0) {
//			System.out.println(num +1);
//		} else {
//			System.out.println(num +1);
//		}
//	}
	int change(int num) {
		return ++num;
	}

//	   ==================[10]=================
//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	int[] minNmax(int[] numbers) { 
		int[] result = new int[2]; 
		
		int max = result[0]; 
		int min = result[1]; 
		max = numbers[0]; 
		min = numbers[0];
		
		
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}	if(min > numbers[i]) {
				min = numbers[i];
			}
		}return new int[] {max, min};
	}

//	   ==================[11]=================
//   ★ 고수만 하기
//   위에서 해결한 문제를 아래의 방법으로 해결한다.
//   리턴 타입은 void로 설정하고, 사용하는 부분에서 메소드 내부의 결과값을 사용할 수 있도록 구현
	
	void minNmax1(int[] numbers) {
		int[] result = new int[2];
		
		int max = result[0];
		int min = result[1];
		max = numbers[0];
		min = numbers[0];
		
		
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}			
			if(min > numbers[i]) {
				min = numbers[i];
			}
		}int[] arResult =  new int[] {max, min};
		System.out.println("최대 값: " + arResult[0] + "\n최소 값: " + arResult[1]);
	}
	

	public static void main(String[] args) {
		MethodTaskMyself m = new MethodTaskMyself();

//	   ==================[1]=================
		m.OneToTen();
//	   ==================[2]=================
		m.printHong(5);
//	   ==================[3]=================
		m.printName(3, "정도영");
//	   ==================[4]=================
		m.subtract(10, 2, 4);
//	   ==================[5]=================
		int result5 = 0;
		result5 = m.squar(5, 2);
		System.out.println(result5);
//	   ==================[6]=================
		int[] result6 = null;

		result6 = m.divide(8, 2);
		if (result6 == null) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println("몫: " + result6[0] + "나머지: " + result6[1]);
		}
//	   ==================[7]=================
		result6 = m.calculate(5, 10);
		System.out.println("덧셈 결과: " + result6[0] + ", 뺄셈 결과: " + result6[1]);
//	   ==================[8]=================
//	   m.sum1ToN(10);
		int result8 = m.sum1ToN(10);
		System.out.println(result8);
//	   ==================[9]=================
//	   m.change(4);
		int result9 = m.change(5);
		String message = result9 % 2 == 0 ? "홀수로 변경되었습니다: " : "짝수로 변경되었습니다: ";
		System.out.println(message + result9);
//	   ==================[10]=================
		int[] result10 = null;
		result10 = m.minNmax(new int[] {5,3,2,4,6});
		System.out.println("최대값: " + result10[0] + "\n최소값: " +result10[1]);
//	   ==================[11]=================
		m.minNmax1(new int[] {5,3,2,6,8});
	}
}
