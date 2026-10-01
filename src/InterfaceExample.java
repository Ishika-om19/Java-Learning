import java.util.Scanner;

interface Client
{
	void input();
	void output();
}

public class InterfaceExample implements Client {
	String name;
	double sal;
	@Override
	public void input() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter Username:");
		name = r.nextLine();
		System.out.println("Enter Salary:");
		sal = r.nextDouble();
		r.close();
	}
	@Override
	public void output() {
		System.out.println(name + " " + sal);
	}
	
	public static void main(String[] args) {
		Client c = new InterfaceExample();
		c.input();
		c.output();
	}

}
