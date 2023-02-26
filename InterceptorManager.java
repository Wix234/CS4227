//first part of the dispatcher
public class InterceptorManager {
    InterceptorChain InterceptorChain;
 
    public InterceptorManager(Target target){
       InterceptorChain = new InterceptorChain();
       InterceptorChain.setTarget(target);
    }
    public void addInterceptor(Interceptor interceptor){
       InterceptorChain.addFilter(interceptor);
    }
 
    public void filterRequest(String request){
       InterceptorChain.execute(request);
    }

    public boolean filterUserRequest(User user){
      return InterceptorChain.execute2(user);
   }
 }
