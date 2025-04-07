package methodTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MethodTaskPractice {

////    1 ~ 10까지 println()으로 출력하는 메소드
//   void print1To10() { //	print1To10 메소드 선언, return 할게 없으므로 void 
//      for (int i = 0; i < 10; i++) { 	// for문을 이용한 반복문
//         System.out.println(i + 1);  	// i에 1을 더해줌으로 i를 1부터 시작
//      }
//   }
//
////    "홍길동"을 n번 println()으로 출력하는 메소드
//   void printHong(int n) {			// printHong 메소드 선언 return할게 없음 void
//      for (int i = 0; i < n; i++) {		// for문 n번 반복
//         System.out.println("홍길동");	// 홍길동 출력
//      }
//   }
//
////    이름을 n번 println()으로 출력하는 메소드
//   void printName(int n, String name) {	// 이름을 몇번 출력할지 모르므로 int n, String name
//      for (int i = 0; i < n; i++) {		// 이름을 n번 반복 위함.
//         System.out.println(name);		// 이름을 n번 출력해줌
//      }
//
//   }
//
////   세 정수의 뺄셈 메소드
//   int substract(int[] arData) { // 메소드에 배열을 넣어줌
//      int result = 0;			 // result를 0으로 초기화해줌
//      arData[0] *= -1;			 // -=은 0번에 있는 정수도 -가 되기때문에 *= -1 로 반전시켜줌
//      for (int i = 0; i < arData.length; i++) { // 배열에 모든 요소를 돔
//         result -= arData[i];	 // 배열에 모든요소를 - 해줌
//      }
//
//      return result;			 // result를 return
//   }
//
////   정수 1개를 입력받고, 차수도 입력받는다.
////   해당 차수만큼의 값을 구해주는 메소드 선언
//   int square(int number, int degree) {  // 입력받을 정수, 차수를 넣어줌
//      int result = 1; 		// result를 0으로 초기화해주면 곱셈결과가 항상 0 이기에 1로줌
//      for (int i = 0; i < degree; i++) { // 입력받은 차수만큼 반복
//         result *= number;			// number를 degree횟수만큼 곱해줌으로서 제곱 완성
//      }
//      return result;	// result를 return 해줌
//   }
//
////   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
////   반드시 리턴한다.
//   int[] divide(int number1, int number2) {
//      // 배열도 하나의 자료형으로 보자!
//      // int[], double[], String[]... 모든게 자료형이다.
//
//      int[] result = null;
//
//      if (number2 != 0) {	// 리턴값은 1개뿐, 배열에 담아서 2개의 결과를 하나로 만들어줌
//         result = new int[] { number1 / number2, number1 % number2 };
//      }
//
//      // 리턴값은 단 1개이다.
//      // 여러 개를 리턴한다면 꼭 묶어서 보내자
//      return result;
//   }
//
//   // 두 정수의 덧셈과 뺄셈을 구해주는 메소드
//   int[] getResult(int number1, int number2) { 
//      return new int[] { number1 + number2, number1 - number2 };
//   } // 배열 각 요소에 덧셈과 뺄셈을 해주고 값을 바로 return
//
//   // 1 ~ n까지의 합을 구해주는 메소드
//   int getTotal(int end) { 
//      int total = 0; 		// total을 0으로 초기화
//      for (int i = 0; i < end; i++) {	// 입력받을 end값 만큼 반복
//         total += i + 1;	
//      }		// 입력 받은 end값 만큼 증가하는 i를 더해줌, i는 0부터 시작해서 +1을 해줌
//      return total; 	// total을 return
//   }
//   
//   // 홀수는 짝수로, 짝수는 홀수로 리턴
//   int change(int number) {
//      return ++number; 		// number에 ++로 1을 증가시켜줌으로써 홀수는 짝수로
//   }						// 짝수는 홀수로 만들어줌
   
//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//   int[] getMaxAndMin(int[] arData) {
//      int[] result = new int[2]; // 최대값과 최소값 2개만 필요하므로 int[2]
//      
//      result[0] = arData[0];	// result[0]을 arData[0]으로 초기화
//      result[1] = arData[0];	// result[1]을 arData[0]으로 초기화
//      
//      for (int i = 0; i < arData.length; i++) { // 입력받을 arData 수만큼 반복
//         if(result[0] < arData[i]) {	// 0번방에 최대값을 찾아주기
//            result[0] = arData[i];		// 찾은 최대값을 먹여줌
//         }
//         if(result[1] > arData[i]) {	// 1번방에 넣을 최소값을 찾기
//            result[1] = arData[i];		// 찾은 최소값을 1번방에 넣어줌
//         }
//      }
//      
//      return result;
//   }

//   ★ 고수만 하기
//   위에서 해결한 문제를 아래의 방법으로 해결한다.
//   리턴 타입은 void로 설정하고, 사용하는 부분에서 메소드 내부의 결과값을 사용할 수 있도록 구현
   
//   void getMaxAndMin(int[] arData, int[] result) { // return타입은 void, 결과를 저장할 result도 매개변수로 넣어줌.
////	      int[] result = new int[2];
//	      
//	      result[0] = arData[0];	// result 0번에 arData0을 넣어 최대값의 초기값으로 먹여줌
//	      result[1] = arData[0];	// result 1번에 arData0을 넣어 최소값의 초기값으로 먹여줌
//	      
//	      for (int i = 0; i < arData.length; i++) { // arData.length만큼 반복
//	         if(result[0] < arData[i]) { 	// 현재 최대값 result[0]번이 arData에 넣은 값 보다 작으면,
//	            result[0] = arData[i];		// 그 값을 result[0]번에 넣어 최대값 갱신
//	         }
//	         if(result[1] > arData[i]) {	// 현재 최소값 result[1]번이 arData에 넣은 값 보다 크면,
//	            result[1] = arData[i];		// 그 값을 result[1]번에 넣어 최소값 갱신
//	         }
//	      }   
//	   }
   
//  =================================[1]=======================================================
	
//   	정수 2개를 입력받고 차수도 각각 입력받는다.
//   	해당 차수만큼 값을 구해주는 메소드를 만든다.
	
	void square(int[] numbers, int[] degrees) { // square 메소드 -  정수 받을 배열 , 차수 받을 배열 
		
		int result0 = 1;	// 결과 값을 담을 result0을 1로 초기화
		int result1 = 1;	// 결과 값을 담을 result1을 1로 초기화
		for (int i = 0; i <degrees[0]; i++) { // degrees 0번방에 들어갈 차수 만큼 반복
			result0 *= numbers[0];			  // numbers 0번방에 받은 정수를 degrees 0번방에 들어갈 차수 만큼 곱해줌
		} for (int i = 0; i < degrees[1]; i++){ // degrees 1번방에 들어갈 차수 만큼 반복
			result1 *= numbers[1]; 			  // numbers 1번방에 받은 정수를 degrees 1번방에 들어갈 차수 만큼 곱해줌
		}		
		System.out.println(numbers[0]+"에 "+ degrees[0]+ " 제곱은?\n" + result0);
		System.out.println(numbers[1]+"에 "+ degrees[1]+ " 제곱은?\n" + result1);
	}			// 2개의 출력 메세지
	
//  =================================[2]=======================================================

//	두 정수의 덧셈과 뺄셈을 배열에 담아 출력
	int[] calculate(int[] numbers) {  // 배열 메소드를 선언과 사용
		
		int[] result = null;	// result1,2를 담을 배열 result을 선언하고 null로 초기화
		
		int result1 = numbers[0] + numbers[1]; // result1 이라는 저장공간에 number0,1 값을 더해줌
		int result2 = numbers[0] - numbers[1]; // result2 라는 저장공간에 number0번값-1번값 을 해줌
		result = new int[] {result1, result2}; // result라는 배열에 result1,2를 담아줌
		return result; // 결과 배열을 반환함
	}
	
//  =================================[3]=======================================================

//	이름과 나이를 n번 출력
	
	void printNameNAge(int n, int age, String name) { // n, age, name을 매개변수로 받아 출력하는 메소드
		for(int i = 0; i < n; i++) { // 반복문을 사용하여 0부터 n미만으로 반복해줌
			System.out.println(i+1 +". 이름: " + name + " / 나이:" + age); // 메인메소드에서 받을 이름과 나이를 출력해줌
		}
	}
	
//  =================================[4]=======================================================
	
//	배열 칸수를 n 만큼 입력받아 출력
	Scanner sc= new Scanner(System.in); // 스캐너 호출
	void arrangement(int[] arg, int length, Scanner sc) { // 배열 agr와 정수 length를 매개변수로 받아 출력하는 메소드
        for (int i = 0; i < length; i++) { // 사용자가 입력한 length 만큼 반복해줌
            System.out.println((i + 1) + "번 정수를 입력하세요:"); // 사용자가 입력한 length 만큼 출력해줌
            arg[i] = sc.nextInt(); // 배열 요소 입력 
        }
        
        System.out.println("입력된 배열: " + Arrays.toString(arg));  // Arrays.toString()에 배열arg를 넣어 배열로 출력함
    }

	
//  =================================[5]=======================================================
	
//	1~n 번까지 출력
	
	void print1ToN(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(i+1 + "\n");
		}
	}
	
	
