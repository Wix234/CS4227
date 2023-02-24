public class AuthorisationInterceptor implements Interceptor {
	public void execute(String request) {
		System.out.println("In authorisation interceptor" + " " + request);
	}
    }
