package behavior.State._02;

public class RejectedState implements State {
	 
    @Override
    public void handleRequest() {
        System.out.println("Rejected");
    }
}