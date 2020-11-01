package eg4;

public interface UserDAO {
    public void save(User user);


    public void queryUserByNameAndPassword(String name,String password);
}
