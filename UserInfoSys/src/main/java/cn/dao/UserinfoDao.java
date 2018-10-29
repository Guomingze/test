package cn.dao;

import cn.pojo.Userinfo;

import java.util.List;

public interface UserinfoDao {
    /**
     * 根据用户某项信息查询符合的用户
     * @param userinfo 用户对象
     * @return 用户对象
     */
    Userinfo getUserByUser(Userinfo userinfo);

    /**
     * 修改用户信息
     * @param userinfo 用户对象
     * @return 影响行数
     */
    int updateUser(Userinfo userinfo);

    /**
     * 查询指定身份的用户
     * @param userAdmin
     * @return
     */
    List<Userinfo> allUser(int userAdmin);
}
