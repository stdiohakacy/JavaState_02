package behavior.State._02;

public class NewState implements State {
	 
    @Override
    public void handleRequest() {
        System.out.println("Create a new document");
    }
}