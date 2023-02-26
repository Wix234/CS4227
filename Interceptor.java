//interceptor
public interface Interceptor {
    public void execute(String request);

    public boolean execute2(User user);
}
