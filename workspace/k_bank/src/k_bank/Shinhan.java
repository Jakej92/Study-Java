package k_bank;

//잔액검사 시, 재산 반토막
public class Shinhan extends Bank{ // Bank를 상속받는 Shinhan
	@Override 
	public int showBalance() { // 부모클래스의 showBalance를 overriding 해줌
		setMoney(getMoney() / 2); // getMoney()를 호출해 현재 잔액을 가져오고, 
//		이게바로 getter, setter		 이를 절반으로 나눈 값을 setMoney()로 잔액을 업데이트.
		return super.showBalance(); // 부모클래스의 showBalance를 반환해줌
	}
}
