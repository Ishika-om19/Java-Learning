import java.util.Scanner;

public class SortList {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Input how many names the user wants to enter
	System.out.print("Enter number of names: ");
	int n = sc.nextInt();
	//Create an array to store names
	String [] names = new String [n];
	//Take name as input 
	System.out.println("Enter " + n + "names: ");
	
	for(int i = 0; i < n; i++) {
		names[i] = sc.next();
	}
	//Manual sorting using nested loops
	for(int i = 0; i < n; i++) {
		for(int j = i + 1; j < n ; j++) {
			//Compare two names
			if(names[i].compareTo(names[j]) > 0) {
				//Swap the names
				String temp = names[i];
				names[i] = names[j];
				names[j] = temp;
			}
		}
	}
	//Display sorted names
	System.out.println("Names in asceeding order : ");
	for(int i = 0; i < n; i++) {
		System.out.println(names[i]);
	}
	sc.close();
}
}
