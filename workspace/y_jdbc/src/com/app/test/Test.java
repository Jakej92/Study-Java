package com.app.test;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

import com.app.domain.dao.AdminDAO;
import com.app.domain.dao.FeedDAO;
import com.app.domain.dao.MemberDAO;
import com.app.domain.dao.PostDAO;
import com.app.domain.dao.ReplyDAO;
import com.app.domain.dto.PostDTO;
import com.app.domain.dto.ReplyDTO;
import com.app.domain.vo.AdminVO;
import com.app.domain.vo.FeedVO;
import com.app.domain.vo.MemberVO;
import com.app.domain.vo.PostVO;
import com.app.domain.vo.ReplyVO;
import com.app.exception.post.PostNotFoundException;
import com.app.exception.member.LoginException;

public class Test {
   public static void main(String[] args) {
//	  DAO (Data Access Object) 객체 생성
//	 DAO는 데이터베이스와 상호작용하는 역할을 하는 클래스
//	 memberDAO는 회원 정보를 관리하는 DAO
//	 postDAO는 게시글을 관리하는 DAO
//	 feedDAO는 피드를 관리하는 DAO
//	 replyDAO는 댓글을 관리하는 DAO
	MemberDAO memberDAO = new MemberDAO();
	PostDAO postDAO = new PostDAO();
	FeedDAO feedDAO = new FeedDAO();
	ReplyDAO replyDAO = new ReplyDAO();

//	//  회원가입 (새로운 회원 정보 입력)
//
//	// String: 문자열 데이터를 저장하는 데이터 타입
//	// 사용자가 입력한 회원 정보를 저장하기 위해 각각의 변수를 선언함
//	String memberEmail = "hgd5555@naver.com";  // 회원 이메일 (로그인에 사용됨)
//	String memberPassword = "5555";            // 회원 비밀번호 (로그인 인증용)
//	String memberName = "홍길동";               // 회원 이름
//	int memberAge = 20;                         // 회원 나이 (정수 값)
//	String memberGender = "여자";               // 회원 성별
//
//	//  MemberVO (Value Object) 객체 생성
//	// MemberVO는 회원 정보를 저장하고 전달하는 객체
//	// 여기서는 회원가입 시 입력한 데이터를 저장할 객체를 생성함
//	MemberVO memberVO = new MemberVO();
//
//	//  Setter 메서드 사용 (입력한 회원 정보를 memberVO에 저장)
//	// `setMemberEmail()` : memberVO 객체에 이메일 값을 저장하는 메서드
//	memberVO.setMemberEmail(memberEmail);
//
//	// `setMemberPassword()` : memberVO 객체에 비밀번호 값을 저장하는 메서드
//	memberVO.setMemberPassword(memberPassword);
//
//	// `setMemberName()` : memberVO 객체에 이름 값을 저장하는 메서드
//	memberVO.setMemberName(memberName);
//
//	// `setMemberAge()` : memberVO 객체에 나이 값을 저장하는 메서드
//	memberVO.setMemberAge(memberAge);
//
//	// `setMemberGender()` : memberVO 객체에 성별 값을 저장하는 메서드
//	memberVO.setMemberGender(memberGender);
//
//	//  데이터베이스에 회원 정보를 추가 (회원 가입 실행)
//	// `memberDAO.insert(memberVO)` → memberVO에 저장된 데이터를 DB에 삽입하는 메서드
//	memberDAO.insert(memberVO);
//
//	//  로그인 (이메일과 비밀번호로 회원 조회)
//	// 사용자가 로그인할 때 입력하는 정보
//	String loginEmail = "hds1234@gmail.com";  // 로그인 시 입력한 이메일
//	String loginPassword = "fdsfdsf";         // 로그인 시 입력한 비밀번호
//
//	//  로그인 요청을 위한 MemberVO 객체 생성
//	// 로그인 검증을 위해 사용자가 입력한 이메일과 비밀번호를 MemberVO 객체에 저장함
//	MemberVO member = new MemberVO();
//	member.setMemberEmail(loginEmail);
//	member.setMemberPassword(loginPassword);
//
//	//  로그인 검증 (데이터베이스에서 회원 조회)
//	// `selectByMemberEmailAndMemberPassword()` : 이메일과 비밀번호로 회원을 찾는 DAO 메서드
//	// Optional<MemberVO> : 조회 결과가 없을 수도 있기 때문에 Optional을 사용하여 null을 방지함
//	member = memberDAO.selectByMemberEmailAndMemberPassword(member)
//	        .orElseThrow(() -> new LoginException("로그인 실패")); // 조회된 회원이 없으면 예외 발생
//
//	//  로그인 성공 후 회원 정보 출력
//	System.out.println(member); // 로그인한 회원 정보 출력
//
//	//  회원 조회 (ID로 특정 회원 검색)
//
//	// Long: 정수형 데이터 타입 (int보다 더 큰 값을 저장할 수 있음)
//	// ID는 회원을 고유하게 구분하는 값이므로 Long 타입을 사용함
//	Long id = 1L;  // 회원 ID 값 (L을 붙여 Long 타입으로 선언)
//
//	//  memberDAO.selectById(id) → 데이터베이스에서 ID로 회원 정보를 조회하는 메서드
//	// memberDAO: 데이터베이스에서 회원 정보를 관리하는 DAO 객체
//	// selectById(id): 특정 회원 ID를 기준으로 해당 회원 정보를 검색하는 메서드
//	// memberToUpdate: 조회된 회원 정보를 저장하는 변수
//	MemberVO memberToUpdate = memberDAO.selectById(id);
//
//	//  조회된 회원 정보를 확인 (null 체크 필요할 수도 있음)
//	System.out.println(memberToUpdate);  // 회원 정보 출력
//
//	//  회원 정보 수정 (특정 회원 정보 변경)
//
//	// setMemberName() : memberToUpdate 객체의 이름을 "홍길동"으로 변경
//	memberToUpdate.setMemberName("홍길동");
//
//	// update() : 변경된 정보를 데이터베이스에 반영하는 메서드
//	memberDAO.update(memberToUpdate);
//
//	//  회원 삭제 (특정 회원 정보 제거)
//
//	// Long 타입의 ID 변수 선언 (삭제할 회원 ID)
//	id = 1L;
//
//	// selectById(id) : 삭제할 회원 정보를 데이터베이스에서 조회
//	MemberVO memberToDelete = memberDAO.selectById(id);
//
//	// delete() : 조회된 회원 정보를 삭제하는 메서드
//	// `getId()` : memberToDelete 객체에서 회원의 ID 값을 가져오는 메서드
//	memberDAO.delete(memberToDelete.getId());
//
//	//  전체 회원 조회 (데이터베이스에 있는 모든 회원 목록 가져오기)
//
//	// selectAll() : 데이터베이스에서 모든 회원 정보를 가져오는 메서드
//	// forEach() : 리스트의 모든 요소를 하나씩 가져와서 처리하는 메서드
//	memberDAO.selectAll().forEach(memberItem -> {
//	    // System.out.println()을 이용하여 회원 정보 출력
//	    System.out.println(memberItem);
//	});


	
//	 	피드 등록
//		FeedDAO feedDAO = new FeedDAO(); 
	
//		String feedContent = "이게 피드냐?";
		
//		FeedVO feedVO = new FeedVO();
		
//		feedVO.setFeedContent(feedContent);
//		
//		feedDAO.insertFeed(feedVO);
		
//		피드 조회
//		Long id = 5L;
//		System.out.println(feedDAO.lookUpById(id));
      
//      피드 수정
//      Long id = 7L;
//      FeedVO feed = feedDAO.selectById(id);
//      	
//      feed.setFeedContent("작동이 잘 되는지 확인용");
//      feedDAO.update(feed);
      	
      	
	
//		피드 삭제
//		Long id = 3L;
//		FeedVO feed = feedDAO.selectById(id);
//		feedDAO.delete(feed.getId());
		
//		피드 전체 조회
		
//		feedDAO.lookUpAllFeed().forEach(System.out::println);	
//      	feedDAO.selectAll().forEach((post) -> {
//      			System.out.println(post);
//      	});
		
	
//	///////////////////////////////////////////////////////////////////////
////		이메일 중복 검사
//		String memberEmail = "hgd5555@naver.com1";
//// 	 memberEmail값을 입력하고 MemberVO객체의 새로운 생성자인 foundMember에 담아준다.
//		Optional<MemberVO> foundMember = memberDAO.selectByMemberEmail(memberEmail);
////  	System.out.println(foundMember.isPresent());
//  
//		if(foundMember.isPresent()) {//조건식이 true일때는 foundMember객체를 출력해주고
//			System.out.println(foundMember);
//		}else{// false일떄는 Exception 메세지를 출력한다.
//			foundMember.orElseThrow(() -> {throw new DuplicateException("중복된 아이디 입니다.");});
//		};
//	
	
//		String memberEmail = "hds1234@gmail.com";
//		System.out.println(memberDAO.checkId(memberEmail));
		
		
//      이메일 중복검사
//      String memberEmail = "hds@gmail.com";
//      Optional<MemberVO> foundMember = memberDAO.selectByMemberEmail(memberEmail);
//      System.out.println(foundMember.isPresent());
      
//      게시글 추가
//      Long memberId = 25L;
//      MemberVO member = memberDAO.selectById(memberId);
//      PostVO post = new PostVO();
//      
//      post.setPostTitle("테스트 제목1");
//      post.setPostContent("테스트 내용1");
//      post.setMemberId(member.getId());
//      
//      postDAO.insert(post);
      
//      memberId = 22L;
//      member = memberDAO.selectById(memberId);
//      post = new PostVO();
//      
//      post.setPostTitle("테스트 제목3");
//      post.setPostContent("테스트 내용3");
//      post.setMemberId(member.getId());
      
//      postDAO.insert(post);
      
//      Optional<PostDTO> foundPost = postDAO.selectById(32321L);
//      foundPost.ifPresent((post) -> {
//         System.out.println(post);
//      });
//      PostDTO post = foundPost.orElse(new PostDTO());
//      System.out.println(post);
      
//      PostDTO post = foundPost.orElseThrow(() -> {throw new PostNotFoundException("게시글 조회 실패");});
//      System.out.println(post);

//		게시글 수정
//		Optional<PostDTO> foundPost = postDAO.selectById(1L);
//		PostDTO post = foundPost.orElseThrow(() -> {throw new PostNotFoundException();});
//		PostVO postVO = new PostVO();
//		
//		post.setPostTitle("수정된 제목");
//		
//		postVO.setId(post.getId());
//		postVO.setPostTitle(post.getPostTitle());
//		postVO.setPostContent(post.getPostContent());
//		
//		postDAO.update(postVO);
		

//    게시글 삭제(작성한 게시글인지 검사)
//    Long memberId = 21L;
//    Long postId = 2L;
//    MemberVO member = memberDAO.selectById(memberId);
//    Optional<PostDTO> foundPost = postDAO.selectById(postId);
//    PostDTO post = foundPost.orElseThrow(() -> {throw new PostNotFoundException();});
//    if(member.getId() == post.getMemberId()) {
//       postDAO.delete(post.getId());
//    }
    
    
//    전체 조회하기
      
//      postDAO.selectAll().forEach(System.out::println);
//
//      postDAO.selectAllDto().forEach((post) -> {
//			System.out.println(post);
//		});
      
//      추가
      
//      ReplyVO replyVO = new ReplyVO();
      
//      replyVO.setReplyContent("이게 무슨 말이죠?");
//      replyVO.setPostId(22L);
//      replyVO.setMemberId(23L);
//      
//      replyDAO.insert(replyVO);
      
//		수정
//      replyVO.setReplyContent("수정 완료");
//      replyVO.setId(2L);
//      
//      replyDAO.update(replyVO);
      
//		삭제
//      replyDAO.delete(4L);
      
////    전체 목록(전체 목록 중, 내가 작성한 댓글인지 검사, 이후 수정 및 삭제 테스트)
//    ReplyVO reply = new ReplyVO(); // ReplyVO 객체를 reply로 
//    MemberVO member = memberDAO.selectById(21L);
//    Optional<PostDTO> foundPost = postDAO.selectById(1L);
//    PostDTO post = foundPost.orElseThrow(() -> {throw new PostNotFoundException();});
//    
//    ArrayList<ReplyDTO> replies = 
//          (ArrayList<ReplyDTO>) replyDAO.selectAll(post.getId()).stream()
//             .filter((replyDTO) -> replyDTO.getMemberId() == member.getId())
//                .collect(Collectors.toList());
//    
////    System.out.println(replies);
//    replies.get(0).setReplyContent("수정된 댓글");
//    
//    reply.setId(replies.get(0).getId());
//    reply.setReplyContent(replies.get(0).getReplyContent());
//    
////    수정
////    replyDAO.update(reply);
//    
////    삭제
//    replyDAO.delete(replies.get(0).getId());
	
//	Admin Account 중복 검사 후 가입
	
	AdminDAO adminDAO = new AdminDAO();
	AdminVO adminVO = new AdminVO();
	
	String adminAccount = "hsw1234";
	String adminName = "허세웅";
	String adminPhone = "010-0000-1234";
	String adminEmail = "hsw1234@pickers.hsw";
	
//	adminVO.setAdminAccount(adminAccount);
//	adminVO.setAdminName(adminName);
//	adminVO.setAdminPhone(adminPhone);
//	adminVO.setAdminEmail(adminEmail);

//	Optional<AdminVO> foundAdmin = adminDAO.checkId(adminAccount);
////	System.out.println(foundAdmin.isPresent());
//	if(foundAdmin.isPresent()) {
//		throw new LoginException("중복된 아이디 입니다.");
//	} else {
//		adminDAO.insert(adminVO);
//		System.out.println("관리자 등록 완료!");
//	}
	
//	전체 조회
//	adminDAO.selectAll().forEach(System.out::println);

//	String memberEmail = "hgd5555@naver.com1";
//// memberEmail값을 입력하고 MemberVO객체의 새로운 생성자인 foundMember에 담아준다.
//	Optional<MemberVO> foundMember = memberDAO.selectByMemberEmail(memberEmail);
////	System.out.println(foundMember.isPresent());
//
//	if(foundMember.isPresent()) {//조건식이 true일때는 foundMember객체를 출력해주고
//		System.out.println(foundMember);
//	}else{// false일떄는 Exception 메세지를 출력한다.
//		foundMember.orElseThrow(() -> {throw new DuplicateException("중복된 아이디 입니다.");});
//	};
		
	
	AdminVO admin = new AdminVO();
	
	String adminPassword = "5555";
	Long id = 21L;
	
	admin.setAdminAccount(adminAccount);
	admin.setAdminEmail(adminEmail);
	admin.setAdminName(adminName);
	admin.setAdminPhone(adminPhone);
	admin.setAdminPassword(adminPassword);
	admin.setId(id);
      
//    adminDAO.update(admin);  
      
    
//    adminDAO.delete(id);
    adminDAO.selectAll().forEach(System.out::println);
	} // main
	
} // class















