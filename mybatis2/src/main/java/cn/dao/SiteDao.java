package cn.dao;

import cn.pojo.Site;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SiteDao {
    /**
     * 获取条目数量
     * @return
     */
    int getSiteCount();

    /**
     * 添加条目
     * @param site
     * @return
     */
    int addSite(Site site);

    /**
     * 所有的条目对象
     * @return
     */
    List<Site> allSite();

    /**
     * 修改条目
     * @param site
     * @return
     */
    int amendSite(Site site);

    /**
     *
     * @param site
     * @return
     */
    Site getSite(Site site);

    /**
     * 查询指定ID列表
     * @param hashMap ID列表
     * @return Site集合
     */
    List<Site> getSiteBySids(Map hashMap);
    List<Site> getSiteBySite(Site site);
}
