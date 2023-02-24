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

   public void setTarget(Target target){
      this.target = target;
   }
}
