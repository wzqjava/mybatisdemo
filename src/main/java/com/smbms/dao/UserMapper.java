package com.smbms.dao;

import com.smbms.pojo.User;
import com.smbms.pojo.UserExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * description:
 * Created by Ray on 2019-09-05
 */
public interface UserMapper {
    User findUserById(Long id);
    List<User> findUserList();
    Integer updateUser(User user);
    Integer updateUser(@Param("id") Long id,@Param("userName") String userName);
    Integer insertUser(User user);

    Integer deleteUserById(Long id);
    List<UserExt> selectUserListByContion();
    // 延时加载
    List<User> selectUserListByContion2();
}
