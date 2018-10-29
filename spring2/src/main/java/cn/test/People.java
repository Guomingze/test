package cn.test;

import org.springframework.stereotype.Component;

@Component("People")
public class People {
    public String show(String name){
        System.out.println("我叫" + name);
        int a = 2/0;
        return "我叫" + name;
    }
}
