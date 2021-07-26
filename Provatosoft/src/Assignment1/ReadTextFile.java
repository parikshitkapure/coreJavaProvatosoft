package Assignment1;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;


public class ReadTextFile {

	public static void main(String[] args) throws Exception {
		
		File file =new File("F:\\abc.txt");
		BufferedReader bf = new BufferedReader(new FileReader(file));
		
		String str ;
		while((str=bf.readLine())!=null) {
			System.out.println(str);
		}

	}

}
