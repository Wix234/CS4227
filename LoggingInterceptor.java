//concrete interceptor

public class LoggingInterceptor implements Interceptor {

	private String[][] users = {{"12345", "Pandas"}, {"67890","Blob"}};

	public void execute(String request) {
		System.out.println("In logging interceptor" + " " + request);
	}

	public boolean execute2(User user) {
		boolean userExists = false; 
		for(int i = 0; i < users.length; i++){
			for(int j = 0; j < users[i].length; j++){
				if(users[i][j].equals(Integer.toString(user.getID()))){
					if(users[i][j+1].equals(user.getPass())){
						userExists = true;
						System.out.println("User " + user.getID() + " has been logged in");
						return true;
					}else{
						userExists = true;
						System.out.println("User " + user.getID() + " has not been logged in");
						return false;
					}
				}  
			}  
		}

		if (userExists == false){
			System.out.println("Login attempt failed");
		}
		return false;
	}
}
