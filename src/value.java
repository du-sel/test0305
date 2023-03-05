
public class value {

	static void _value(int b) {
		b = 2;
	}
	
	static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue, "+a);
	}
	
	public static void main(String[] args) {
		
		runValue();

	}

}
