interface Cart{
	default void showStatus() {
		System.out.println("Camera is ready to capture images.");
	}
}

interface Gaming{
	default void showStatus() {
		System.out.println("Gaming mode is active");
	}
}

class SmartWatch implements Cart, Gaming{
	@Override
	public void showStatus() {
		Cart.super.showStatus();
		Gaming.super.showStatus();
		System.out.println("SmartPhone dashboard status updated.");
	}
}

public class DiamondProblem {
	public static void main(String[] args) {
		SmartWatch myPhone = new SmartWatch();
		myPhone.showStatus();
	}

}
