import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

public class Jump2 {

	static ArrayList<Integer> habit = new ArrayList<>();
	
	static void addHabit(String ok) {
		if (ok == "o") {
			habit.add(500);
		}
	} 
	
	
	
	public static void main(String[] args) {
		
		int i = 0;
		while (true) {
			i++;
			if (i > 5) {
				break;
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		int third = 0;
		for (int k = 1; k <= 1000; k++) {
			if (k % 3 ==0) {
				third += k;
			}
		}
		System.out.println(third);

		
		
		int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		float average = (float) sum / marks.length;
		System.out.println(average);
		
		
		
		addHabit("o");
		System.out.println(habit);
		
		
		HashSet<Integer> test = new HashSet<>();
		test.add(1);
		System.out.println(test);
		
		
	}

}
