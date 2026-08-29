
public class ConstructorOverloading {
	String name;
	int age;
	
	// Constructor 1 : No parameter
	ConstructorOverloading(){
		name = "Unknown";
		age = 0;
	}
	// Constructor 2 : One parameter
	ConstructorOverloading(String name){
		this.name = name;
		age = 0;
	}
	// Constructor 3 : Two parameter
	ConstructorOverloading(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// Display student details
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println();
	}
	public static void main(String[] args) {
		// Object using constructor 1
		ConstructorOverloading c1 = new ConstructorOverloading();
		// Object using constructor 2
		ConstructorOverloading c2 = new ConstructorOverloading("Ishika");
		// Object using constructor 3
		ConstructorOverloading c3 = new ConstructorOverloading("Hariom", 21);
		c1.display();
		c2.display();
		c3.display();
	}

}
