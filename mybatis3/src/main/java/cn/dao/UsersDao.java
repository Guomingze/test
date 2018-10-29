package cn.dao;

import cn.pojo.Users;

public interface UsersDao {
    /**
     * 根据ID查询
     * @param id
     * @return Usersd对象
     */
    Users getUserById(int id);
}
