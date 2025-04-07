package lambdaTask;

public class PrintNameTest {
//	interface PrintName과 lastName firstName을 사용하는 printFullName 메소드
	public void printFullName(PrintName printName, String lastName, String firstName) {
//		interface에 getFullName을 출력해줌
		System.out.println(printName.getFullName(lastName, firstName)); 
	}
	
	public static void main(String[] args) {
		PrintNameTest printNameTest = new PrintNameTest(); // 클래스를 사용하기 위해 받아옴
//		람다식으로 바로 사용함. 한동석을 출력해줌
		printNameTest.printFullName((l, f) -> l + f, "한",  "동석");
		
//		printNameTest.printFullName(new PrintName() {
//			
//			@Override
//			public String getFullName(String lastName, String firstName) {
//				return lastName + firstName;
//			}
//		}, null, null);
	}

}
