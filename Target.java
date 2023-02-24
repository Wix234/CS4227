public class Target {
    public void execute(String request){
       System.out.println("Executing request: " + " " + request);
    }

    public void execute2(User user){
      System.out.println("User logged in successfully:" + " " + user.getID());
   }
 }
