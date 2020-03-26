import cn.betterts.dao.UserDao;
import cn.betterts.domain.User;
import cn.betterts.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    @Test
    public void testSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.findAll();
    }
    @Test
    public void testMybatis() throws IOException {
        //        1. 获取字节输入流
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//        2. 根据字节输入流构建SqlSessionBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        3. 根据SqlSessionBuilder创建一个SqlSessionFactory
        SqlSessionFactory factory = sqlSessionFactoryBuilder.build(inputStream);
//        4. 根据SqlSessionFactory获取Dao代理对象
        SqlSession sqlSession = factory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        5. 使用代理对象执行Dao方法
        List<User> users = mapper.findAll();
        for (User user : users){
            System.out.println(user);
        }
//        6. 释放资源
        sqlSession.clearCache();
        inputStream.close();
    }
}
