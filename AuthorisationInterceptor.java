//concrete interceptor
public class AuthorisationInterceptor implements Interceptor {
	public void execute(String request) {
		System.out.println("In authorisation interceptor" + " " + request);
	}

	public void execute2(User user) {
		if (user.getID() == 12345 && user.getPass() == "Pandas"){
			System.out.println("User has been authorized");
		}else{
			System.out.println("User details are not in the system");
		}
	}
}
