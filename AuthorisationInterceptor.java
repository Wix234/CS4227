//concrete interceptor
public class AuthorisationInterceptor implements Interceptor {

	private String[][] users = {{"12345", "Pandas"}, {"67890","Blob"}};

	public void execute(String request) {
		System.out.println("In authorisation interceptor" + " " + request);
	}

	public boolean execute2(User user) {
		boolean userExists = false; 
		for(int i = 0; i < users.length; i++){
			for(int j = 0; j < users[i].length; j++){
				if(users[i][j].equals(Integer.toString(user.getID()))){
					if(users[i][j+1].equals(user.getPass())){
						userExists = true;
						System.out.println("User " + user.getID() + " has been authorized");
						return true;
					}else{
						userExists = true;
						System.out.println("Password is incorrect");
						return false;					}
				} 
			} 
			
			
		}
		if (userExists == false){
			System.out.println("User details are not in the system");
		}
		return false;

	}
}
