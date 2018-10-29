package cn.bean.impl;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Te {
    Logger log = Logger.getLogger(Te.class);
    @Before("execution(* cn.bean.impl.PeopleImp.speak1(..))")
    public void hehe(){
        log.debug("前置增强");
        System.out.println("前置增强");
    }
    @AfterReturning("execution(* cn.bean.impl.PeopleImp.speak1(..))")
    public void haha(){
        System.out.println("后置增强");
    }
    @AfterThrowing(value = "execution(* cn.bean.impl.PeopleImp.speak1(..))",throwing = "e")
    public void exceptions(Exception e){
        System.out.println("异常抛出增强" + e.getMessage());
    }
    @After(value = "execution(* cn.bean.impl.PeopleImp.speak1(..)))")
    public void finalys(){
        System.out.println("最终增强");
    }
    public void around(){
        System.out.println("环绕增强");
    }
}
