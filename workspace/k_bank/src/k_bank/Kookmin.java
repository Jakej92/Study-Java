package k_bank;

// 입금 시 수수료 30%
public class Kookmin extends Bank{ // Bank를 상속받는 Kookmin 클래스
	@Override
	public void deposit(int money) { // Bank의 deposit 메소드를 overriding 
		money *= 0.7; // 입금할시 수수료가 30%이기 때문에 0.7을 곱해서 줄여줌.
		super.deposit(money); // 부모클래스의 메소드를 불러와 마무리
	}
}
