package inhTest;

import java.util.Random;

class Job {
	int money;

	public Job() {
		;
	}

	public Job(int money) {
		this.money = money;
	}

	int money() {
		return money;
	}
}

//	도둑놈을 클래스로 만듬
//	10% 확률로 money+ 100000 (bigSteal)
//	20% 확률로 잡힘. (잡혔다)
//	5% 확률로 죽음. (죽었다.)
//	65% 확률로 +500(steal)

class Thief extends Job {
	int steal;
	int bigSteal;
	String beCaught;
	String die;

	public Thief() {
		;
	}

	public Thief(int money, int steal, int bigSteal, String beCaught, String die) {
		super(money);
		this.steal = steal;
		this.bigSteal = bigSteal;
		this.beCaught = beCaught;
		this.die = die;
	}

//	@Override
//	int money() {
//		int money = super.money();
//		
//		if () {
//			money += steal;
//			return money;
//		}
//		return money;
//	}

}

public class InhTest04 {
	public static void main(String[] args) {

		Thief thief = new Thief(1000, 500, 100000, "철컹 철컹", "하늘나라로...");

		Random random = new Random();

		int rating = 100; // 100% 확률
		int[] arData = new int[20]; // 5% 단위로 나눔

		// 5% 확률 (1칸)
		for (int i = 0; i < rating / 20; i++) {
			arData[i] = 1;
		}

		// 10% 확률 (2칸)
		for (int i = rating / 20; i < rating / 10; i++) {
			arData[i] = 2;
		}

		// 20% 확률 (4칸)
		for (int i = rating / 10; i < rating / 5; i++) {
			arData[i] = 3;
		}

		// 65% 확률 (13칸)
		for (int i = rating / 5; i < arData.length; i++) {
			arData[i] = 4;
		}

		int result = arData[random.nextInt(arData.length)];
		switch (result) {
		case 1:
			System.out.println(thief.die);
			break;
		case 2:
			thief.money = thief.money + thief.bigSteal;
			System.out.println("크게 한탕 하셨습니다! \n현재 잔고: " + thief.money);
			break;
		case 3:
			System.out.println(thief.beCaught);
			break;
		case 4:
			thief.money = thief.money + thief.steal;
			System.out.println("한탕 하셨습니다! \n현재 잔고: " + thief.money);
			break;
		}

	}

}