//  =================================[6]=======================================================
	
//	하나의 배열안에 두 요소를 입력받아 낮은 정수 부터 높은정수까지 출력
	
//	int[] printXToY(int[] arData) {
//		int[] result6 = new int[2];
//		result6[0] = arData[0];
//		result6[1] = arData[0];
//		
//		for (int i = 0; i < arData.length; i++) {
//			if(result6[0] < arData[i]) {
//				result6[0] = arData[i];
//			} if (result6[1] > arData[i]) {
//				result6[1] = arData[i];
//			}
//			for(int j = 0; j < result6[0]; j++ ) {
//				j = result6[1];
//				System.out.println(j);
//			}
//		}
//		return result6;
//	}
	
	void printXToY(int[] arData) {
        
        if (arData.length < 2) {  // 배열에 최소 두 개의 값이 있는지 확인
            System.out.println("배열에는 최소 두 개의 값이 필요합니다.");  // 조건 미충족 시 메시지 출력
            return; // 메서드 종료
        }

        // 배열의 첫 번째 값과 두 번째 값을 비교하여 최대값과 최소값을 구함
        int max = Math.max(arData[0], arData[1]);  // 두 값 중 더 큰 값을 max에 저장
        int min = Math.min(arData[0], arData[1]);  // 두 값 중 더 작은 값을 min에 저장

        
        for (int i = min; i <= max; i++) {  // 최소값부터 최대값까지 반복하며 숫자를 출력
            System.out.print(i + " ");  // 각 숫자를 공백으로 구분하여 출력
        }
        System.out.println(); // 출력 완료 후 줄바꿈
    }
	
