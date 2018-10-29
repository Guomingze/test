package cn.service.impl;

import cn.dao.UserinfoDao;
import cn.pojo.Userinfo;
import cn.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("uisi")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserinfoDao userinfoDao;

    /**
     * 登录
     * @param userinfo 携带用户名密码的对象
     * @return
     */
    @Override
    public Userinfo login(Userinfo userinfo) {
        Userinfo userinfo1 = userinfoDao.getUserByUser(userinfo);
        return userinfo1;
    }

    /**
     * 获取所有普通用户
     * @return
     */
    @Override
    public List<Userinfo> allUser() {
        return userinfoDao.allUser(0);
    }

    /**
     * 修改用户信息
     * @param userinfo
     * @return 影响行数
     */
    @Override
    public int updateUser(Userinfo userinfo) {
        return userinfoDao.updateUser(userinfo);
    }
}
