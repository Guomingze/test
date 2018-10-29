package cn.util;

import cn.pojo.Site;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("Pages")
public class Pages {
    private Integer page;
    private Integer nums;
    private Integer allPage;
    private List<Site> siteList;
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Integer getAllPage() {
        return allPage;
    }

    public void setAllPage(Integer allPage) {
        this.allPage = allPage;
    }

    public List<Site> getSiteList() {
        return siteList;
    }

    public void setSiteList(List<Site> siteList) {
        this.siteList = siteList;
    }
}
