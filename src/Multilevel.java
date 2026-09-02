class Animal{
	void eat() {
		System.out.println("Animal eats");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks");
	}
}

public class Multilevel extends Dog {
	void play() {
		System.out.println("Puppy plays");
	}
	public static void main(String[] args) {
		Multilevel p = new Multilevel();
		p.eat();
		p.bark();
		p.play();
	}

}
