package classTest.ClassTask04;

public class User {
   int id; // int타입의 id를 넣을 필드
   String name; // 문자열 타입의 이름을 넣을 필드
   String email; // 문자열 타입의 이메일을 넣을 필드
   String password; // 문자열 타입의 비밀번호를 넣을 필드
   
   Profile[] arProfile; // Profile 클래스 타입의 객체를 배열에 저장하는 필드
   
   // 오버 로딩(Overloading)
   public User() {;} // 기본 생성자

//   위의 필드들을 매개변수로 넣은 생성자
   public User(int id, String name, String email, String password, Profile[] arProfile) {
      this.id = id; // id를 필드에 저장
      this.name = name; // name을 필드에 저장
      this.email = email; // email을 필드에 저장
      this.password = password; // password를 필드에 저장
      this.arProfile = arProfile; // arProfile을 필드에 저장
   }
}