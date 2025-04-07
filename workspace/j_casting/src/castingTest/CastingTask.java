package castingTest;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스, 모두 영상이다.

// 사용자가 선택한 영상이
// 1. 애니메이션이라면, "자막 지원" 기능 사용
class Animation extends Video { // Video클래스를 상속 받는 Animation class
	// 메소드
	void printSubtitle() { // 출력 메소드 
		System.out.println("자막 지원"); // 출력
	}
}

// 2. 영화라면, "4D" 기능 사용
class Film extends Video { // Video class를 상속받는 Film class 
	// 메소드
	void shake() { // 출력 메소드
		System.out.println("4D"); // 출력
	}
}

// 3. 드라마라면, "굿즈" 기능 사용
class Drama extends Video { // Video class를 상속받는 Drama class
	// 메소드
	void sellGoods() { // 출력 메소드
		System.out.println("굿즈"); // 출력
	}
}

public class CastingTask { 

//   이 세 종류의 영상 중 사용자가 선택한 한 가지가 들어온다.
	void getService(Video video) { // Video 클래스를 매개변수로 선언한 메소드
//		매개변수에 상위 클래스 타입이 지정되어 있기 때문에, 
//		전달된 하위 클래스 객체는 자연스럽게 상위 클래스 타입으로 간주된다
		
		if (video instanceof Animation) { // instanceof로 자료형 검사
			Animation animation = (Animation) video; 
// Down Casting을 해줌, 위에 상위클래스 타입이 매개변수로 들어갔기 때문에 down casting이 가능함			
			animation.printSubtitle(); // Animation class의 printSubtitle 메소드를 사용
		} else if (video instanceof Film) { // 자료형 검사
			Film film = (Film) video; 
// Down Casting을 해줌, 위에 상위클래스 타입이 매개변수로 들어갔기 때문에 down casting이 가능함
			film.shake(); 
		} else if (video instanceof Drama) { // 자료형 검사
			Drama drama = (Drama) video; 
// Down Casting을 해줌, 위에 상위클래스 타입이 매개변수로 들어갔기 때문에 down casting이 가능함
			drama.sellGoods();
		}
	}

	public static void main(String[] args) {
		new CastingTask().getService(new Animation());
		
//      CastingTask casting = new CastingTask();
//      casting.getService(new Animation());
//      Animation ani = new Animation();
//      casting.getService(ani);
	}
}
