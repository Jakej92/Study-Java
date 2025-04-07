package inhTest;

class Hero {
	int hp;
	int dmg;

	public Hero() {
		;
	}

	public Hero(int hp, int dmg) {
		this.hp = hp;
		this.dmg = dmg;
	}

	void getDmg(int dmg) {
		this.hp -= dmg;
	}

	int attack() {
		return dmg;
	}
}

class Thor extends Hero {
	int hammerCount;
	int shildCount;

	public Thor() {
		;
	}

	public Thor(int hp, int dmg, int hammerCount, int shildCount) {
		super(hp, dmg);
		this.hammerCount = hammerCount;
		this.shildCount = shildCount;
	}

	@Override
	void getDmg(int dmg) {
		if (shildCount <= 0) {
			super.getDmg(dmg);
			return;
		}
		dmg -= shildCount;
		super.getDmg(dmg);
		shildCount--;
	}

	@Override
	int attack() {
		int dmg = super.attack();

		if (hammerCount > 0) {
			dmg = hammerCount == 1 ? dmg + 1 : (dmg * hammerCount);
			hammerCount--;
			return dmg;
		}

		return dmg;
	}
}

// 원하는 히어로 만들기
// Hero 클래스를 상속 받아서 구현한다.

// 아이언맨 만들기. 
// 1. mp를 추가, 공격은 레이저, 방어는 쉴드.
// 2. 공격을 하고나면 mp가 1깍이는 대신 공격력 5를 추가함
// 3. 방어를 하고나면 mp가 1깍이는 대신 방어력 5를 추가함
class IronMan extends Hero {
	int mp;
	int laser;
	int shield;

	public IronMan() {
		;
	}

	public IronMan(int hp, int dmg, int mp, int laser, int shield) {
		super(hp, dmg);
		this.mp = mp;
		this.laser = laser;
		this.shield = shield;
	}

	@Override
	void getDmg(int dmg) {
		if (shield <= 0) {
			super.getDmg(dmg);
			return;
		}
		dmg -= shield;
		super.getDmg(dmg);
		shield--;
	}

	@Override
	int attack() {
		int dmg = super.attack();

		if (mp > 0) {
			dmg = dmg + laser;
			mp--;
			return dmg;
		}
		return dmg;
	}
}

public class InhTest03 {
	public static void main(String[] args) {
		Thor thor = new Thor(10, 5, 2, 2);
		thor.getDmg(10);

		System.out.println(thor.hp);
		System.out.println(thor.shildCount);
		
		System.out.println("입힌 데미지: " + thor.attack());
		System.out.println(thor.hammerCount);
		System.out.println("입힌 데미지: " + thor.attack());
		System.out.println(thor.hammerCount);
		System.out.println("입힌 데미지: " + thor.attack());
		System.out.println(thor.hammerCount);

		System.out.println("=======================");
		
		IronMan ironMan = new IronMan(10, 5, 5, 5, 5);
		ironMan.getDmg(10);
		System.out.println(ironMan.hp);
		System.out.println(ironMan.mp);
				

		System.out.println("IronMan이 입힌 데미지: " + ironMan.attack());
		System.out.println(ironMan.mp);
		System.out.println("IronMan이 입힌 데미지: " + ironMan.attack());
		System.out.println(ironMan.mp);
		System.out.println("IronMan이 입힌 데미지: " + ironMan.attack());
		System.out.println(ironMan.mp);
		System.out.println("IronMan이 입힌 데미지: " + ironMan.attack());
		System.out.println(ironMan.mp);
		System.out.println("IronMan이 입힌 데미지: " + ironMan.attack());
		System.out.println(ironMan.mp);
		System.out.println("IronMan이 입힌 데미지: " + ironMan.attack());
		System.out.println(ironMan.mp);

	}
}
