package behavior.State._02;

public class ApprovedState implements State {

	@Override
	public void handleRequest() {
		System.out.println("Approved");
	}
}