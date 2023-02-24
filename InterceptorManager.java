public class InterceptorManager {
    InterceptorChain InterceptorChain;
 
    public InterceptorManager(Target target){
       InterceptorChain = new InterceptorChain();
       InterceptorChain.setTarget(target);
    }
    public void setFilter(Interceptor interceptor){
       InterceptorChain.addFilter(interceptor);
    }
 
    public void filterRequest(String request){
       InterceptorChain.execute(request);
    }
 }