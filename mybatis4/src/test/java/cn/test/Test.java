package cn.test;

import cn.dao.UsersDao;
import cn.pojo.Site;
import cn.pojo.Users;
import cn.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UsersDao mapper = sqlSession.getMapper(UsersDao.class);
        Users users = mapper.getUserById(4);
        List<Site> siteList = users.getSiteList();
        for(Site site : siteList){
            System.out.println(site.getSaddress()+site.getSphone());
        }
    }
}
