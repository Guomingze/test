package cn.servlet;

import cn.pojo.Site;
import cn.service.SiteService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Api("swagger测试")
@Controller("test")
@RequestMapping("/hello")
public class Test {
    @Autowired
    @Qualifier("SiteServiceImpl")
    private SiteService siteService;

    public SiteService getSiteService() {
        return siteService;
    }
    public void setSiteService(SiteService siteService) {
        this.siteService = siteService;
    }

    @RequestMapping(value = "/mvc",method = RequestMethod.POST)
    @ResponseBody
    public Site helloMvc(@RequestBody Site site){
        System.out.println(site.getSuid()+site.getSuid()+site.getSaddress()+site.getSphone());
        return site;
    }
    @RequestMapping(value = "/mvc1",method= RequestMethod.GET)
    @ResponseBody
    public List<Site> hehe(){
        List<Site> siteList = siteService.allSite();
        return siteList;
    }
    @RequestMapping(value = "/site")
    public ModelAndView tes(){

        List<Site> siteList = siteService.allSite();
        ModelAndView mav=new ModelAndView("home");
        mav = mav.addObject("hehe",siteList);
        return mav;
    }
}
