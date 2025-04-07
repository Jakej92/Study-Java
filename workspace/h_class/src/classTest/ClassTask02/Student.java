package classTest.ClassTask02;

// 학생 클래스 선언
// 학생 번호, 과목 정보, 총점 및 평균을 관리하는 클래스
public class Student {
//    필드 선언
//    학생 번호를 저장하는 변수
   int id;


//    각 과목은 Subject 클래스의 객체로 관리
   Subject[] arSubject;

//    학생의 총점
   int total;

//    학생의 평균 점수
   double average;

//    기본 생성자
//    객체 생성 시 초기화를 하지 않는 경우를 위한 생성자
   public Student() {;}

//    매개변수 있는 생성자
//    원하는 값을 초기화할 수 있도록 매개변수로 필요한 데이터를 받음
   public Student(int id, Subject[] arSubject) {
//       전달받은 학생 번호를 필드에 저장
      this.id = id;
//       전달받은 과목 배열을 필드에 저장
      this.arSubject = arSubject; //this는 현재 클래스의 인스턴스를 참조(접근)


      if (arSubject != null) { // 과목 배열이 null이 아닌 경우
//          배열에 저장된 각 과목의 점수를 반복문을 통해 더하여 총점을 계산
         for (int i = 0; i < arSubject.length; i++) {
            this.total += arSubject[i].score; // 과목 점수를 총점에 더해줌
         }

//          평균 점수를 계산 (총점 / 과목 개수)
         this.average = (double) this.total / arSubject.length;

//          평균 점수를 소수점 둘째 자리까지 반올림
//          String.format을 사용하여 "%.2f" 형식으로 변환 후 다시 double로 변환
         this.average = Double.parseDouble(String.format("%.2f", this.average));
      }
   }
}
