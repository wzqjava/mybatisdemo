import com.smbms.dao.UserMapper;
import com.smbms.pojo.User;
import com.smbms.pojo.UserExt;
import com.smbms.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Created by Ray on 2019-09-05
 */
public class TestMapper {

    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(1L);
        System.out.println(user);
    }

    @Test
    public void test2() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.findUserList();

        System.out.println(list);
        List<String> alist = new ArrayList<String>();
        alist.add("hello");
        alist.add("java");
        alist.add("world");
        System.out.println(alist);
    }

    @Test
    public void test3() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setId(1L);
        user.setUserName("张无忌");
//        Integer i = userMapper.updateUser(user);
        Integer i = userMapper.updateUser(1L, "张三丰");
        sqlSession.commit();
        if (i>0) {
            System.out.println("修改成功！");
        }
        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setUserCode("sunwukong");
        user.setUserName("孙悟空");
        user.setUserPassword("333333");
        Integer i = userMapper.insertUser(user);
        sqlSession.commit();
        if (i>0) {
            System.out.println("增加成功！");
        }
        sqlSession.close();
    }

    @Test
    public void testDel() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Integer i = userMapper.deleteUserById(16L);
        sqlSession.commit();
        if (i>0) {
            System.out.println("删除成功！");
        }
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession session = SqlSessionUtil.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.findUserById(1L);
        System.out.println(user);
        session.close();
    }

    @Test
    public void testUserList(){
        SqlSession session = SqlSessionUtil.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<UserExt> userExts = userMapper.selectUserListByContion();
        for (UserExt userExt : userExts) {
            System.out.println(userExt.getUserName()+"--"+userExt.getRoleName());
        }

        session.close();
    }

    @Test
    public void testUserList2(){
        SqlSession session = SqlSessionUtil.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUserListByContion2();
        for (User user : users) {
            System.out.println(user.getUserName());
        }

        session.close();
    }
    @Test
    public void testDelay(){
        SqlSession session = SqlSessionUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> user = mapper.findUserList();
        System.out.println(user.get(0).getUserName());
    }
}
