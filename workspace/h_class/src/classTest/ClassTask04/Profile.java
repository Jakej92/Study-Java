package classTest.ClassTask04;

// classtask04에서 사용할 profile클래스를 선언
public class Profile {
//	경로를 필드에 넣어줌
   String path;
//   파일네임을 필드에 넣어줌
   String fileName;
//   파일사이즈를 필드에 넣어줌
   int fileSize;
//   true 또는 false값으로 대표이미지를 확인하기위해 boolean타입으로 check필드를 넣어줌
   boolean check;
//   기본 생성자 호출
   public Profile() {;}
//   매개변수를 넣은 생성자 호출
   public Profile(String path, String fileName, int fileSize, boolean check) {
      this.path = path;  // path값을 path필드 초기화
      this.fileName = fileName;  // fileName을 필드에 초기화
      this.fileSize = fileSize;  // fileSize를 필드에 초기화
      this.check = check;  // 체크를 필드에 초기화
   }
}
