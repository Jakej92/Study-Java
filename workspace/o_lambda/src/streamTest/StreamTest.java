package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
   public int plus1(int data) {
      return data + 1;
   }

   public int getDoubleTime(int data) {
      return data * 2;
   }

   public boolean checkEven(int data) {
      return data % 2 == 0;
   }

   public static void main(String[] args) {

//      배열을 ArrayList로 변경하는 방법
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//      Integer[] arData = {10, 20, 30, 40, 50};
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//      Integer[] arData = new Integer[5];
//      ArrayList<Integer> datas = null;
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (i + 1) * 10;
//      }
//      
//      datas = new ArrayList<Integer>(Arrays.asList(arData));
//      
//      System.out.println(datas);

//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      Object[] arNumber = null;
//      
//      for (int i = 0; i < 5; i++) {
//         datas.add((i + 1) * 10);
//      }
//      
//      arNumber = datas.toArray();
//      
//      for (int i = 0; i < arNumber.length; i++) {
//         System.out.println(arNumber[i]);
//      }
      
//      IntStream: 정수를 다루는 Stream API
//      IntStream.range(1, 11).forEach((data) -> {System.out.println(data);});
//      IntStream.rangeClosed(1, 10).forEach((data) -> {System.out.println(data);});
      
//      forEach(): 반복
//      여러 값을 가지고 있는 컬렉션 객체 또는 Stream API에서 forEach 메소드를 사용할 수 있다.
//      forEach() 메소드에는 Consumer 인터페이스 타입의 값(구현체)을 전달해야 한다.
//      Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
//      매개변수에는 컬렉션 객체 또는 Stream 객체 안에 있는 값들이 순서대로 담기고,
//      화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
//      ArrayList<String> colors = new ArrayList<String>(Arrays.asList("검은색", "빨간색", "녹색"));
//      colors.forEach((color) -> {System.out.println(color);});
//      colors.forEach(System.out::println);
      
//      map(): 기존 값 변경
//      StreamTest streamTest = new StreamTest();
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
      
//      datas.stream().map((data) -> data * 2).forEach(System.out::println);
//      datas.stream().map(streamTest::getDoubleTime).forEach(System.out::println);
      
//      User[] arUser = {
//         new User(1, "한동석", 20),
//         new User(2, "허세웅", 15)
//      };
//      ArrayList<User> users = new ArrayList<User>(Arrays.asList(arUser));
//      
//      users.stream().map((user) -> user.getAge() / 2).forEach(System.out::println);
//      users.stream().map((user) -> user.getAge()).map((age) -> age / 2).forEach(System.out::println);
//      System.out.println(users);
   
//      filter(): 리턴값이 true일 경우만 추출
//      StreamTest streamTest = new StreamTest();
      
//      IntStream.range(1, 11).filter((data) -> data % 2 == 0).forEach(System.out::println);
//      IntStream.range(1, 11).filter(streamTest::checkEven).forEach(System.out::println);
      
//      chars(): 문자열을 IntStream으로 변경
//      "ABC".chars().forEach((data) -> System.out.println((char)data));
      
//      sorted(): 정렬
//      StreamTest streamTest = new StreamTest();
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.range(0, 10).map(streamTest::plus1).forEach(datas::add);
//      
//      Collections.shuffle(datas);
//      
//      System.out.println(datas);
//      
//      datas.stream().sorted().forEach(System.out::println);
//      datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
      
//      collect(): 결과를 다양한 타입으로 리턴해준다.
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(30, 20, 90, 40, 80));
//      
//      List<Integer> sortedDatas = datas.stream().sorted().collect(Collectors.toList());
//      System.out.println(sortedDatas);
//      
//      if(sortedDatas.contains(90)) {
//         System.out.println("90은 존재한다.");
//      }
      
   }
}















