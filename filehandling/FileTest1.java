package filehandling;

import java.io.FileOutputStream;

public class FileTest1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("abc.txt");
			String s = "Hello How are you?";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
