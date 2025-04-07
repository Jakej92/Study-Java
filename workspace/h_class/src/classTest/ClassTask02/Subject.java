package classTest.ClassTask02;

public class Subject {
//	필드 선언
//   과목명
   String name;
//   과목 점수
   int score;
//   기본 생성자 
   public Subject() {;}
//	매개변수가 있는 생성자
   public Subject(String name, int score) {
//	 전달받은 매개변수 name과 score로 해당 필드를 초기화
	  this.name = name;   // 전달받은 과목명을 name 필드에 저장
	  this.score = score; // 전달받은 점수를 score 필드에 저장
   }
}