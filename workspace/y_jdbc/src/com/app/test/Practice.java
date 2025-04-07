package com.app.test;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

import com.app.domain.dao.MemberDAO;
import com.app.domain.dao.PostDAO;
import com.app.domain.dao.ReplyDAO;
import com.app.domain.dto.PostDTO;
import com.app.domain.dto.ReplyDTO;
import com.app.domain.vo.MemberVO;
import com.app.domain.vo.PostVO;
import com.app.domain.vo.ReplyVO;
import com.app.exception.member.DuplicateException;
import com.app.exception.member.LoginException;
import com.app.exception.post.PostNotFoundException;

public class Practice {
	public static void main(String[] args) {
		
	MemberDAO memberDAO = new MemberDAO();
	PostDAO postDAO = new PostDAO();
	ReplyDAO replyDAO = new ReplyDAO();
	
//	회원가입 MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER
	MemberVO member = new MemberVO();
	
	String email = "jake@jake.co.kr";
	String password = "1234";
	String name = "JakeJ";
	int age = 30;
	String gender = "남자";
	
	member.setMemberEmail(email);
	member.setMemberPassword(password);
	member.setMemberName(name);
	member.setMemberAge(age);
	member.setMemberGender(gender);
	
//	memberDAO.insert(member);
//	로그인
//	memberDAO.selectByMemberEmailAndMemberPassword(member);
	
//	member = memberDAO.selectByMemberEmailAndMemberPassword(member)
//			.orElseThrow(()-> new LoginException("로그인 실패"));
//	System.out.println(member);

//	회원조회
	Long id = 23L;
//	memberDAO.selectById(id);
	
//	회원 수정
	String updateName = "박정근";
	int updateAge = 31;
	String updateGender = "male";
	
	member.setMemberName(updateName);
	member.setMemberAge(updateAge);
	member.setMemberGender(updateGender);
	member.setId(id);
	System.out.println(member.getId());
	
//	memberDAO.update(member);
//	System.out.println(member);
	
//	회원 삭제
//	memberDAO.delete(id);
	
//	이메일 중복검사
//	String emaill = "hgd1234@gmail.com";
//	Optional<MemberVO> foundMember = memberDAO.checkId(emaill);
//	MemberVO target = foundMember.orElseThrow(() -> new DuplicateException("중복된이메일"));
//	if(foundMember.isPresent()) {
//		System.out.println("사용 가능한 아이디 입니다.");
//	}else {
//		System.out.println(target);
//	}
	
//	게시글 추가
	
	String title = "게시글 함 써보까";
	String content = "뭐라 써야 할지 모르겠네";
	
	PostVO post = new PostVO();
	
	
//	member = memberDAO.selectByMemberEmailAndMemberPassword(member)
//			.orElseThrow(()->new LoginException("로그인 실패"));
//	System.out.println(member.getId());
	
	post.setPostTitle(title);
	post.setPostContent(content);
	post.setMemberId(member.getId());
	
//	postDAO.insert(post);
//	System.out.println(post);
	
//	조회 수정 삭제
//	Optional<PostDTO> foundPost = postDAO.selectById(42L);
//	foundPost.orElseThrow(()-> new LoginException("ㅂㅇ"));
	
//	수정
	post.setPostTitle(title);
	post.setPostContent(content);
	post.setId(22L);
	
//	postDAO.update(post);
	
//	삭제
//	Long memberId = 42L;
	Long postId = 41L;
//	member = memberDAO.selectByMemberEmailAndMemberPassword(member)
//			.orElseThrow(()->new LoginException("로그인 실패"));
//	System.out.println(memberId);
//	memberDAO.selectById(member.getId());
//	Optional<PostDTO> foundPost = postDAO.selectById(postId);
//	PostDTO deletePost = foundPost.orElseThrow(()-> new PostNotFoundException("실패"));
//	if(member.getId() == deletePost.getMemberId()) {
//		postDAO.delete(deletePost.getId());
//	}
	
//	전체조회
//	postDAO.selectAllDto().forEach(System.out::println);
	
//	댓글 작성
	String contents = "이걸 글이라고 올림?";
	Long replyId = 2L;
	Long memberId = 42L;
	
	ReplyVO reply = new ReplyVO();
	
	reply.setMemberId(memberId);
	reply.setPostId(replyId);
	reply.setReplyContent(contents);

//	replyDAO.insert(reply);
	
	System.out.println(member.getId());
//	댓글 전체목록
	ArrayList<ReplyDTO> replies = 
	          (ArrayList<ReplyDTO>) replyDAO.selectAll(post.getId()).stream()
	             .filter((replyDTO) -> replyDTO.getMemberId() == member.getId())
	                .collect(Collectors.toList());
//	System.out.println(post.getId());
//	System.out.println(replies);

	
	}

}