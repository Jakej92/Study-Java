package classTest.ClassTask05;

// 카테고리
// 대카 안에 중카, 중카 안에 소카
// 대카 N개, 중카 N개, 소카 N개

// 광고 회사
// 카테고리 목록(배열), 가격
// 판매하기 메소드
// 광고주가 신천한 광고 카테고리와 광고 회사의 카테고리가 일치하면 판매

// 광고주
// 회사명, 잔고
public class ClassTask05 {
	   public static void main(String[] args) {
	      // 소카테고리 배열 생성
	      // 소카테고리는 하위 카테고리가 없으므로 이름과 가격만 필요
	      CategoryC[] arBC1 = {
	            new CategoryC("패턴", 5000), // 소카테고리 패턴, 가격 5000
	            new CategoryC("무지", 8000), // 소카테고리 무지, 가격 8000
	            new CategoryC("단색", 2000)  // 소카테고리 단색, 가격 2000
	      };
	      
	      // 두 번째 소카테고리 배열 생성
	      CategoryC[] arBC2 = {
	            new CategoryC("7부", 4000), // 소카테고리 7부, 가격 4000
	            new CategoryC("8부", 9000), // 소카테고리 8부, 가격 9000
	            new CategoryC("슬랙스", 10000) // 소카테고리 슬랙스, 가격 10000
	      };
	      
	      // 중카테고리 배열 생성
	      // 중카테고리는 이름과 함께 소카테고리 배열을 포함
	      CategoryB[] arAB = {
	            new CategoryB("셔츠", arBC1), // 중카테고리 셔츠, 소카테고리 arBC1도 포함
	            new CategoryB("바지", arBC2)  // 중카테고리 바지, 소카테고리 arBC2도 포함
	      };
	      
	      // 대카테고리 배열 생성
	      // 대카테고리는 이름과 함께 중카테고리 배열을 포함
	      CategoryA[] arA = {
	            new CategoryA("겨울", arAB), // 대카테고리 겨울, 중카테고리 arAB도 포함
	            new CategoryA("여름", arAB)  // 대카테고리 여름, 중카테고리 arAB도 포함
	      };
	      
	      // 광고회사 생성
	      // 광고회사 무신사는 대카테고리(arA) 배열을 넣어줌
	      AdCompany musinsa = new AdCompany(arA);
	      
	      // 광고주 생성
	      // 광고주 테드의 회사이름과 잔고를 넣어줌
	      Client ted = new Client("코리아IT", 50000); // 광고주 코리아IT, 잔고 50000
	      
	      // 광고 판매 진행
	      // 광고회사의 sell 메소드를 호출하여 광고를 구매함
	      if(musinsa.sell(ted, "겨울", "셔츠", "무지")) {
	         // 광고 구매 성공 시 메시지 출력 및 잔고 표시
	         System.out.println("광고 구매 성공!");
	         System.out.println(ted.money); // 남은 잔고 출력
	      } else {
	         // 광고 구매 실패 시 메시지 출력
	         System.out.println("다른 광고회사를 찾으세요!");
	      }
	   }
	}


















