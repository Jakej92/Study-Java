package objectTest;

public class Student {
//	외부에서 직접 접근하거나 변경하지 못하도록 private을 사용 하여 클래스에서 전체 공유가능한 static  
	private static int seq; // 정수형 타입 seq 필드

	private int id; // 정수형 id 필드
	private String name; // 문자열 타입 name 필드
	private int score; // 정수형 타입 score 필드

	static {
		seq = 0; // seq를 사용하기 위해 클래스를 불러올때 기본값을 0으로 초기화
	}

	{
		id = ++seq; // id는 seq를 하나씩 더해줌
	}

	public Student() {
		;
	} // 기본생성자

//	오버로딩(overloading)
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

//	오버로딩(overloading)
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

//	id필드의 값을 리턴해주는 메소드
	public int getId() {
		return id;
	}

//	name필드의 값을 리턴해주는 메소드
	public String getName() {
		return name;
	}

//	문자열 타입 name을 받아와 객체의 name 필드를 설정하는 setName 메서드
	public void setName(String name) {
		this.name = name;
	}

//	score필드의 값을 리턴해주는 getScore메소드
	public int getScore() {
		return score;
	}

//	정수형 타입 score를 받아와 객체의 score 필드를 설정해주는 setter
	public void setScore(int score) {
		this.score = score;
	}

	@Override
//	object 클래스의 toString을 받아오면 주소값을 출력해주기 때문에 내가 원하는걸 출력하기위해
//	overriding을 해줌
	public String toString() { 
//		overriding을 해서 id, name, score를 출력해줌
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

	@Override
//	object 클래스의 equals를 사용하면 주소값을 출력해주기 때문에 내가 원하는 걸 출력하기위해
//	overriding해줌
	public boolean equals(Object obj) {
		if (this == obj) { //만약 현재 사용할 객체(this)가 비교할 객체와 주소값이 같은지 확인
			return true; // 같다면 true를 리턴
		}

		if (obj instanceof Student) { // 만약 obj가 student클래스의 인스턴스인지 확인
//			obj를 Student 타입으로 다운 캐스팅하여 anotherStudent 변수에 저장
			Student anotherStudent = (Student) obj; 
//			현재 객체의 id와 anotherStudent의 id가 같은지 확인
			if (this.id == anotherStudent.id) {
				return true; // 같다면 true를 리턴
			}
			return false; // 아니라면 false를 리턴
		}

		return false; // 위 조건이 하나도 안맞다면 false를 리턴
	}

}
