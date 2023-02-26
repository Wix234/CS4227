//second part of the dispatcher
import java.util.ArrayList;
import java.util.List;

public class InterceptorChain {
   private List<Interceptor> inters = new ArrayList<Interceptor>();
   private Target target;

   public void addFilter(Interceptor filter){
      inters.add(filter);
   }

   public void execute(String request){
      for (Interceptor inter : inters) {
         inter.execute(request);
      }
      target.execute(request);
   }

   public boolean execute2(User user){
      boolean checkForUser = false;
      int count = 0;
      for (Interceptor inter : inters) {
         checkForUser = inter.execute2(user);
         if(checkForUser){
            count++; 
         }
      }
      return target.execute2(user, count);
   }

   public void setTarget(Target target){
      this.target = target;
   }
}

