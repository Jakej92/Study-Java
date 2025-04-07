package classTest.ClassTask05;

public class CategoryB {
//	이름을 넣을 필드
	String name;
//	소카데고리를 배열로 받아옴
	CategoryC[] arCategoryC;

//	기본 생성자
	public CategoryB() {
		;
	}

//	매개변수가 있는 생성자 
	public CategoryB(String name, CategoryC[] arCategoryC) {
		this.name = name; // 매개변수 name을 필드에 넣어줌
		this.arCategoryC = arCategoryC; // 매개변수 arCategoryC을 필드에 넣어줌
	}

}
