//package list.task.user;
//
//public class UserService1 {
//
//}
//package list.task.user;
//
//import java.util.Base64;
//import java.util.Random;
//
//import list.task.DBConnecter;
//
//public class UserService {
////   이메일 중복검사
//// 이메일을 매개변수로 받아와 이메일을 중복검사 해주는 메소드
////	-1-화면으로부터 ㅎ사용자가 작성한 이메일을 받아온다.
//   public User findByUserEmail(String email){ // -1- 
////	  빠른 for문을 이용해 DBConnecter.users 모든 객체를 확인
////	   -2- 빠른 for문(향상된 for문)
////	   DB에 있는 회원들을 순서대로 하나씩 user객체에 담아준다.
//      for(User user: DBConnecter.users) { // -2-
////    	  -3- DB에 있는 회원들의 이메일을 가져와서 사용자가 작성한 이메일과 같은지 검사
//         if(user.getEmail().equals(email)) { // user의 email이 매개변수 email과 같다면 
//            return user; // user를 리턴
//         }
//      }
//      
//      return null; // 중복되는 email을 찾지못하면 null을 리턴
//   }
//   
////   회원가입
//   public void join(User user) { // User객체의 user를 매개변수로 받아 사용하는 회원가입 메소드
////	  매개변수 user의 password를 encrpyt로 암호화 한 후 객체에 설정 
//      user.setPassword(encrpyt(user.getPassword())); 
////    DBConnecter.users에 add를 이용해 추가해줌
//      DBConnecter.users.add(user); 
//   }
//   
////   로그인
////   문자열 email과 password를 이용한 로그인 메소드
//   public User login(String email, String password) {
////	   이메일로 검색된 User 객체를 user 변수에 저장
//      User user = findByUserEmail(email);
//      if(user != null) { // 만약 유저의 email이 null이 아니고,
////    	  만약 유저의 패스워드가 암호화된 패스워드와 같다면
//         if(user.getPassword().equals(encrpyt(password))) {
//            return user; // 유저를 리턴해주고
//         }
//      }
//      
//      return null; // 아니라면 로그인 실패! null을 리턴
//   }
//   
////   암호화(인코딩)
//   public String encrpyt(String password) { // 비밀번호를 암호화 해주는 메소드
//      return new String(Base64.getEncoder().encode(password.getBytes()));
//   } // 입력받은 password를 base64로 암호화를 해주고 문자열타입으로 리턴해줌
//   
////   개인 정보 수정(마이페이지)
//   public String edit(String email, String phone) {
//	   User user = findByUserEmail(email);
//	   if (user != null) {
//		   user.setPhone(phone);
//		   return "전화번호가 변경되었습니다.";
//	   }
//	   return "사용자를 찾을수 없습니다.";
//   }
////   비밀번호 변경
//   public String change(String email, String password) {
//	   User user = findByUserEmail(email);
//	   if (user != null) {
//		   user.setPassword(password);
//		   return "비밀번호가 변경되었습니다.";
//	   }
//	   return "사용자를 찾을 수 없습니다.";
//   }
//   
//////   비밀번호 찾기
////   public String findPassword(String email, String phone) {
////	   Random r  = new Random();
////	   User user = login(email, phone);
////	   if (user != null) {
////		   User password = new password();
////		   for (int i = 0; i < 5; i++) { 
////				user.setPassword(password) = r.nextInt(10); 
////			}	
////	   }
////   }
////   랜덤한 5자리 임시 비밀번호 생성
////   SMS API를 사용해서 임시 비밀번호 발송
//   
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
