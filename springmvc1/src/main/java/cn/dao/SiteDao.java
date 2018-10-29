package cn.dao;

import cn.pojo.Site;
import java.util.List;

public interface SiteDao {
    /**
     * 所有的地址对象
     * @return 地址对象集合
     */
    List<Site> allSite();

    /**
     * 根据对象部分属性获取符合条件的对象集合
     * @param site
     * @return
     */
    List<Site> getSiteBySite(Site site);

    /**
     * 添加一条地址
     * @return 影响行数
     */
    int addSite(Site site);
}