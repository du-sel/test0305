import java.util.Arrays;

class Cal {

	int[] data;

	Cal(int[] data){
		this.data = data;
	}
	
	

	
	int sum() {
//	       return Arrays.stream(data).sum();
		int total = 0;
		for(int num : data) {
			total +=num;
		}
		return total;
	}
	
	
	double avg() {
		double avg = (double) sum()/ data.length;
		return avg;
	}
	

	
	
	
}




public class CalTest {

	public static void main(String[] args) {
        int[] data1 = {1,2,3,4,5};
        Cal cal1 = new Cal(data1);
     //   System.out.println(cal1.sum()); // 15 출력
        System.out.println(cal1.avg()); // 3.0 출력
        System.out.println(cal1.data.length);

        int[] data2 = {6,7,8,9,10};
        Cal cal2 = new Cal(data2);
        System.out.println(cal2.sum()); // 40 출력
        System.out.println(cal2.avg()); // 8.0 출력

	}

}
