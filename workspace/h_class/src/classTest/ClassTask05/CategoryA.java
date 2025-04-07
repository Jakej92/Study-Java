package classTest.ClassTask05;

public class CategoryA {
//	name 필드
	String name;
//	중카테고리 클래스를 배열로 받아옴
	CategoryB[] arCategoryB;

//	기본 생성자
	public CategoryA() {
		;
	}

//	매개변수를 넣은 생성자,  이름과 중카테고리 배열로 필드를 초기화
	public CategoryA(String name, CategoryB[] arCategoryB) {
		this.name = name; // 매개변수 name을 필드에 저장
		this.arCategoryB = arCategoryB; // 매개변수 arCategoryB를 필드에 저장
	}

}
