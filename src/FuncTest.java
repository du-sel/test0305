import java.util.ArrayList;
import java.util.Arrays;

public class FuncTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        
        int[] result = Arrays.stream(numbers)
        		.filter((a) -> a%2==1)
        		.map((a) -> a*2)
        		.toArray()
        		;
        
        
        
//        ArrayList<Integer> temp = new ArrayList<>();
//        for (int num : numbers) {
//            if (num % 2 == 1) {  // 홀수이면 
//                temp.add(num * 2);  // 2를 곱하여 temp에 담는다.
//            }
//        }
//
//        // 정수 리스트를 정수배열로 변환한다.
//        int[] result = new int[temp.size()];
//        for (int i = 0; i < temp.size(); i++) {
//            result[i] = temp.get(i);
//        }
        
        
        
        int[] nums = {1, -2, 3, -5, 8, -3};
        
        int[] end = Arrays.stream(nums)
        		.filter((a) -> a>=0)
        		.toArray()
        		;
        
        for (int num:end) {
        	System.out.println(num);
        }
        
        
        
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        
        int[] good = Arrays.stream(A)
        		.filter((a) -> a>=50)
        		.toArray()
        		;
        
    	int sum = 0;
        for (int score:good) {
        	sum += score;
        }
        System.out.println(sum);
        
        
        
        
    }
}