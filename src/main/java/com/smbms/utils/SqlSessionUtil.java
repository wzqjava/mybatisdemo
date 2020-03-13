package com.smbms.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * description:
 * Created by Ray on 2019-09-06
 */
public class SqlSessionUtil {
    private static SqlSessionFactory sessionFactory=null;
    static {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sessionFactory = new SqlSessionFactoryBuilder().build(is);
    }
    public static SqlSession getSession(){
        return sessionFactory.openSession();
    }
}
