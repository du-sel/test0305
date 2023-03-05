import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java. io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Input {

	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(sc.nextLine());
		
//		FileOutputStream output = new FileOutputStream("c:/out.txt");
//		output.close();
		
		PrintWriter pw = new PrintWriter("c:/Users/ymdlo/Desktop/out.txt");
		for(int i =1; i <11; i++) {
			String data = i+" Line";
			pw.println(data);
		}
		pw.close();
		
		
		
		PrintWriter pw2 = new PrintWriter(new FileWriter("c:/Users/ymdlo/Desktop/out.txt", true));
		for(int i =11; i<21; i++) {
			String data = i+" Line";
			pw2.println(data);
		}
		pw2.close();
	
		
//		byte[] b = new byte[1024];
//		FileInputStream input = new FileInputStream("c:/Users/ymdlo/Desktop/out.txt");
//		input.read(b);
//		System.out.println(new String(b));
//		input.close();
		
		BufferedReader buff = new BufferedReader(new FileReader("c:/Users/ymdlo/Desktop/out.txt"));
		while (true) {
			String line = buff.readLine();
			if (line == null) break;
			System.out.println(line);
		}
		buff.close();
		
		
		
		
		
		
		
	}
}
