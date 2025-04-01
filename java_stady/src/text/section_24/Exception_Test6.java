package text.section_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_Test6 {

	
		
		static void method1() throws FileNotFoundException{
			Scanner scanner = new Scanner(new File("method1.txt"));
			
			while (scanner.hasNext()) {
				String input = scanner.nextLine();
				System.out.println(input);
			}
		}
		
		public static void main(String[] args) {
			
			try {
				method1();
			}catch (FileNotFoundException e) {
				System.out.println("ファイルが見つかりません");
			}
		
	}

}
