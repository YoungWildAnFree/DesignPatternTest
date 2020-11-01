package eg4;
import org.junit.Test;

public class TestEg4 {
    @Test
    public void test1() {

//        UserService userService = new UserServiceImplNew();

        //耦合
//        UserService userService = new UserServiceImpl();

//        //简单工厂方法
//        UserService userService = BeanFactory.getUserService();

        //通用工厂 解决简单工厂创建对象时的代码冗余
        UserService userService = (UserService) BeanFactory.getBean("userService");


        userService.login("aaa","1111");

        User user = new User("bbb", "1123123");

        userService.register(user);

    }

    @Test
    public void test2() {
        Person person = (Person) BeanFactory.getBean("person");
        System.out.println(person);
    }
}
