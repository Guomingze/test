package cn.service.impl;

import cn.dao.SiteDao;
import cn.pojo.Site;
import cn.service.SitePages;
import cn.util.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SitePagesImpl")
public class SitePagesImpl implements SitePages {
    @Autowired
    private Pages pages;
    @Autowired
    private SiteDao siteDao;
    public Pages getSitePages(int page, int nums) {
        if(page < 1 || nums < 1){
            System.out.println("呵呵，输入值不对");
            return null;
        }
        Integer allNums = siteDao.allNum();
        List<Site> siteList = siteDao.allSiteByPage((page - 1) * nums,nums);
        Integer allPage ;
        if(allNums % nums == 0){
            allPage = allNums / nums;
        }else{
            allPage = allNums / nums + 1;
        }
        if(page > allPage){
            System.out.println("没有啦");
            return null;
        }else {
            pages.setAllPage(allPage);
            pages.setPage(page);
            pages.setNums(nums);
            pages.setSiteList(siteList);
            return pages;
        }
    }
}
