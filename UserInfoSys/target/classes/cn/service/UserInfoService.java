package cn.service;

import cn.pojo.Userinfo;

import java.util.List;

public interface UserInfoService {
    /**
     * 登录
     * @param userinfo 携带用户名密码的对象
     * @return
     */
    Userinfo login(Userinfo userinfo);

    /**
     * 获取所有普通用户
     * @return
     */
    List<Userinfo> allUser();

    /**
     * 修改用户信息
     * @param userinfo
     * @return 影响行数
     */
    int updateUser(Userinfo userinfo);
}
