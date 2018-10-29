package cn.test;

import cn.pojo.Site;

import cn.service.SitePages;
import cn.util.Pages;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SitePages sitePages = (SitePages) applicationContext.getBean("SitePagesImpl");
        int a = 2;
//        for(int x = 0;x < 4;x ++) {
            Pages pages = sitePages.getSitePages(3, 3);
            if (pages != null) {
                System.out.println("当前显示行数" + pages.getNums());
                System.out.println("总页数" + pages.getAllPage());
                for (Site site : pages.getSiteList()) {
                    System.out.println(site.getSid() + "------------" + site.getSaddress());
                }
            }

//            Pages pages1 = (Pages) applicationContext.getBean("Pages");
//            System.out.println("当前显示行数" + pages1.getNums());
//            System.out.println("总页数" + pages1.getAllPage());
//            for (Site site : pages1.getSiteList()) {
//                System.out.println(site.getSid() + "------------" + site.getSaddress());
//            }
        }
//    }
}
