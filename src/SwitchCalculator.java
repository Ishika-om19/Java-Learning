import java.util.*;

public class SwitchCalculator {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of a : ");
	int a = sc.nextInt();
	System.out.print("Enter the value of b : ");
	int b = sc.nextInt();
	System.out.print("Enter the Operator : ");
	char op = sc.next().charAt(0);
	
	switch(op) {
	case '+' :
		System.out.println("sum = " + (a+b));
		break;
	case '-' :
		System.out.println("sub = " + (a-b));
		break;
	case '*' :
		System.out.println("mul = " + (a*b));
		break;
	case '/' :
		System.out.println("div = " + (a/b));
		break;
	default :
		System.out.println("worng operator !");
	}
	sc.close();
}
}