//  =================================[7]=======================================================
	
//	하나의 배열안에 두 요소를 입력받아 낮은 정수 부터 높은정수까지 역순으로 출력
	
	void printMinToMax(int[] arData) {
		if (arData.length < 2) {  // 배열에 최소 두 개의 값이 있는지 확인
            System.out.println("배열에는 최소 두 개의 값이 필요합니다.");  // 배열이 2개보다 많으면 메시지 출력
            return; // 배열이 2개보다 많으면 메서드 종료
        }
		int min = Math.min(arData[0], arData[1]); // Math.min 이용해서 배열 0, 1 중에 min값을 찾음
		int max = Math.max(arData[0], arData[1]); // Math.max 이용해서 배열 0, 1 중에 max값을 찾음
		
		for (int i = max; i >= min; i--) { // i = max로 초기화 후 최소를 min으로 초기화, max인 i에서부터 -- 
			System.out.print(i + " "); // max부터 min까지 출력과 " " 를 이용해서 한칸씩 띄어줌
		}
		System.out.println(); // 출력 후 다음 문제 출력을 위해 줄을 바꿔줌
	}
	
//  =================================[8]=======================================================

//	배열 최대값과 최소값 찾기
//	사용자로부터 정수 배열을 입력받습니다. 배열에서 가장 큰 값과 가장 작은 값을 찾아 출력하세요.
	
	int[] findMaxAndMin(int[] arData) {
		
      int[] result = new int[2]; // 최대값과 최소값 2개만 필요하므로 int[2]
      
      result[0] = arData[0];	// result[0]을 arData[0]으로 초기화
      result[1] = arData[0];	// result[1]을 arData[0]으로 초기화
      
      for (int i = 0; i < arData.length; i++) { // 입력받을 arData 수만큼 반복
         if(result[0] < arData[i]) {	// 0번방에 최대값을 찾아주기
            result[0] = arData[i];		// 찾은 최대값을 먹여줌
         }
         if(result[1] > arData[i]) {	// 1번방에 넣을 최소값을 찾기
            result[1] = arData[i];		// 찾은 최소값을 1번방에 넣어줌
         }
      }
      
      return result;
   }
	
	
   public static void main(String[] args) {
      MethodTaskPractice m = new MethodTaskPractice(); // 메소드를 선언하고, 사용하기 위해 메인을 담고있는 클래스를 호출
      
//      int result = 0;
//      int[] arResult = null;
//      String message = null;
//
//      m.print1To10(); 
//      m.printHong(10);
//      m.printName(10, "한동석");
//
//      result = m.substract(new int[] { 1, 3, 5 });
//      System.out.println(result);
//
//      result = m.square(2, 10);
//      System.out.println(result);
//
//      arResult = m.divide(10, 3);
//
//      if (arResult == null) {
//         System.out.println("0으로 나눌 수 없습니다.");
//      } else {
//         System.out.println("몫: " + arResult[0] + ", 나머지: " + arResult[1]);
//      }
//
//      arResult = m.getResult(10, 4);
//      System.out.println(arResult[0] + ", " + arResult[1]);
//
//      message = m.change(10) % 2 == 0 ? "짝수로 변경되었습니다." : "홀수로 변경되었습니다.";
//      System.out.println(message);
      
//      arResult = m.getMaxAndMin(new int[] { 1, 3, 5, 9, 10 });
      
//      System.out.println("최대값: " + arResult[0] + ", 최소값: " + arResult[1]);
      
//      다이아 문제

//      	int[] arData = { 25, 3, -25, 9, 10}; // arData 배열에 넣을 값을 정해줌
//      	int[] result = new int[2]; 			 // main 메소드 안에서 선언 메인메소드를 사용하기위함
//      										 // 결과를 저장할 result를 최대값, 최소값을 위한 2칸으로 지정해줌 
//      
//      	m.getMaxAndMin(arData, result); // m 클래스에 getMaxAndMin 메소드를 호출. 최대값, 최소값을 불러옴
//      	
//      	System.out.println("최대값: " + result[0] + "최소값: " + result[1]);
      
//    =================================[1]=======================================================
      
      int[] numbers = {5, 7}; // m.square에 넣어줄 numbers 배열을 선언하고, 5와 7이라는 값으로 초기화해줌
      int[] degrees = {3, 3}; // m.square에 넣어줄 degrees 배열을 선언하고, 3와 3이라는 값으로 초기화해줌
      
      m.square(numbers, degrees); // m.square에 출력할 numbers, degrees를 넣어줌
      
//    =================================[2]=======================================================
     
      int[] number = {10, 5}; // m.calculate 메소드에서 사용할 number 배열을 선언하고 요소(10,5)를 채워줌
      int[] result = m.calculate(number); // m.calculate 메소드에 number를 호출하여 덧셈과 뺄셈 결과를 반환받아 result 배열에 저장
      
      System.out.println("덧셈 결과: " + result[0]); // 덧셈결과는 m.calculate에서 0번방에 담았으므로 result[0]
      System.out.println("뺄셈 결과: " + result[1]); // 뺄셈 결과는 m.calculate에서 1번방에 담았으므로 result[1]을 출력함
      
//    =================================[3]=======================================================
      
      m.printNameNAge(3, 23, "정도영"); // m.printNameNAge메소드에 3,23,정도영 을 넣어서 출력해줌
      
//    =================================[4]=======================================================
      
      Scanner sc = new Scanner(System.in);

      System.out.println("배열의 칸수를 입력하세요:");
      int length = sc.nextInt(); // 배열 크기 입력

      int[] arg = new int[length]; // 배열 초기화

      m.arrangement(arg, length, sc); // arrangement 메서드 호출

//    =================================[5]=======================================================

      m.print1ToN(9);
      
//    =================================[6]=======================================================

      int[] printXnY = {4, 10};
      m.printXToY(printXnY);
      
//    =================================[7]=======================================================

      m.printMinToMax(printXnY);
  	
//    =================================[8]=======================================================
      
   // 배열의 크기 입력
      System.out.println("배열의 칸수를 입력하세요:");
      int n = sc.nextInt();
      
      // 배열 생성 및 값 입력
      int[] arg8 = new int[n];
      System.out.println("배열의 요소를 입력하세요:");
      for (int i = 0; i < n; i++) {
          System.out.print((i + 1) + "번째 값: ");
          arg8[i] = sc.nextInt();
      }
      
      // 최대값과 최소값 찾기
      int[] result8 = m.findMaxAndMin(arg8);
      
      // 결과 출력
      System.out.println("최대값: " + result8[0]);
      System.out.println("최소값: " + result8[1]);

      
      sc.close();
   }
}

















