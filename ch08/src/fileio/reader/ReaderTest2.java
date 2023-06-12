package fileio.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest2 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = null;
		try {
			fr = new FileReader("data2.txt");
			int data;
		 
		 	while((data = fr.read()) != -1) {
		 		System.out.print((char)data);
		 	}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	 
		fr.close();
	}
}