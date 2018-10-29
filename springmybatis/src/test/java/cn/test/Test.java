package cn.test;

import cn.pojo.Site;
import cn.service.SiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SiteService siteService = (SiteService) applicationContext.getBean("SiteServiceImpl");
//        List<Site> siteList = siteService.allSite();
//        for(Site site : siteList){
//            System.out.println(site.getSaddress() + "-----" + site.getSphone());
//        }
        Site site = new Site();
        site.setSaddress("山西省朔州市山阴县");
        List<Site> siteList = siteService.getSiteBySite(site);
        for(Site site1 : siteList){
            System.out.println( site1.getSid() + "\t" + site1.getSphone() + "\t" + site1.getSaddress());
        }
//        Site site = new Site();
//        site.setSid(1);
//        site.setSuid(4);
//        site.setSphone("18403415219");
//        site.setSaddress("朔州市");
//        site.setState(1);
//        int count = siteService.addSite(site);
//        System.out.println(count > 0 ? "添加成功" : "添加失败");
    }
}
