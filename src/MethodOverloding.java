//Method overloading means having multiple methods with same name but different parameters.
//Because main is static, it can directly call another static method without creating an object.

public class MethodOverloding {
	static void area(int side) { //here if we don't use static we have to make object example:-Area obj = new Area(); obj.area(4);
		System.out.println("Area of Square = " + (side * side));
	}
	static void area(int length, int breadth) {
		System.out.println("Area of Reactangle = " + (length * breadth));
	}
	static void area(double radius) {
		System.out.println("Area of Circle = " + (3.14 * radius * radius));
	}
public static void main(String[] args) {
	area(5);
	area(10, 5);
	area(3.5);
}
}
