package k_bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
//		2차원 배열(3행 100열)
		Bank[][] arrBank = new Bank[3][100]; // bank클래스를 배열로 받아옴
		int[] arCount = new int[3]; // // 정수형 데이터를 저장할 수 있는 크기 3의 1차원 배열 선언
//		메세지를 출력하는 지역 변수
		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
//		메뉴를 출력해주는 지역 변수
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";

//		스캐너 호출
		Scanner sc = new Scanner(System.in);
//		난수 생성을 위한 Random 클래스
		Random r = new Random();
		
//		Bank 클래스 타입의 변수 user와 temp를 선언하고 빈상태로 초기화
		Bank user = null, temp = null;
//		정수 타입의 변수 bankNumber, choice를 선언하고 빈값 0 으로 초기화
		int bankNumber = 0, choice = 0;
		String account = ""; // 문자열 타입 변수 account 를 선언하고 빈값으로 초기화
		String name = null; // 문자열 타입 변수 name을 선언하고 빈값으로 초기화
		String password = null; // 문자열 타입 변수 password를 선언하고 빈값으로 초기화
		String phone = null; // 문자열 타입 phone을 선언하고 빈값으로 초기화
		String[] phoneNumbers = null; // 문자열 배열 타입 phoneNumbers를 선언하고 빈값으로 초기화
		int money = 0; // 정수 타입 money를 0으로 초기화

		String[] arName = { "신한은행", "국민은행", "카카오뱅크" }; // 배열타입 arName을 선언하고 값을 채워줌
		String accountMessage = "계좌번호: "; // 문자열 타입 accountMessage에 계좌번호를 넣어줌
		String nameMessage = "예금주: "; // 문자열 타입 nameMessage에 예금주를 넣어줌
		String passwordMessage = "비밀번호(4자리): "; // 문자열 타입 passwordMessage에 비밀번호를 넣어줌
		String phoneMessage = "핸드폰번호(- 포함): "; // 문자열 타입 phoneMessage에 핸드폰번호를 넣어줌
		String depositMessage = "입금액: "; // 문자열 타입 depositMessage에 입금액을 넣어줌
		String withdrawMessage = "출금액: "; // 문자열 타입 withdrawMessage에 출금액을 넣어줌
		String errorMessage = "다시 시도해주세요."; // 문자열 타입 errorMessage에 다시 시도해주세요를 넣어줌
		String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요."; // 문자열 타입 loginFailMessage를 넣어줌

