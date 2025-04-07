package k_bank;

public class Bank {
//	변수
//	예금주의 이름을 저장하는 필드
	private String name; // private 사용으로 접근을 제한함

//	계좌번호를 저장하는 필드
	private String account; // private 사용으로 접근을 제한함

//	핸드폰번호를 저장하는 필드
	private String phone; // private 사용으로 접근을 제한함

//	비밀번호를 저장하는 필드
	private String password; // private 사용으로 접근을 제한함

//	잔액(통장)을 저장하는 필드
	private int money; // private 사용으로 접근을 제한함

//	은행명을 저장하는 필드
	private String bankName; // private 사용으로 접근을 제한함

	public Bank() { // 기본 생성자 호출
		;
	}

//	각 필드들을 사용해주기위해 매개변수가 있는 생성자 호출
	public Bank(String name, String account, String phone, String password, int money, String bankName) {
		super();
		this.name = name;
		this.account = account;
		this.phone = phone;
		this.password = password;
		this.money = money;
		this.bankName = bankName;
	}

	public String getName() { // name 필드의 값을 반환 해주는 메소드
		return name;
	}
//					String name 메소드가 호출 될 때 String타입의 name을 받아서 사용
	public void setName(String name) { // (setter) 값을 설정해줌
		this.name = name; 
	}

	public String getAccount() { // (getter) 값을 사용해줌
		return account;
	}
//		getter , setter
	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	// 계좌번호 중복검사
//	public 공개매소드 / final은 overriding 불가 / static은 객체생성없이 class명으로 호출가능 
//		Bank class 객체 / checkAccount는 메소드 이름 / 매개변수는 이 메소드가 원하는 값을 찾기위해 필요한 데이터
	public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
//		for문 이용, i=0; i는 i++ 1씩 계속 반복 증가하여 arrBank의 length만큼 반복 
		for (int i = 0; i < arrBank.length; i++) {
			for (int j = 0; j < arCount[i]; j++) { // for문 안에 for문 j=0; j는 arCount배열에 찾은 i만큼 반복해줌
				if (arrBank[i][j].account.equals(account)) { // 만약 배열에 은행과 어카운트가 account와 같다면
					return arrBank[i][j]; // 2차원 배열인 arrBank [은행][계좌번호]를 리턴해줌
				}
			}
		}

		return null; // 만약 위의 조건을 충족시키지못한다면 null을 리턴
	}

//	핸드폰번호 중복검사
//	공개지만 overriding이 불가능하고 객체생성없이 class명으로 호출가능한 Bank 클래스 객체로 이름은 checkPhone인 메소드
//		원하는 값을 찾기위해 필요한 데이터를 매개변수로 받아옴
	public final static Bank checkPhone(Bank[][] arrBank, int[] arCount, String phone) {
//		위와 같이 for문, if문을 이용하여 phone number가 같은지 확인해줌
		for (int i = 0; i < arrBank.length; i++) {
			for (int j = 0; j < arCount[i]; j++) {
				if (arrBank[i][j].phone.equals(phone)) {
					return arrBank[i][j];
				}
			}
		}

		return null; // 조건을 만족하지 못한다면, null 을 반환
	}

//	로그인
//	공개고 객체생성없이 class명으로 바로 호출해서 쓸수있지만, overriding은 불가능한 Bank클래스 객체로 이름은 login인 메소드
	public static final Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
//		Bank 클래스에 타입 변수 user를 선언과 동시에 checkAccount 로 사용
		Bank user = checkAccount(arrBank, arCount, account);
		if (user != null) {  // 만약 user가 null이 아니면서
			if (user.password.equals(password)) { // 만약 유저의 패스워드가 뱅크의 패스워드와 같다면
				return user; // 유저를 리턴해줌
			}
		}
		return null; // 조건에 맞지 않다면 null을 반환
	}

//	입금
//	공개고 리턴이 없는 deposit 메소드 매개변수로 int타입의 money데이터를 사용함
	public void deposit(int money) { 
		this.money += money; // 현재 money에 money를 더해줌
	}

//	출금
//	공개고 리턴이 없는 withdraw 메소드 money데이터를 사용
	public void withdraw(int money) {
		this.money -= money; // 현재 잔액에서 money를 빼줌
	}

//	잔액 조회
//	공개고 정수 타입의 showBalance 메소드 
	public int showBalance() { 
		return this.money; // void가 아니라서 return은 필수. 현재 잔액을 리턴해줌
	}
}
