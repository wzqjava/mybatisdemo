import com.generate.dao.UserMapper;
import com.generate.pojo.User;
import com.generate.pojo.UserExample;
import com.smbms.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * description:
 * Created by Ray on 2019-09-09
 */
public class TestGeneratorUserMapper {
    @Test
    public void test1(){
        SqlSession session = SqlSessionUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectByPrimaryKey(1L);
        System.out.println(user.getUserName());

    }
    @Test
    public void test2(){
        SqlSession session = SqlSessionUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        UserExample example=new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
//        criteria.andUserNameEqualTo("张大千");
        criteria.andUserNameLike("%张%");
        criteria.andUserRoleEqualTo(3L);
        List<User> users = mapper.selectByExample(example);
        System.out.println(users);
//        System.out.println(user.getUserName());

    }

    @Test
    public void testInsert(){
        SqlSession session = SqlSessionUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user=new User();
        user.setUserCode("hello");
        user.setUserName("哈罗");
        user.setUserPassword("hhhhhhhhh");
        mapper.insert(user);

        session.commit();
        session.close();

    }
}
