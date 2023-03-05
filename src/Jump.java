import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Comparator;
import java.util.HashMap;

public class Jump {
	
	enum CoffeeType {
		AMERICANO,
		ICED_AMERICANO,
		LATTE
	}
	
	static void printCoffeePrice(CoffeeType type) {
		
		HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
		priceMap.put(CoffeeType.AMERICANO, 3000); //1: 아메리카노
		priceMap.put(CoffeeType.ICED_AMERICANO, 4000); //2: 아이스 아메리카노
		priceMap.put(CoffeeType.LATTE, 5000); //3: 카페라떼
		int price = priceMap.get(type);
		System.out.println(String.format("The price is %d won.", price));
	}

	public static void main(String[] args) {
		
		printCoffeePrice(CoffeeType.AMERICANO);
		
		
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
		
		//교집합
		HashSet<Integer> intersection = new HashSet<>(s1);
		intersection.retainAll(s2);
		System.out.println(intersection);
		
		//합집합
		HashSet<Integer> union = new HashSet<>(s1);
		union.addAll(s2);
		System.out.println(union);
		
		//차집합
		HashSet<Integer> substract = new HashSet<>(s1);
		substract.removeAll(s2);
		System.out.println(substract);
		
		
		String id = "881120-1068234";
		System.out.println(id.substring(0, 6));
		System.out.println(id.substring(7));
		System.out.println(id.charAt(7));
		
		String re = "a:b:c:d";
		System.out.println(re.replaceAll(":", "#"));
		System.out.println(re);
		
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
		myList.sort(Comparator.reverseOrder());
		System.out.println(myList);
		
		ArrayList<String> life = new ArrayList<>(Arrays.asList("Life","is","too","short"));
		String sentence = String.join(" ", life);
		System.out.println(sentence);
		
		
		HashMap<String, Integer> grade = new HashMap<>();
		grade.put("A", 90);
		grade.put("B", 80);
		grade.put("C", 70);
		System.out.println(grade.remove("B"));
		System.out.println(grade);
		
		
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5,6));
		HashSet<Integer> temp = new HashSet(num);
		ArrayList<Integer> again = new ArrayList(temp); //원래 어레이였으므로 다시 어레이형으로 바꿔주는게 좋음
		System.out.println(again);
		
//		HashSet<Integer> num2 = new HashSet<>();
//		num2.addAll(num);
//		System.out.println(num2);
		
		
//		for (int i=0; i < 6; i++) {
//			int[] j = {1,2,3,4,5};
//			System.out.println("*");
//		}
		
		
		
	}

}
