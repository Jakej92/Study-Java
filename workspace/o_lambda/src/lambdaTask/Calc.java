package lambdaTask;

@FunctionalInterface
public interface Calc {
//	두 정수의 연산을 수행하고 리턴하는 추상 메소드 선언
	public int calc(int number1, int number2);
}
