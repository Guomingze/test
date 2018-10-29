package cn.test;

import cn.view.UserInfoView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserInfoView userInfoView = (UserInfoView) applicationContext.getBean("uiv");
        userInfoView.login();
    }
}