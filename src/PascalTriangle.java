
public class PascalTriangle {
public static void main(String[] args) {
	int rows = 5;
	for (int i=0; i<rows; i++ ) { //i<rows because we want to print in rows
		for(int j=0; j<rows-i; j++) { //to give space at the starting of every row 
			System.out.print(" ");
		}
		int num = 1;
		for(int j=0; j<=i; j++) {
			System.out.print(num + " ");
			num = num *(i-j) / (j+1); //formula for printing the Pascal number
		}
		System.out.println();
	}
}
}
