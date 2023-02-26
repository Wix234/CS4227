public class Target {
    public void execute(String request){
       System.out.println("Executing request: " + " " + request);
    }

    public boolean execute2(User user, int count){
      if (count == 2){
         System.out.println("User " + user.getID() + " logged in successfully");
         System.out.println("User " + user.getID() + " may now edit the weather conditions" + "\n");
         return true;
      }else{
         System.out.println("User " + user.getID() + " did not log in successfully" + "\n");
         return false;
      }
   }
 }
