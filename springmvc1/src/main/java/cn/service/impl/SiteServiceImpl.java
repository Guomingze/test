package cn.service.impl;

import cn.dao.SiteDao;
import cn.pojo.Site;
import cn.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("SiteServiceImpl")
public class SiteServiceImpl implements SiteService {
    private SiteDao siteDao;

    public SiteDao getSiteDao() {
        return siteDao;
    }
    @Autowired
    public void setSiteDao(SiteDao siteDao) {
        this.siteDao = siteDao;
    }

    public List<Site> allSite() {
        return siteDao.allSite();
    }
    public List<Site> getSiteBySite(Site site) {
        return siteDao.getSiteBySite(site);
    }

    @Transactional
    public int addSite(Site site) {
        return siteDao.addSite(site);
    }
}
