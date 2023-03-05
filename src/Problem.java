import java.util.ArrayList;

public class Problem {

	static int getTotalPage(int m, int n){
		if (m%n ==0) {
			return m/n;
		}else {
			return m/n+1;
		}
	}
	
	
	static int getDigitCount(int num) {
		int count = 0;
		while(true) {
			num /= 10;
			count++;
			if (num==0) {
				break;
			}
		}
		return count;
	}
	
	static int getStringDigit(int num) {
		String temp = ""+num;
		int result = temp.length();
		return result;
	}
	
	static int getCharCount(String s) {
		String temp = "";
		for (int i =0; i<s.length();i++) {
			char c= s.charAt(i);
			if (c != ' ') {
				temp+=c;
			}
		}
		return temp.length();
	}
	
	
	
	static void getFibonacci(int a) {

		ArrayList<Integer> fibo = new ArrayList<>();
		fibo.add(0,0);
		fibo.add(1,1);
		
		for(int i=2; i<a; i++) {
			int two = fibo.get(i-2);
			int one = fibo.get(i-1);
			int ori = two+one;
			fibo.add(i,ori);
		}
			
		for(int f:fibo) {
			System.out.printf(f+", ");
		}	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
//		int result=0;
//		for (int i =1;i<1000;i++) {
//			if(i%3==0 || i%5==0) {
//				result += i;
//			}
//		}
//		System.out.println(result);
//		
//		System.out.println(getTotalPage(5, 10));  // 1 출력
//        System.out.println(getTotalPage(15, 10));  // 2 출력
//        System.out.println(getTotalPage(25, 10));  // 3 출력
//        System.out.println(getTotalPage(30, 10));  // 3 출력
//
//        
//        System.out.println(getDigitCount(18695));  
//        System.out.println(getStringDigit(1869566));  
//
//        
//        System.out.println(getCharCount("123 45 67    8"));  
		
		
		
        getFibonacci(13);
		
		
		
		
		
		
	}

}
