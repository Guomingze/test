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
    @Autowired
    private SiteDao siteDao;

    public List<Site> allSite() {
        return siteDao.allSite();
    }
    public List<Site> getSiteBySite(Site site) {
//        Pattern pattern = Pattern.compile("[abc]{2,}");
//        Matcher matcher = pattern.matcher("a");
//        System.out.println(matcher.matches());
        return siteDao.getSiteBySite(site);
    }

    @Transactional
    public int addSite(Site site) {
        return siteDao.addSite(site);
    }
}
