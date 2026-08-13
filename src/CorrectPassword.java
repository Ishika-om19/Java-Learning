import java.util.*;

public class CorrectPassword {
public static void main(String args[]) {
	String originalPassword = "Ishika";
	Scanner sc = new Scanner(System.in);
	String userPassword;
	do {
		System.out.print("Enter your password = ");
		userPassword = sc.nextLine();
		if(originalPassword.equals(userPassword)) {
			System.out.print("Correct Password Welcome");
			break;
		} else {
			System.out.println("Wrong Password Try Again");
		}
	}while(true);
	sc.close();	
}
}
