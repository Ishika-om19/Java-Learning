import java.util.*;

public class Armstrong {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		int original = n;
		int temp = n;
		int digits = 0;
		int sum = 0;
		
		while(temp > 0) {
			digits = digits + 1;
			temp = temp / 10;
		}
		
		temp = n;
		
		while(temp > 0) {
			int digit = temp % 10;
			sum = sum + (int)Math.pow(digit, digits);
			temp = temp / 10;
		}
		
		if(original == sum) {
			System.out.println(original + " is an Armstrong number");
		} else {
			System.out.println(original + " is not an Armstrong number");
		}
	sc.close();
	}

}
