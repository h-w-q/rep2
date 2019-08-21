package com.example.test;

import com.example.dao.AccountDao;
import com.example.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisTest {
    public static void main(String[] args) {
        Reader reader;
        try {
            reader = Resources.getResourceAsReader("SqlMapConfig.xml_bak");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
            accountDao.add(new Account("甲","中国银行"));
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
