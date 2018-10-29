package cn.test;

import cn.dao.SiteDao;
import cn.pojo.Site;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;


public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SiteDao siteDao = sqlSession.getMapper(SiteDao.class);
        Site site = new Site();
        site.setSid(2);
        site.setSaddress("山西省朔州市山阴县");
        int count = siteDao.amendSite(site);
        System.out.println(count > 0 ? "修改成功" : "修改失败");
        sqlSession.commit();
        sqlSession.close();
        sqlSession.close();
    }
}
