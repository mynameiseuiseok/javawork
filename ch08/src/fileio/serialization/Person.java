package fileio.serialization;

import java.io.Serializable;

// 클래스의 직렬화(현재의 상태를 그대로 저장)
public class Person implements Serializable{

	private static final long serialVersionUID = 10L;
	
	// 필드
	String name;
	String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return name + ", " + job;
	}
}