package cn.test;

import cn.dao.UsersDao;
import cn.pojo.Site;
import cn.pojo.Users;
import cn.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;


public class Test {
    static Logger log = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UsersDao mapper = sqlSession.getMapper(UsersDao.class);
        Users users = mapper.getUserById(4);
        List<Site> siteList = users.getSites();
        for(Site site : siteList){
//            System.out.println(site.getSaddress());
            log.debug(site.getSaddress());
        }
    }
}
