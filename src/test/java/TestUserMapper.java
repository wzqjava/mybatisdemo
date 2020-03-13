import com.smbms.dao.UserMapper;
import com.smbms.pojo.User;
import com.smbms.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * description:
 * Created by Ray on 2019-09-09
 */
public class TestUserMapper {

    @Test
    public void testCache1(){
        SqlSession session = SqlSessionUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.findUserById(1L);

        System.out.println(user);
//        mapper.updateUser(1L, "张无忌");
//        session.commit();
        session.close();

        SqlSession sqlSession=SqlSessionUtil.getSession();
        UserMapper mapper1 = sqlSession.getMapper(UserMapper.class);

        User user1 = mapper1.findUserById(1L);
        System.out.println(user1);

        session.close();
    }

    @Test
    public void testCache2(){
        SqlSession session1 = SqlSessionUtil.getSession();
        UserMapper mapper1 = session1.getMapper(UserMapper.class);
        User user1 = mapper1.findUserById(1L);
        session1.close();

        SqlSession session3 = SqlSessionUtil.getSession();
        UserMapper mapper3 = session3.getMapper(UserMapper.class);
        mapper3.updateUser(1L, "张大千");
        session3.commit();
        session3.close();

        SqlSession session2 = SqlSessionUtil.getSession();
        UserMapper mapper2 = session2.getMapper(UserMapper.class);
        User user2 = mapper2.findUserById(1L);

    }
}
