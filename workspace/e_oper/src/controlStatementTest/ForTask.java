package controlStatementTest;

import java.util.Scanner;

public class ForTask {
   public static void main(String[] args) {
//      브론즈
//      1 ~ 100까지 출력
	   
//	   	for (int i = 0; i<100; i++) {
//	   		System.out.println(i+1);
//	   	}
//	   	
//      100 ~ 1까지 출력
	   	
//	   	for (int i = 0; i < 100; i++) {
//	   		System.out.println(100-i);
//	   	}
	   

      
//      1 ~ 100까지 중 짝수만 출력
      
//	    for (int i =0; i<= 100; i++) {
//	   		if(i%2==0) {
//	   			System.out.println(i);
//	   		}
//	   	}
	    
//	   for (int i = 0; i < 50; i++) {
//	   System.out.println((i+1)*2);
//   }
	   
//      실버
//      1 ~ 10까지 합 출력
	   	
//	   	int sum = 0;
//	   	for (int i = 0; i <= 10; i++) {
//	   		sum += i; 
//	   	}
//	   	System.out.println(sum);
	   
//      1 ~ n까지 합 출력(n은 입력받기)
	   
//	   	Scanner sc = new Scanner(System.in);
//	    System.out.println("1 ~ n까지 합 출력(n 값을 입력해주세요.)");
//	    
//	   	int sum = 0;
//	   	int n = sc.nextInt();
//	   	for (int i = 0; i < n; i++) {
//	   		sum += i+1;
//	   	}
//	   	
//	   	System.out.println("1 ~ n까지 합: " + sum);
      
//      골드
//      A ~ F까지 출력
	   	
//	   	for (int i = 0; i <= 5; i++) {
//	   		int result = i + 65;
//	   		System.out.println((char)result);
//	   	}
//	   	
	   	
//      A ~ F까지 중 C 제외하고 출력(continue 사용하지 않기)
	   	
//	   	for (int i = 0; i <= 5; i++) {
//	   		int result = i + 65;
//	   		if (result!=67) {
//	   			System.out.println((char)result);
//	   		}
//	   	}
//	   for (int i=0; i<5; i++) {
//		   System.out.println((char)(i > 1 ? i+66 : i+65));
//	   }
	   
	   	
//      다이아
      
//      0 1 2 0 1 2 0 1 2 0 1 2 출력
      	
//   	for (int i = 0; i < 10; i++) {
//   		int result = i%3;
//   		System.out.println(result);
//   	}
   		
//      aBcDeF...Z 출력
	   	
//	   	for (int i = 0; i < 26; i++) {
//	   		int result = i + 65; 
//	   		if(result%2!=0) {
//	   			result = i + 97;
//	   		}
//	   		System.out.println((char)result);
//	   	}
	    
//	   	for(int i = 0; i < 26; i++) {
//	   		System.out.print((char)(i%2 == 0 ? i +97 : i+65));
//	   	}
	   
//	   for문 1번만써서 1단 ~ 9단까지
	   
//	   for (int i = 1, j = 1; i<=9 || j<=9; j++) {
//		   if (j>9) {
//			   j = 1;
//			   i++; 
//			   System.out.println();
//			   if (i>9) break;
//		   }
//		   int result = i*j;
//		   System.out.println(i +"*"+ j +"="+result);
//	   }

   
//	   for (int i = 1; i <= 81; i++) { 
//           int row = (i - 1) / 9 + 1; 
//           int col = (i - 1) % 9 + 1; 
//           
//           System.out.println(row + "*" + col + "=" + (row * col));
//           
//           if (col == 9) {
//               System.out.println(); 
//           } 
//       }
	      
//  for (int i = 0; i < 81; i++) {
//	System.out.print((i / 9 + 1) + "*" + (i % 9 + 1) + "= " + ((i / 9 + 1) * (i % 9 + 1)) + (i % 9 == 8 ? "\n" : ", "));
//	}
	   
//for(int i = 0; i < 72; i++) {
//System.out.print((i/9+2) +"*"+ (i%9+1) +"="+ ((i/9+2)*(i%9+1)) + ((i%9 == 8) ? "\n" : ", "));
//}

//	   값을 입력하고 입력한 값 까지의 구구단을 구하라
	   
//	   System.out.println("몇단까지 구구단을 하고싶으신지 숫자를 주세요.");
//	   Scanner sc = new Scanner(System.in);
//	   int num = sc.nextInt();
//	   for(int i=0; i<num; i++) {
//		   	System.out.println((i+1) +"단을 출력합니다.");
//	   
//	   		for(int j=0; j<9; j++) {
//	   			System.out.print((i+1) + "*" + (j+1) +"="+ ((i+1)*(j+1)) + ", ");
//	   		}
//	   		System.out.println();
//	   }
	   
//	   별 찍기 
	   
//	   for (int i = 0; i <5; i++) {
//		   for (int j = 0; j < i+1; j++) {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//	   }
	   
//	   for (int i = 0; i < 5; i++) {
//		   for (int j = 5; j > i; j--) {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//	   }
	   
//	   for (int i = 0; i < 5; i++) {
//		   for (int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for (int j=5; j>i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//	   }
	   
//	   for (int i = 0; i <5; i++) {
//		   for (int j=5; j>i; j--) {
//			   System.out.print("*");
//		   }
//		   for (int j=0; j<i; j++) {
//			   System.out.print(" ");
//		   }
//		   System.out.println();
//	   }
	   
//	   for (int i = 1; i <6; i++) {
//		   for (int j = 1; j < 6-i; j++) {
//			   System.out.print(" ");
//		   }
//		   for (int j = 1; j < i*2; j++) {
//			   System.out.print("*");
//		   }
//		 System.out.println();
//	   }
	   
//	   for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i+1 == j+1 || i+1 == 6-(j+1)) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
	   
   } // main
   
} // class







