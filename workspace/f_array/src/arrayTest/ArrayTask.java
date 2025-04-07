package arrayTest;

import java.util.Scanner;

public class ArrayTask {
   public static void main(String[] args) {
//      브론즈
//      1 ~ 10까지 배열에 담고 출력
	   
//	   int[] arNumber = new int[10];
//	   for (int i = 0; i < arNumber.length; i++) {
//		   arNumber[i] = i+1; 
//	   }
//	   for (int i = 0; i < arNumber.length; i++) {
//		   System.out.println(arNumber[i]);
//	   }
      
//      10 ~ 1까지 중 짝수만 배열에 담고 출력
	   
//	   int[] arEven = new int[5];
//	   for (int i = 0; i < arEven.length; i++) {
//		   arEven[i] = 10-i*2;
//	   }
//	   for (int i = 0; i < arEven.length; i++) {
//		   System.out.println(arEven[i]);
//	   }
	   
	   
//      1 ~ 100까지 배열에 담은 후 홀수만 출력
	   
//	   int[] arOdd = new int[50];
//	   for (int i = 0; i < arOdd.length; i++) {
//		   arOdd[i] = i*2 +1; 
//	   }
//	   for (int i = 0; i < arOdd.length; i++) {
//		   System.out.println(arOdd[i]);
//	   }
	   
	   
//      실버
      
//      1 ~ 100까지 배열에 담은 후 짝수의 합 출력
	   
//	   int[] arEven = new int[50];
//	   int arEvenTotal = 0;
//	   for (int i = 0; i < arEven.length; i++) {
//		   arEven[i] = (i+1 )*2;
//		   arEvenTotal += arEven[i]; 
//	   }
//	   System.out.println(arEvenTotal);
	   
	   
      
//      A ~ F까지 배열에 담고 출력
	   
//	   int[] arAToF = new int[6];
//	   for(int i = 0; i < arAToF.length; i++) {
//		   arAToF[i] = i + 65; 
//	   }
//	   for(int i = 0; i < arAToF.length; i++) {
//		   System.out.println((char)arAToF[i]);
//	   }
      
//      A ~ F까지 중 D 제외하고 배열에 담은 후 출력

//	   System.out.println((char)68); // = D
//	   int[] arAToF = new int[6];
//	   for(int i = 0; i < arAToF.length; i++) {
//		   arAToF[i] = i + 65;
//	   }
//		   for(int i = 0; i < arAToF.length; i++) {
//			   if(arAToF[i]!=67) {
//				   System.out.println((char)arAToF[i]);
//			   }
//	   }
	   
	   
//      골드
      
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//	   Scanner scan = new Scanner(System.in);
//	   System.out.println("아무 정수 5개를 입력하세요.");
//	   int[] arNumber = new int[5];
//	   int maxNumber = arNumber[0]; 
//	   int minNumber = arNumber[0]; 
//	   for (int i = 0; i < arNumber.length; i++) {
//		   arNumber[i] = scan.nextInt();
//		   if(arNumber[i] > maxNumber) {
//			   maxNumber = arNumber[i];
//		   }
//		   if(arNumber[i] < minNumber) {
//			   minNumber = arNumber[i];
//		   }
//	   }
//	   System.out.println(minNumber +", "+ maxNumber);
	   
//	   Scanner scan = new Scanner(System.in);
//	   System.out.println("아무 정수 5개를 입력하세요.");
//	   int[] arNumber = new int[5];
//	    
//	   for (int i = 0; i < arNumber.length; i++) {
//		   arNumber[i] = scan.nextInt();
//	   }
//	   int maxNumber = arNumber[0]; 
//	   int minNumber = arNumber[0];
//	   
//	   for (int i = 0; i < arNumber.length; i++) {
//		   if(arNumber[i] > maxNumber) {
//			   maxNumber = arNumber[i];
//		   }
//		   if(arNumber[i] < minNumber) {
//			   minNumber = arNumber[i];
//		   }
//	   }
//	   System.out.println(minNumber +", "+ maxNumber);
	   
//	   Scanner sc = new Scanner(System.in);
//
//	      int[] arUserNumber = new int[5];
//
//	      for (int i = 0; i < arUserNumber.length; i++) {
//	         System.out.println(i + 1 + " 번 째 정수를 입력하세요.");
//	         arUserNumber[i] = sc.nextInt();
//	      }
////	      5개정수 입력받고 배열에 담는다
////	      for (int i = 0; i < arUserNumber.length; i++) {
////	         System.out.println(arUserNumber[i]);
////	      }
////	      출력해서 배열에 잘 들어갔는지 확인
//
//	      int greatThan = arUserNumber[0];
//	      int lessThan = arUserNumber[0];
////	      최대값과 최소값 담을 변수 생성
//
//	      for (int i = 0; i < arUserNumber.length; i++) {
//	         if (lessThan > arUserNumber[i]) {
//	            lessThan = arUserNumber[i];
//	         } else if (greatThan < arUserNumber[i]) {
//	            greatThan = arUserNumber[i];
//	         }
//	      }
//
//	      System.out.println(greatThan);
//	      System.out.println(lessThan);
	   
//      
//      다이아
//      사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 입력받는다.
//      입력한 정수들의 평균값을 구한다(소수점 2째자리).
//	   Scanner scan = new Scanner(System.in);
//	   int[] arInput = null;
//	   for (int i = 0; i <arInput.length; i++) {
//		   arInput[i] = scan.nextInt();
//		   System.out.println(arInput[i]);
//		   
//	   }
	   
	   
//     브론즈
//     1 ~ 10까지 배열에 담고 출력
//     int[] arData = new int[10];
//     
//     for (int i = 0; i < arData.length; i++) {
//        arData[i] = i + 1;
//     }
//
//     for (int i = 0; i < arData.length; i++) {
//        System.out.println(arData[i]);
//     }

//     10 ~ 1까지 중 짝수만 배열에 담고 출력
//     int[] arData = new int[5];
//     
//     for (int i = 0; i < arData.length; i++) {
//        arData[i] = (i + 1) * 2;
//     }
//
//     for (int i = 0; i < arData.length; i++) {
//        System.out.println(arData[i]);
//     }

//     1 ~ 100까지 배열에 담은 후 홀수만 출력
//     int length = 100;
//     int[] arData = new int[length];
//     
//     for (int i = 0; i < arData.length; i++) {
//        arData[i] = i + 1;
//     }
//
//     for (int i = 0; i < 50; i++) {
//        System.out.println(arData[i * 2]);
//     }

//     실버

//     1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//     int[] arData = new int[100];
//     int total = 0;
//
//     for (int i = 0; i < arData.length; i++) {
//        arData[i] = i + 1;
//     }
//
//     for (int i = 0; i < 50; i++) {
//        total += arData[i * 2 + 1];
//     }
//
//     System.out.println(total);

//     A ~ F까지 배열에 담고 출력
//     char[] arData = new char[6];
//     
//     for (int i = 0; i < arData.length; i++) {
//        arData[i] = (char)(65 + i);
//     }
//     
//     for (int i = 0; i < arData.length; i++) {
//        System.out.println(arData[i]);
//     }

//     A ~ F까지 중 D 제외하고 배열에 담은 후 출력
//     char[] arData = new char[5];
//     
//     for(int i=0; i<arData.length; i++) {
//        arData[i] = (char)(i > 2 ? i + 66 : i + 65);
//     }
//     
//     for(int i=0; i<arData.length; i++) {
//        System.out.println(arData[i]);
//     }

//     골드

//     5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//     int[] arData = new int[5];
//     int max = 0, min = 0;
//     Scanner sc = new Scanner(System.in);
//
//     for (int i = 0; i < arData.length; i++) {
//        System.out.print(i + 1 + "번 정수: ");
//        arData[i] = sc.nextInt();
//     }
//
//     max = arData[0];
//     min = arData[0];
//
//     for (int i = 0; i < arData.length; i++) {
//        if (max < arData[i]) {
//           max = arData[i];
//        }
//        if (min > arData[i]) {
//           min = arData[i];
//        }
//     }
//     
//     System.out.println("최대값: " + max);
//     System.out.println("최소값: " + min);

//     다이아
//     사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 입력받는다.
//     입력한 정수들의 평균값을 구한다(소수점 2째자리).
//     int[] arData = null;
//     int length = 0;
//     Scanner sc = new Scanner(System.in);
//     String message = "정수 개수: ";
//     
//     System.out.println(message);
//     length = sc.nextInt();
//     
//     arData = new int[length];
//     
//     int sum = 0;
//     int average = 0; 
//     
//     for (int i = 0; i < arData.length; i++) {
//        System.out.print(i + 1 + "번째 정수: ");
//        arData[i] = sc.nextInt();
//
//     }
//     
//     for (int i = 0; i < arData.length; i++) {
//        System.out.println(arData[i]);
//     }
     
//	   다이아
//	   사용자가 칸 수를 입력하고, 그 칸수만큼 정수를 다시 입력받는다.
//	   입력한 정수들의 평균값을 구한다(소수점 2째자리)
	   Scanner sc = new Scanner(System.in); // 스캐너 sc로 불러옴
	   System.out.print("칸 수를 입력하세요 : "); // 칸수 입력 요청 출력
	   int[] arUserNumber = new int[sc.nextInt()]; // 배열안에 user에게 칸수 요청받음
//	   System.out.println(arUserNumber.length);
   
	   for (int i = 0; i < arUserNumber.length; i++) { // user에게 받은 칸수 만큼 반복
		   System.out.print(i + 1 + "번 째 정수를 입력하세요 : "); // n번째 정수 입력 출력
		   arUserNumber[i] = sc.nextInt();	// i에 입력을 받음
	   }
   
	   double total = 0; // n번째 정수까지의 합을 total에 넣고 0으로 초기화
	   for (int i = 0 ; i < arUserNumber.length; i++) { // user가 넣은 n번째 까지 반복
		   total += arUserNumber[i];  // +=사용으로 n번째까지의 정수를 더해주고 total에 담음 
	   }
   
	   double average = total/arUserNumber.length; // 평균을 구하기위해 average에 total/n을 해줌
//	   System.out.println(total/arUserNumber.length); 
   
   
   System.out.printf("평균 점수는 : "+ "%.2f" +"점 입니다.", average); // 최종 출력

	   sc.close();
   }
}






