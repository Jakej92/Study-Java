package classTest.ClassTask02;

//   화면
//   학생의 점수를 입력받은 뒤 총점과 평균을 출력한다.
//   학생의 점수는 생성자로 초기화한다.
//   모든 학생은 공통적으로 총점과 평균을 가지고 있다.
public class ClassTask02 {
   public static void main(String[] args) { // 실행을 위해 메인 메소드 선언.
      Subject[] arSubject = { // Subject클래스를 배열로 불러와 선언.
            new Subject("국어", 30), // 각 배열에 요소를 채워줌.
            new Subject("영어", 100),
            new Subject("수학", 70)
      };
      
//      Student 클래스를 ted로 선언하고 Student클래스 필드에 맞춰 초기화함.
      Student ted = new Student(1, arSubject); 
      
//      원하는걸 출력하기위해 클래스 뒤에 필드명을 붙혀줌
      System.out.println(ted.total);
      System.out.println(ted.average);
   }
}