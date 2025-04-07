package list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?>: 제네릭(generic, 이름이 없는)
//		객체화할 때 타입을 지정하는 기법
//		자료구조를 설계할 때 데이터의 타입을 지정할 수 없기 때문에 임시로 타입을 선언한다.
//	따로 다운 캐스틸 할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 때문에 Object와 목적이 다르다.
		ArrayList<Integer> datas = new ArrayList<Integer>();

		System.out.println(datas.size()); 
		// ArrayList는 배열의 칸수를 정할수없기에 기본값인 0 으로 출력됨
		
		// datas에 add를 이용해 값을 추가해줌
		datas.add(40);
		datas.add(50);
		datas.add(90);
		datas.add(70);
		datas.add(10);
		datas.add(80);
		datas.add(30);
		datas.add(20);

		System.out.println(datas); // add로 추가된 값들을 datas로 출력
		System.out.println(datas.size()); // 몇개가 들어갔는지 확인해줌

		Collections.sort(datas); // sort를 이용해 오름차순으로 정렬해줌
		System.out.println(datas); // 오름차순으로 정렬된 datas를 출력해줌

		Collections.reverse(datas); // 내림차순 기능이 없기에 오름차순으로 정렬후 reverse로 뒤집어줌
		System.out.println(datas); // 뒤집어준 값들을 출력

		Collections.shuffle(datas); // shuffle을 이용해 배열의 순서를 마구잡이로 섞어줌
		System.out.println(datas); // 섞어준 datas를 출력

//	      추가(삽입), 60은 항상 30뒤에 삽입한다.
		if (datas.contains(30)) { // 만약 datas가 30을 포함했다면
			datas.add(datas.indexOf(30) + 1, 60); 
				// 30이 있는 index를 찾고 그 뒤에 60을 넣기위해 +1을 해줌
			System.out.println(datas); // 60이 30뒤에 추가된 datas를 출력해줌
		} else {
			System.out.println("30은 없습니다."); // 만약 30이 없다면 출력해줄 메세지
		}

//	      수정, 10을 1로 수정한다.
		if (datas.contains(10)) { // 만약 datas에 10이 포함되어있다면
			System.out.print("수정 전: "); // 수정 전 원본 출력
			System.out.println(datas.set(datas.indexOf(10), 1)); // 수정 전 값을 출력해줌

			System.out.println("수정 후: "); // 수정 후 를 출력해줌
			System.out.println(datas); // 수정 후 datas 전체를 출력해줌
		} else {
			System.out.println("10이 없습니다.");
		}

//	      삭제(값으로 삭제), 20을 삭제한다.
//		remove(Object)를 사용하는데 20은 정수형이기 때문에  
//		Object에 더 가까운 Integer로 변환시킨 후 값을 찾는 valueOf를 사용해서 값을 remove해준다.  
		if (datas.remove(Integer.valueOf(20))) { 
			System.out.println("삭제 성공");
			System.out.println(datas); // 값을 삭제한 후 출력
		} else {
			System.out.println("삭제 실패"); // 만약 값이 없다면 삭제 실패 출력
		}

//	      삭제(인덱스로 삭제), 50을 삭제한다.
		int i = datas.indexOf(50); // indexOf를 활용, 50이 있는 index를 찾아주고
		if (i != -1) { // index를 맞추기위해 -1을 해고 remove로 찾은 index에 -1 한걸 넣어주면
			System.out.println(datas.remove(i) + " 삭제 성공"); //50 삭제 성공
			System.out.println(datas); // 배열 출력
		} else {
			System.out.println("삭제 실패"); // 만약 50이 없다면 삭제 실패 출력
		}

//	      조회
	      System.out.println(datas.get(3)); // get을 사용해 3번 index에 있는 값을 출력
		for (int data : datas) { // 빠른 for문을 이용해 반복해줌
			System.out.println(data);
		}
	}
}
