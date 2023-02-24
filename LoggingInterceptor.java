public class LoggingInterceptor implements Interceptor {
	public void execute(String request) {
		System.out.println("In logging interceptor" + " " + request);
	}

	public void execute2(User user) {
		if (user.getID() == 12345 && user.getPass() == "Pandas"){
			System.out.println("User has been logged in");
		}else{
			System.out.println("User has not been logged in");
		}
	}
}
