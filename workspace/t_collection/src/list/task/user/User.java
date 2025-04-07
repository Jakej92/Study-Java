package list.task.user;

import java.util.Objects;

public class User {
//   회원번호, 이름, 이메일, 비밀번호, 핸드폰 번호
//	User클래스에 필요한 필드 생성
   private static Long seq; // 모든 객체가 공유함
   private Long id;
   private String email;
   private String password;
   private String phone;
   
   static { // static으로 선언하여 클래스에 하나만 존재, 모든 user객체가 공유
      seq = 0L; // Long타입 0으로 초기화
   }
   
   {
      id = ++seq; // User객체 생성 시 seq 값을 1 증가 후 id로 설정
   }
   
   public User() {;} // 기본 생성자

//   User 객체 생성자 문자열타입 email, password, phone을 받아서 사용함
   public User(String email, String password, String phone) {
      super(); // 부모클래스의 생성자를 호출
      this.email = email; // 전달받은 email 값으로 객체의 email 필드 초기화
      this.password = password; // 전달받은 password를 객체의 password 필드를 초기화
      this.phone = phone; // 전달받은 phone을 객체의 phone 필드를 초기화
   }

   public Long getId() { // getter
      return id; // id 값을 리턴
   }

   public void setId(Long id) { // setter
      this.id = id; // id 값을 설정
   }

   public String getEmail() { // getter
      return email; // email을 리턴
   }

   public void setEmail(String email) { // setter
      this.email = email; // email를 설정
   }

   public String getPassword() { // getter
      return password; // password를 리턴
   }

   public void setPassword(String password) { // setter
      this.password = password; // password를 설정
   }

   public String getPhone() { // getter
      return phone; // phone을 리턴
   }

   public void setPhone(String phone) { // setter
      this.phone = phone; // phone을 설정
   }

   @Override // Object의 toString메소드를 overriding 해줌
   public String toString() { // User 객체의 원하는 필드들을 리턴 
      return "User [id=" + id + ", email=" + email + ", password=" + password + ", phone=" + phone + "]";
   }

   @Override // Object의 equals 메소드를 overriding 해줌
   public boolean equals(Object obj) { // boolean 타입의 equals, Object타입의 객체를 매개변수로 받음
      if (this == obj) // 만약 현재 객체가 obj와 같다면
         return true; // true 리턴
      if (obj == null) // 비교 객체가 null이면 
         return false; // false 리턴
      if (getClass() != obj.getClass()) // getClass가 obj의 getClass 타입이 같지 않다면
         return false; // false 리턴
      User other = (User) obj; // obj를 User타입으로 다운캐스팅 한 후 other로 사용하기위에 담음
      return Objects.equals(id, other.id); // 두 user객체의 id값이 같은지 확인
   }
}














