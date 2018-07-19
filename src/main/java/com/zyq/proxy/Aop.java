package com.zyq.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author zyq
 * @date 2018/7/16 10:41
 */

@Component
@Aspect
public class Aop {
    @Pointcut("execution(* com.zyq.proxy..*.*(..))")
    public void PointCut(){
        }
    @Before("PointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        /*获得莫表对象要执行的方法*/
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "准备执行");
    }
    /*使用纯注解的方式获得返回值*/
    @AfterReturning(value="PointCut()",returning = "result")
    public void afterAdvice(JoinPoint joinPoint, Object result) {
        System.out.println("后置通知" );
    }

    /*使用纯注解的方式获得抛出的异常*/
    @AfterThrowing(value="PointCut()",throwing = "ex")
    public void exceptionAdvice(JoinPoint joinPoint,Exception ex) {
        /*获得抛出的异常*/
        System.out.println("异常通知" + ex.getMessage());
    }

    @After("PointCut()")
    public void finallyAdvice() {
        System.out.println("最终通知");
    }

    /*环绕通知*/
    /*区别于后置通知的Result方式*/
    @Around("PointCut()")
    public  void AroundAdvice(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("--before--");
            Object result = joinPoint.proceed();
        }catch(Throwable throwable){
             throwable.printStackTrace();
            System.out.println("---exception---");
        }finally {
            System.out.println("---finally--");
        }
    }
}
