//class Student {
//	String name;
//	Student (String name){
//		this.name = name;
//	}
//	public boolean equals(Student obj) {
//		return name == obj.name;
//	}
//}

class A{
    public int id;
    A(int id){
        this.id = id;
    }
}

public class equals {

//	public static void main(String[] args) {
//		Student s1 = new Student("sel");
//		Student s2 = new Student("sel");
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
//
//	}

    public static void runValue(){
        String a = "abc";
        String b = a;
        b = "def";
        System.out.println("runValue, "+a); 
    }
     
    public static void runReference(){
        A a = new A(1);
        A b = a;
        b.id = 2;
        System.out.println("runReference, "+a.id);      
    }
 
    public static void main(String[] args) {
        runValue();
        runReference();
    }
 
	
}
