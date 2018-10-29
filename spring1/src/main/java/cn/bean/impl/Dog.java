package cn.bean.impl;

import cn.bean.Animal;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal {
    public void run() {
        System.out.println("瞎几把跑");
    }
}
