package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static int minus10(int data) {
		return 10 - data;
	}

	public static int discount(int price) {
		return (int) (price * 0.7);
	}
	
	public static boolean checkEven(int data) {
		return data % 2 == 0;
	}
	
	public static boolean checkOdd(int data) {
		return data % 2 != 0;
	}

	public static void main(String[] args) {
//		forEach
//		1 ~ 10까지 ArrayList에 담고 출력
//		Integer[] arData = new Integer[10];
//		ArrayList<Integer> datas = null;
//		
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		
//		datas = new ArrayList<Integer>(Arrays.asList(arData));

//		ArrayList<Integer> datas = new ArrayList<Integer>();

//		IntStream.range(1, 11).forEach((data) -> {
//			datas.add(data);
//		});
//		IntStream.range(1, 11).forEach(datas::add);
//		
//		System.out.println(datas);

//		10 ~ 1까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		
//		IntStream.range(0, 10).forEach((data) -> {
//			datas.add(10 - data);
//		});
//		
//		System.out.println(datas);

//		10 ~ 1까지 ArrayList에 담고 짝수만 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		
//		IntStream.range(0, 10).forEach((data) -> {
//			datas.add(10 - data);
//		});
//		
//		datas.forEach((data) -> {
//			if(data % 2 == 0) {
//				System.out.println(data);
//			}
//		});

//		map
//		10 ~ 1까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).map(StreamTask::minus10).forEach(datas::add);
//		
//		System.out.println(datas);

//		10 ~ 1까지 ArrayList에 담고 짝수만 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).map(StreamTask::minus10).forEach(datas::add);
//		datas.stream().forEach((data) -> {
//			if(data % 2 == 0) {
//				System.out.println(data);
//			}
//		});

//		Product 클래스 선언해서 아래의 필드를 구성한다.
//		상품명, 가격, 재고
//		Product[] arProduct = { new Product("지우개", 800, 25), new Product("연필", 500, 11), new Product("칫솔", 1900, 5),
//				new Product("가위", 3000, 235) };
//
//		ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(arProduct));

//		가격을 모두 30% 할인하여 출력한다.
//		products.stream().map((product) -> product.getPrice()).map(StreamTask::discount).forEach(System.out::println);

//		모든 재고를 10으로 변경한다.
//		products.stream().map((product) -> product.getStock()).map((stock) -> 10).forEach(System.out::println);
		
//		filter
//		10 ~ 1까지 ArrayList에 담고 짝수만 출력
//		IntStream.range(0, 10).map(StreamTask::minus10).filter(StreamTask::checkEven).forEach(System.out::println);
		
//		1 ~ 100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		
//		IntStream.range(1, 101).filter(StreamTask::checkOdd).forEach(datas::add);
//		System.out.println(datas.stream().filter(StreamTask::checkEven).collect(Collectors.toList()).size());
		
//		A ~ F까지 중 D제외하고 ArrayList에 담고 출력
//		5번 반복(0 ~ 4)
//		삼항 연산자를 사용해서 D부터 1씩 더 증가
//		forEach에서 (char)로 강제 형변환하여 출력
//		IntStream.range(0, 5)
//			.map((data) -> data > 2 ? data + 66 : data + 65)
//				.forEach((data) -> System.out.println((char)data));
		
//		심화 실습
//		5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk")
//		toLowerCase()를 참조형으로 활용해보자!
		
//		"Apple", "banana", "Melon" 중 첫 번째 문자가 대문자인 문자열 출력
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		datas.stream().filter((data) -> data.charAt(0) >= 'A').filter((data) -> data.charAt(0) <= 'Z').forEach(System.out::println);;
		
//		박정근 작품(Good~!)
//		datas.stream().filter((data) -> data.charAt(0) <= 'Z').forEach(System.out::println);
		
//	   ==============================================================================================
	   
//      1 ~ 100까지 중 홀수만 ArrayList에 담고 출력
      ArrayList<Integer> datas = new ArrayList<Integer>();
      
      IntStream.range(1, 101).filter(StreamTask::checkOdd).forEach(datas::add);
      System.out.println(datas.stream().filter(StreamTask::checkEven).collect(Collectors.toList()).size());
      
//      A ~ F까지 중 D제외하고 ArrayList에 담고 출력
      	IntStream.range(0, 6).map((data) -> data+65).filter((data) -> data != 68).forEach((data) -> {
			System.out.println((char)data);
		});
//      5번 반복(0 ~ 4)
//      삼항 연산자를 사용해서 D부터 1씩 더 증가
//      forEach에서 (char)로 강제 형변환하여 출력

		IntStream.rangeClosed(65, 69).map((data)-> data == 68 ? data +1 : data).forEach((data) -> {
			System.out.println((char)data);
		});
		
//      심화 실습
//      5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk")
//      toLowerCase()를 참조형으로 활용해보자!
		ArrayList<String> words = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
		words.stream().map(String::toLowerCase).forEach(System.out::println);
      
//      "Apple", "banana", "Melon" 중 첫 번째 문자가 대문자인 문자열 출력
		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
		fruits.stream().filter((data)->data.charAt(0) >= 'A').filter((data)->data.charAt(0) <= 'Z').forEach(System.out::println);
		
//      한글을 정수로 변경
//      입력 예) 일공이사
//      출력 예) 1024
		ArrayList<String> numbers = new ArrayList<String>(Arrays.asList("공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"));
			String number = "일공이사";
			int result = 0;
			
			for (int i = 0; i < number.length(); i++) {
				String separate = number.substring(i, i+1);
				int num = numbers.indexOf(separate);
				result = result * 10 + num;
			}
			System.out.println(result);

//	      한글을 정수로 변경
//	      입력 예) 일공이사
//	      출력 예) 1024
//	      String hangul = "공일이삼사오육칠팔구";
//	      String input = "일공이사";
//	      input.chars().map(hangul::indexOf).forEach(System.out::println);
	      
//	      정수를 한글로 변경
//	      입력 예) 1024
//	      출력 예) 일공이사
//	      String hangul = "공일이삼사오육칠팔구";
//	      int input = 1024;
//	      String temp = String.valueOf(input);
//	      
//	      temp.chars().map((c) -> c - 48).forEach((i) -> System.out.println(hangul.charAt(i)));
	      
//	      while(input != 0) {
//	         System.out.println(hangul.charAt(input % 10));
//	         input /= 10;
//	      }

			
	}
}
