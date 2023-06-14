package fileio.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		// 클래스의 직렬화(현재의 상태를 그대로 저장)
		Person son = new Person("손정의", "대표이사");
		Person lee = new Person("이재용", "삼성 회장");

		// 보조스트림 - ObjectOutputStream
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(son); 	// 객체 쓰기
			oos.writeObject(lee);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 역직렬화 - 복원
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			Person p1 = (Person)ois.readObject();	// 객체 읽기
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			// System.out.println(p1.toSring());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}