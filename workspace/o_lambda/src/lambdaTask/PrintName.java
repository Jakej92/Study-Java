package lambdaTask;

@FunctionalInterface
public interface PrintName {
//	문자열 lastName과 firstName을 받아오는 getFullName 메소드
	public String getFullName(String lastName, String firstName);
}
