package eg4;

public class UserServiceImpl implements UserService {
//
//    //耦合
//    private UserDAO userDAO = new UserDAOImpl();

//    //解耦合
//    private UserDAO userDAO = BeanFactory.getUserDAO();

    private UserDAO userDAO = (UserDAO) BeanFactory.getBean("userDAO");


    @Override
    public void register(User user) {
        userDAO.save(user);
    }

    @Override
    public void login(String name, String password) {

        userDAO.queryUserByNameAndPassword(name,password);
    }
}
