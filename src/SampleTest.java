import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
	int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
    
    
    int avg (int[] data) {
    	int sum = 0;
    	for (int number: data) {
    		sum += number;
    	}
    	return sum / data.length;
    }
    
    int avg (ArrayList<Integer> data) {
    	int sum = 0;
    	for (int number: data) {
    		sum += number;
    	}
    	return sum / data.size();
    }
    
}

class UpgradeCalculator extends Calculator {
	
	void minus(int val) {
		this.value -= val;
	}
}

class MaxLimitCalculator extends Calculator {
	void add(int val) {
		this.value += val;
//		if (this.value <= 100) {
//			this.value = this.value;
//		} else {
//			this.value = 100;
//		}
		if (this.value > 100) {
			this.value = 100;
		}
	}
}

class OddEven {
	Boolean isOdd(int val) {
//		if (val%2 == 1) {
//			return true;
//		} else {
//			return false;
//		}
		return val % 2 ==1;
	}
}

public class SampleTest {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
        cal.add(10);
        System.out.println(cal.getValue());
        
        UpgradeCalculator cal2 = new UpgradeCalculator();
        cal2.add(10);
        cal2.minus(3);
        System.out.println(cal2.getValue());  // 10에서 7을 뺀 3을 출력
        
        MaxLimitCalculator cal3 = new MaxLimitCalculator();
        cal3.add(50);  // 50 더하기
        cal3.add(60);  // 60 더하기
        System.out.println(cal3.getValue());  // 100 출력
     
        
        OddEven odd = new OddEven();
        System.out.println(odd.isOdd(3)); //true
        System.out.println(odd.isOdd(4)); //false
        
        
        int[] data = {1, 3, 5, 7, 9};
        //Calculator cal4 = new Calculator();
        int result = cal.avg(data);
        System.out.println(result);
        
        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        //Calculator cal5 = new Calculator();
        int result5 = cal.avg(data2);
        System.out.println(result5);
        
	}
}
