package cn.aop;


import cn.test.People;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class AopObject {

    @Pointcut("execution(public String show(String))")
    public void poincut(){}

//    @Before("poincut()")
//    public void before (JoinPoint joinpoint){
//        System.out.println("前置增强开始执行,调用" + joinpoint.getSignature().getName() + "的方法,方法入参" + Arrays.toString(joinpoint.getArgs()));
//    }
//    @AfterReturning(value = "poincut()",returning = "result")
//    public void afterRreturning(JoinPoint joinpoint,Object result){
//        System.out.println("后置增强开始执行,调用" + joinpoint.getSignature().getName() + "的方法方法入参" + Arrays.toString(joinpoint.getArgs()) + "返回值为---" + result);
//    }
    @Around("poincut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        Object object = null;
        Object  people  =  proceedingJoinPoint.getThis();
        try {
            object = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕增强开始执行" + object.toString());
    }
//    @AfterThrowing(value = "poincut()",throwing = "e")
//    public void afterThrow(JoinPoint joinPoint,Exception e){
//        System.out.println("异常抛出增强开始执行------异常信息是：" + e.getMessage());
//        System.out.println("--------------------------------");
//        e.printStackTrace();
//        System.out.println("--------------------------------");
//    }
//    @After(value = "poincut()")
//    public void after(JoinPoint joinPoint){
//        System.out.println("最终增强开始执行" + joinPoint.getSignature().getName());
//    }
}
