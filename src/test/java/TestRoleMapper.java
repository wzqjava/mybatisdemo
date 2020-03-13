import com.smbms.dao.RoleMapper;
import com.smbms.pojo.Role;
import com.smbms.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * description:
 * Created by Ray on 2019-09-09
 */
public class TestRoleMapper {

    @Test
    public void testDelay(){
        SqlSession session = SqlSessionUtil.getSession();
        RoleMapper mapper = session.getMapper(RoleMapper.class);
        Role role = mapper.findRoleById(1L);
//        System.out.println(role);
        System.out.println(role.getRoleName());//延时加载开启了，此句不加载user查询
//        System.out.println(role.getUsers().get(0).getUserName());
        session.close();

    }
}
