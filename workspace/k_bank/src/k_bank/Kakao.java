package k_bank;

//출금 시 수수료 30%
public class Kakao extends Bank{ // Bank를 상속받는 kakao 클래스
	@Override
	public void withdraw(int money) { // Bank에 withdraw 메소드를 overriding 해줌
		money *= 1.3; // 1.3을 곱해주면 찾고자하는 돈에 수수료 30%가 붙은것과 같음
		super.withdraw(money); // 부모클래스에있는 withdraw 메소드를 불러서 마무리.
	}
}
