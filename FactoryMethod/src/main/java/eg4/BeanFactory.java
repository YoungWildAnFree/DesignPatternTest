package eg4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {
//    public static UserService getUserService(){
////        //耦合
////        return new UserServiceImpl();
////    }


//    public static UserService getUserService(){
//        //解耦合 通过类反射
//        UserService userService = null;
//        try {
//                            // eg4.UserServiceImplNew 还是耦合
//            Class clazz = Class.forName("eg4.UserServiceImpl");
//            userService = (UserService) clazz.newInstance();
//        } catch (ClassNotFoundException e) {
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        return  userService;

//    }


    //通过配置文件 解决字符串的耦合
    private static Properties env = new Properties();
    static {
        try {
            // 获得 IO输入流
            InputStream resourceAsStream = BeanFactory.class.getResourceAsStream("/applicationContext.properties");

            // 文件内容 放到 Properties

            env.load(resourceAsStream);

            resourceAsStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //解决UserService创建耦合
    public static UserService getUserService(){
        //解耦合 通过类反射
        UserService userService = null;
        try {
            //通过配置文件 解决字符串的耦合
            Class clazz = Class.forName(env.getProperty("userService"));
            userService = (UserService) clazz.newInstance();
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return  userService;

    }

    //解决UserDAO创建耦合
    public static UserDAO getUserDAO(){
        UserDAO userDAO = null;

        try {
            //通过配置文件 解决字符串的耦合
            Class clazz = Class.forName(env.getProperty("userDAO"));
            userDAO = (UserDAO) clazz.newInstance();
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return userDAO;

    }


    //getUserDAO getUserService 工厂方法代码冗余 设计通用工厂方法解决这个问题
    public static Object getBean(String key){

        Object ret = null;

        try {
            //通过配置文件 解决字符串的耦合
            Class clazz = Class.forName(env.getProperty(key));
            ret = clazz.newInstance();
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return ret;

    }



}
