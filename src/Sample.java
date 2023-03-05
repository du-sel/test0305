abstract class Predator extends Animal {
	abstract String getFood();
	
	static int LEG_COUNT = 4;
	
	int speed() {
		return LEG_COUNT * 30;
	}
	
	int speed(int leg) {
		return leg * 30;
	}
}

interface Barkable {
	void bark();
}

class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	void sleep() {
		System.out.println(this.name+" zzz");
	}
}

class HouseDog extends Dog {
	HouseDog(String name){    //생성자
		setName(name);
	}
	
	void sleep() {
		System.out.println(this.name+" zzz in the house");
	}
	
	void sleep(int hour) {
		System.out.println(this.name+" zzz in the house for "+hour+" hours");
	}
}



class Tiger extends Animal implements Barkable {
	public String getFood() {
		return "apple";
	}
	
	public void bark() {
		System.out.println("wawa");
	}
}

class Lion extends Animal implements Barkable {
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("roro");
	}
}

class ZooKeeper {
	void feed(Predator predator) {
		System.out.println("feed "+predator.getFood());
	}
}

class Bouncer {
	void barkAnimal(Barkable animal) {
		animal.bark();
	}
}

class Puma extends Predator {
	public String getFood() {
		return "pear";
	}
}


public class Sample {
	public static void main(String[] args) {
		
//		HouseDog dog = new HouseDog("chuchu");
//		HouseDog dog2 = new HouseDog("machu");
//		
//		System.out.println(dog.name);
//		System.out.println(dog2.name);
		
		
		
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		//zooKeeper.feed(tiger);
		//zooKeeper.feed(lion);
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
		
		Puma puma = new Puma();
		int fast = puma.speed(2);
		System.out.println(fast);
		int test = puma.speed();
		System.out.println(test);
	}
}
