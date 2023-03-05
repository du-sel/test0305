import java.util.HashMap;

public class Morse {
	
	static void getMorse(String str) {
		
		HashMap<String,String> morse = new HashMap<>();
		
		morse.put(".-", "A");
		morse.put("-...", "B");
		morse.put("-.-.", "C");
		morse.put("-..", "D");
		morse.put(".", "E");
		morse.put("..-.", "F");
		morse.put("--.", "G");
		morse.put("....", "H");
		morse.put("..", "I");
		morse.put(".---", "J");
		morse.put("-.-", "K");
		morse.put(".-..", "L");
		morse.put("--", "M");
		morse.put("-.", "N");
		morse.put("---", "O");
		morse.put(".--.", "P");
		morse.put("--.-", "Q");
		morse.put(".-.", "R");
		morse.put("...", "S");
		morse.put("-", "T");
		morse.put("..-", "U");
		morse.put("...-", "V");
		morse.put(".--", "W");
		morse.put("-..-", "X");
		morse.put("-.--", "Y");
		morse.put("--..", "Z");
		//morse.put("*", " ");
		
		
		//String temp = str.replaceAll("  ", " * ");
		String result = "";
		
		
		for(String word : str.split("  ")) {
			for(String c : word.split(" ")) {
				String letter = morse.get(c);
				result += letter;
			}
			result += " ";
		}
		
		System.out.println(result);
	}
	

	public static void main(String[] args) {
		

		getMorse(".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--");
		
		
		
	}

}
