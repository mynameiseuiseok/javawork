package strings;

public class StringIndexOf {

	public static void main(String[] args) {
		// indexOf() - 찾는 문자의 첫 위치가 반환(리턴)
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("자바");
		System.out.println(location);
		
		if(location >= 0) { // 못 찾으면 -1을 반환, location >= 0
			System.out.println("자바와 관련된 책이군요!");
		}else {
			System.out.println("자바와 관련이 없는 책이군요!");
		}
	}
}