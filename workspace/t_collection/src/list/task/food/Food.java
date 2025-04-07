package list.task.food;

import java.util.Objects;

public class Food {
//	Food 클래스 선언, 필요로하는 name, price, type을 필드 정의
//		기본 생성자와 getter, setter를 불러오고,
//			초기화 생성자(매개변수 생성자)를 부름, 사용에 필요한 toString와 equals를 재정의해줌
	private String name; 
	private int price;
	private String type;

	public Food() {;}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Food(String name, int price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Food [name:" + name + ", price:" + price + "원, type:" + type;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(name, other.name);
	}

}
