package ChainOfResponsibility;

public class UserExistsMiddleware extends Middleware {
	private Server server;

	public UserExistsMiddleware(Server server) {
		this.server = server;
	}


	@Override
	public boolean check(String user, String pass) {
		if(!server.hasUser(user)) {
			System.out.println("User does not exist");
			return false;
		}
		
		if(!server.isValidPassword(user, pass)) {
			System.out.println("Invalid password");
			return false;
		}
		
		return checkNext(user, pass);
	}

}
