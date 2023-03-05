import java.util.Scanner;

public class Zip {

	static String zipString (String str) {
		
		String[] temp = str.split("");
		String result = "";
		String z = "";
		int count = 0;
		
		for (String a : temp) {
			if (!a.equals(z)) {
				z = a;
				if (count !=0) result += count;
				result += a;
				count = 1;
			}
			else {
				count++;
			}
		}
		result += count;
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String :");
		String str = s.nextLine();
		
		System.out.println(zipString(str));
		
	}

}
