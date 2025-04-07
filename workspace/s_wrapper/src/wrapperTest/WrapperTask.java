package wrapperTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class WrapperTask <T>{
	T data;
	
	
	public static void main(String[] args) {
//		1, 3.56, 'A', false, "ABC"
//		위 5개의 값을 하나의 배열에 모두 담고 출력한다.
		Object[] arData = {1, 3.56, 'A', false, "ABC"};
		
//		 배열 arData의 각 요소를 순서대로 가져와 data 변수에 저장하며 반복
		for (Object data: arData) { 
			System.out.println(data);
		}
		
//		ArrayList<E>
//		HashMap<K, V>
//		HashSet<E>
	}
}










