//part of the dispatcher
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

   public void execute2(User user){
      for (Interceptor inter : inters) {
         inter.execute2(user);
      }
      target.execute2(user);
   }

   public void setTarget(Target target){
      this.target = target;
   }
}

