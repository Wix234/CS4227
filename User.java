public class User {
    private int ID;
    private String password;

    public User(int ID, String password){
        this.ID = ID;
        this.password = password;
    }

    public int getID(){
        return ID;
    }
    public void setId(int ID){
        this.ID = ID;
    }

    public String getPass(){
        return password;
    }

    public void setPass(String pass){
        this.password = pass;
    }

}