//		while 반복문 초기 조건은 true로 반복문 시작
		while (true) {
			System.out.println(message); // 위에 설정한 message를 출력해줌
			bankNumber = sc.nextInt(); // bankNumber를 스캐너로 입력받음

			if (bankNumber == 4) { // 만약 사용자가 4를 입력하면
				break; // 바로 while문 탈출로 끝남.
			}

			while (true) { // 만약 첫 조건이 끝나지 않으면 넘어옴
				System.out.println(menu); // menu를 출력해줌
				choice = sc.nextInt(); // 사용자가 choice를 스캐너로 입력함

				if (choice == 6) { // 만약 사용자가 6을 선택하면
					break; // while문을 종료. 더이상 진행을 안함
				}

				switch (choice) { // 사용자가 입력한 값 choice를 기반으로 여러 case를 비교해주는 조건문 시작
				// 계좌 개설
				case 1: // 1번 선택 시 실행
					account = ""; // 위에서 선언한 account를 사용하기 위해 가져옴
//					Bank클래스를 배열로 가져와, 배열에 {신한, 국민, 카카오}를 넣어줌
					Bank[] arBank = { new Shinhan(), new Kookmin(), new Kakao() };
//					유저가 입력한 bankNumber에서 -1을 함으로써 배열의 인덱스를 맞춰줌
					user = arBank[bankNumber - 1]; 

					while (true) { // true면 반복문 시작
						for (int i = 0; i < 6; i++) { // 0~5까지 6번 반복해 6자리 수를 만들어줌
							account += r.nextInt(10); // 0~9까지의 수를 랜덤으로 생성
						}				
						if (Bank.checkAccount(arrBank, arCount, account) == null) {
							break; // 만약 생성된 계좌 번호가 기존에 존재하지 않으면 반복문 탈출
						}
					}

					account = bankNumber + account; // bankNumber를 account에 더해줌으로서 
//													  bankNumber가 제일앞에 추가된 7자리 계좌번호를 완성해줌

					user.setAccount(account); // 랜덤하게 생성된 계좌번호를 user객체에 넣어줌
					user.setBankName(arName[bankNumber - 1]); // bankNumber에 해당하는 은행 이름을 user 객체에 설정

					System.out.println(nameMessage); // "예금주: "를 출력함
					name = sc.next(); // 이름을 스캐너로 입력받음

					while (true) { // 위에 break를 만나지 않아서 잘 넘어왔다면 다음 while문 시작
						System.out.println(phoneMessage); // "핸드폰번호(- 포함): " 출력
						phone = sc.next(); // 고객에게 폰넘버를 입력받음
						phoneNumbers = phone.split("-"); // 입력받은 핸드폰 번호를 "-" 기준으로 분리하여 배열에 저장

						if (phoneNumbers.length == 3) { // 만약 핸드폰 번호 배열이 3칸이고
							if (phoneNumbers[0].length() == 3) { // 0번방이 3칸이고 // 1번방이 3칸 또는 4칸이고
								if (phoneNumbers[1].length() == 3 || phoneNumbers[1].length() == 4) {
									if (phoneNumbers[2].length() == 4) { // 2번방이 4칸이면
										phone = phone.replaceAll("-", ""); //폰넘버에 - 를 빈""걸로 바꿔줌
										temp = Bank.checkPhone(arrBank, arCount, phone); // 중복 검사를 해주고
										if (temp == null) { // 만약 중복되지 않았다면
											break; // 이 반복문 탈출
										}
									}
								}
							}
						}

						System.out.println(errorMessage); // 위의 조건이 맞지 않다면 에러메세지를 출력해줌

					}
					user.setPhone(phone); // 유저가 입력한 폰넘버를 user객체에 넣어줌

					while (true) { // 위에서 잘 입력되면 다시 while문으로 들어옴
						System.out.println(passwordMessage); // 패스워드 메세지를 출력해주고
						password = sc.next(); // 패스워드는 스캐너로 입력을 받음
						if (password.length() == 4) { // 만약 패스워드가 4칸이면 
							break; // 반복문 탈출
						}

						System.out.println(errorMessage); // 위에 조건이 안맞으면 에러메세지 출력
					}
					
					user.setPassword(password); // 패스워드를 유저 객체에 설정해줌

//					선택한 은행의 현재 계좌 개수 위치에 user 객체를 저장
					arrBank[bankNumber - 1][arCount[bankNumber - 1]] = user;
					arCount[bankNumber - 1]++; // 해당 은행의 고객 수를 1 증가

					System.out.println(arName[bankNumber - 1] + " 가입을 진심으로 환영합니다!"); //해당 은행 가입 축하 메세지
					System.out.println(name + "님의 소중한 계좌번호: " + account); // 고객 이름과 소중한 계좌번호를 출력해줌
					break;

//				입금하기
				case 2: // 2번 선택시
					System.out.println(accountMessage); // 어카운트메세지를 출력해줌
					account = sc.next(); // 어카운트는 고객로부터 스캐너로 입력을 받고

					System.out.println(passwordMessage); // 패스워드메세지를 출력해줌
					password = sc.next(); // 패스워드는 고객으로부터 스캐너로 입력을 받음
//					로그인 체크 어카운트와 비밀번호를 확인함
					user = Bank.login(arrBank, arCount, account, password); 

					if (user != null) { // 만약 유저 정보가 null이 아니라면
//						또 입력된 은행 번호가 유저의 계좌번호 첫번째 번호가 다르다면
						if (bankNumber != user.getAccount().charAt(0) - 48) { // 메세지 출력 후
							System.out.println(user.getBankName() + "에서만 입금 서비스를 이용하실 수 있습니다.");
							break; // 탈출
						}

//						아래와 같은 검사는 사실상 불가능하다.
//						if (bankType instanceof Shinhan) {
//							depositCheck = user instanceof Shinhan;
//							
//						} else if (bankType instanceof Kookmin) {
//							depositCheck = user instanceof Kookmin;
//							
//						} else if (bankType instanceof Kakao) {
//							depositCheck = user instanceof Kakao;
//							
//						}
//
//						if(!depositCheck) {
//							if(user instanceof Shinhan) {
//								bankName = "신한은행";
//								
//							}else if(user instanceof Kookmin) {
//								bankName = "국민은행";
//								
//							}else if(user instanceof Kakao) {
//								bankName = "카카오뱅크";
//								
//							}
//							
//							System.out.println(bankName + "에서만 입금 서비스를 이용하실 수 있습니다.");
//							break;
//						}

						System.out.println(depositMessage); // 위의 조건이 아니라면 이 메세지 출력
						money = sc.nextInt(); // 얼마 입금할지 스캐너로 입력을 받고

						user.deposit(money); // 입금을 해준 후
						break; // 탈출
					}
					System.out.println(errorMessage); // 잘 못 입력했다면 에러메세지 출력 후
					
					break; // 탈출

//				출금하기
				case 3: // 3번 선택시
					System.out.println(accountMessage); // 어카운트 메세지 출력
					account = sc.next(); // 어카운트를 스캐너로 받아옴

					System.out.println(passwordMessage); // 패스워드 메세지 출력
					password = sc.next(); // 패스워드를 스캐너로 받아옴

					user = Bank.login(arrBank, arCount, account, password); // 계좌와 패스워드 검사 후

					if (user != null) { // 만약 null이 아니라면
						System.out.println(withdrawMessage); // 출금 메세지 출력
						money = sc.nextInt(); // 얼마 출금 할지 스캐너로 입력 받음
//						만약 유저의 은행이 카카오인지 확인 후 맞다면 1.3을 곱해서 수수료 아니라면 그냥 1을 곱해서 입력받은 값을
						if (money * (user instanceof Kakao ? 1.3 : 1) <= user.getMoney()) {
							user.withdraw(money); // 출금해준 후
							break; // 탈출
						}
					}
					
					System.out.println(errorMessage); // 잘못 입력되었다면 에러메세지 출력 후
					break;  // 탈출!
//				잔액조회
				case 4: // 4번 잔액조회 선택시
					System.out.println(accountMessage); // 계좌번호 입력해달라는 출력
					account = sc.next(); // 입력은 스캐너로 받아옴
 
					System.out.println(passwordMessage); // 패스워드 메세지 출력
					password = sc.next(); // 스캐너로 입력 받음

					user = Bank.login(arrBank, arCount, account, password); // 계좌, 비밀번호 확인 후

					if (user != null) { // 만약 null이 아니라면
						System.out.println(user.showBalance()); // 현재 잔액을 보여주고
						break; // 탈출
					}

					System.out.println(errorMessage); // 잘못 입력됐다면 에러메세지 출력 후
					break; // 탈출 

//				계좌번호 찾기
				case 5: // 5번 선택시
					account = ""; // 계좌 번호 빈 값으로 초기화
					System.out.println(phoneMessage); // 폰메세지 출력 후
					phone = sc.next(); // 폰넘버 입력 받고
					phone = phone.replaceAll("-", ""); // 폰넘버에 "-" 를 지워줌
					
					System.out.println(passwordMessage); // 패스워드메세지 출력 후
					password = sc.next(); // 패스워드를 입력 받음
					
					user = Bank.checkPhone(arrBank, arCount, phone); // 폰 넘버가 맞는지 확인 후
					if(user != null) { // 만약 맞고
						if(user.getPassword().equals(password)) { // 패스워드도 맞는데
							if (bankNumber != user.getAccount().charAt(0) - 48) { // 은행이 다르다면
//								어느 은행에서 찾아야할지 알려주는 메세지 출력 후
								System.out.println(user.getBankName() + "에서 계좌를 찾으실 수 있습니다.");
								break; // 탈출
							}
							
							while (true) { // 위의 조건이 아니라면 while 반복문 실행
								for (int i = 0; i < 6; i++) { // for문을 이용해서 6자리인
									account += r.nextInt(10); // 계좌번호를 0~9까지 랜덤하게 생성
								}
								if (Bank.checkAccount(arrBank, arCount, account) == null) {
									break; // 만약 생성된 계좌 번호가 기존에 존재하지 않으면 반복문 탈출 후
								}
							}

							account = bankNumber + account; // 은행넘버가 들어간 계좌번호 생성 해주고

							user.setAccount(account); // user객체에 설정해줌
							System.out.println(name + "님의 소중한 계좌번호: " + account); // 계좌번호를 알려준 후
						}
					}
					
					break; // 탈출

				default: // 아무것도 아니라면
					System.out.println(errorMessage); // 에러메세지 송출해줌
				}
			}
		}
	}
}
