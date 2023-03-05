import java.util.ArrayList;

class Hidden {
	
	static void getCeaser(String str, int num) {
		
		char[] ch = str.toCharArray();
		
		ArrayList<Character> chNew = new ArrayList<>();
		
		int key = num%26;
		
		for (char a : ch) {
			char b;
			char aNew = (char) (a+key);
			
			if(a != ' ') {
				if(aNew<91) {
					b = aNew;
				} else {
					b = (char)(aNew-26);
				}
			} else {
				b = a;
			}
			
			//chNew.add(b);
			System.out.print(b);
		}
		System.out.println();
//		for(char b : chNew) {
//			System.out.print(b);
//		}	
		
	}
	
	
	
	static String caesar(String word, int n) {
        String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<String> result = new ArrayList<>();
        for (String c : word.split("")) {
            int pos = A.indexOf(c);
            int newPos = pos + n;
            newPos = newPos % A.length();  // 26 자리가 넘어갈 경우에는 회전할 수 있도록 26으로 나눈 나머지 값을 사용한다.
            result.add(A.substring(newPos, newPos + 1));
        }
        return String.join("", result);
    }
	
	
	
	
}



public class Ceaser {

	public static void main(String[] args) {
		
		Hidden.getCeaser("CAT SLEEPS XYZ", 27);

		
		System.out.println(Hidden.caesar("CAT SLEEPS ZZZ", 5));  // HFY
        System.out.println(Hidden.caesar("XYZ", 3));  // ABC
        
	}

}
