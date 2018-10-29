package cn.service;

import cn.pojo.Site;

import java.util.List;

public interface SiteService {
    /**
     *
     * @return
     */
    List<Site> allSite();

    /**
     *
     * @return
     */
    List<Site> getSiteBySite(Site site);

    /**
     *
     * @param site
     * @return
     */
    int addSite(Site site);
}
