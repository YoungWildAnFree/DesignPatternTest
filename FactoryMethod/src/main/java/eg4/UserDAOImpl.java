package eg4;

public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User user) {

        System.out.println("save user "+user);

    }

    @Override
    public void queryUserByNameAndPassword(String name, String password) {

        System.out.println("query user "+ "name "+name+"password"+password);
    }
}
