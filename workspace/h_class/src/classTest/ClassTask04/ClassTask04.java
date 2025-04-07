package classTest.ClassTask04;

// 회원
// 아이디, 이름, 이메일, 비밀번호

// 프로필 사진
// 경로, 파일 이름, 파일 크기(KB), 대표 이미지(status)

// 화면
// 회원 1명당 2개의 프로필 사진을 가지고 있다.
// 회원의 정보를 출력할 때, 대표 이미지만 출력한다.
public class ClassTask04 {
	
//	실행을 위한 메인 메소드 호출
   public static void main(String[] args) {
//	   유저클래스의 객체를 테드로 생성, 유저클래스에 있는 필드를 채워줌
      User ted = new User(1, "한동석", "tedhan1204@gmail.com", "1234", null);
//       프로필 클래스의 필드들을 img1, img2에 넣어 초기화해줌
      Profile img1 = new Profile("image/user", "img1", 300, true);
      Profile img2 = new Profile("image/user", "인생샷", 500, false);
      
      ted.arProfile = new Profile[2]; // 2칸짜리 배열을 선언함
      ted.arProfile[0] = img1; // 0번에 img1을 넣어줌
      ted.arProfile[1] = img2; // 1번에 img2를 넣어줌
      
      ted.arProfile[0].check = false; // img1번에 true를 false로 업데이트해줌
      ted.arProfile[1].check = true; // img2번에 false를 true로 업데이트해줌
      
      // 테드의 이메일과 이름을 출력해줌
      System.out.println(ted.email + ", " + ted.name);
      // 반복문인 for문을 사용해 arProfile의 length만큼 반복해서 검사함
      for(int i=0; i<ted.arProfile.length; i++) { 
         if(ted.arProfile[i].check) { // 만약 테드의 프로필 배열에 true가 나오면,
            System.out.println(ted.arProfile[i].fileName); // 여기서 출력해줌
         }
      }
   }
}














