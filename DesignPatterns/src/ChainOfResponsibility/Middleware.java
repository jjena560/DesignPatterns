package ChainOfResponsibility;

public abstract class Middleware {
	private Middleware next;
	public abstract boolean check(String user, String pass);
	
	// Similar to LinkedList Implementation
	// ... means list of middleware
	public static Middleware link(Middleware first, Middleware... chain) {
		Middleware head = first;
		for(Middleware nextInChain: chain) {
			head.next = nextInChain;
			head = nextInChain;
		}
		
		return first;
	}
	
	protected boolean checkNext(String user, String pass) {
		if(next == null) {
			return true;
		}
		
		return next.check(user, pass);
	}
}
