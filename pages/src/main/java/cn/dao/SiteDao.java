package cn.dao;

import cn.pojo.Site;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SiteDao {
    /**
     *
     * @param page
     * @param nums
     * @return
     */
    List<Site> allSiteByPage(@Param("page") int page,@Param("nums") int nums);

    /**
     *
     * @return
     */
    Integer allNum();
}
