package test;

import data.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by whistle on 16-10-23.
 */
public class TestSelect {
    public static void main (String[] args) {
        String resource = "conf.xml";
        InputStream is = TestSelect.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession();

        String statement = "mapping.userMapper.getUser";
        User user = sqlSession.selectOne(statement, 2);
        sqlSession.close();
        System.out.println(user);
    }
}
