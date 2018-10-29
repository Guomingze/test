package cn.view;

import cn.pojo.Userinfo;
import cn.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;
@Controller("uiv")
public class UserInfoView {

    @Autowired
    private UserInfoService userInfoService;

    Scanner in = new Scanner(System.in);

    /**
     * 登录
     */
    public void login(){
        System.out.println("欢迎进入客户管理系统》》》》");
        System.out.println("----------------------------");
        System.out.println("请选择你的操作：1.登录-----2.退出");
        switch (in.nextInt()){
            case 1:
                System.out.println("请输入你的用户名");
                String username = in.next();
                System.out.println("请输入你的密码");
                String password = in.next();
                Userinfo userinfo = new Userinfo();
                userinfo.setUserName(username);
                userinfo.setUserPwd(password);
                Userinfo userinfo1 = userInfoService.login(userinfo);
                if(userinfo1 != null){
                    if("1".equals(userinfo1.getUserAdmin())){
                        adminMenu(userinfo1);
                    }else{
                        userMenu(userinfo1);
                    }
                }else{
                    System.out.println("用户名密码错误");
                    login();
                }
                break;
            default:
                System.out.println("再见");
                break;
        }
    }

    /**
     * 管理员操作
     * @param userinfo
     */
    public void adminMenu(Userinfo userinfo){
        System.out.println(userinfo.getUserName() + "管理员" );
        List<Userinfo> userinfos = userInfoService.allUser();
        System.out.println("用户ID" + "\t" + "用户姓名");
        for(Userinfo userinfo1 : userinfos){
            System.out.println(userinfo1.getUserId() + "\t" + userinfo1.getUserName());
            System.out.println("---------------------");
        }
        System.out.println("输入0返回，其他数字退出");
        if(in.nextInt() == 0){
            login();
        }
    }

    /**
     * 用户操作
     * @param userinfo
     */
    public void userMenu(Userinfo userinfo){
        System.out.println(userinfo.getUserName() + "你好");
        System.out.println("-----------------------------");
        System.out.println("ID" + "\t" + "姓名" + "\t" + "电话" + "\t" + "地址" + "\t" + "爱好" + "\t" + "性别" );
        System.out.println(userinfo.getUserId() + "\t" + userinfo.getUserName() + "\t" + userinfo.getUserPhone() + "\t"
                + userinfo.getUserAddress() + "\t" + userinfo.getUserHobby() + "\t" + userinfo.getSex());
        System.out.println("-----------------------------");
        System.out.println("输入1修改信息，输入任意数字返回");
        if(in.nextInt() == 1){
            System.out.println("请选择修改的条目：1.修改用户名2.修改密码3.修改地址4.修改爱好5.修改性别,其他数字返回");
            switch (in.nextInt()){
                case 1:
                    System.out.println("请输入新的用户名");
                    userinfo.setUserName(in.next());
                    break;
                case 2:
                    System.out.println("请输入新的密码");
                    userinfo.setUserPwd(in.next());
                    break;
                case 3:
                    System.out.println("请输入新的地址");
                    userinfo.setUserAddress(in.next());
                    break;
                case 4:
                    System.out.println("请输入新的爱好");
                    userinfo.setUserHobby(in.next());
                    break;
                case 5:
                    System.out.println("请输入新的性别");
                    userinfo.setSex(in.next());
                    break;
                default:
                    login();
                    break;
            }
            int count = userInfoService.updateUser(userinfo);
            System.out.println(count > 0 ? "修改成功" : "修改失败");
            login();
        }else{
            login();
        }
    }
}
