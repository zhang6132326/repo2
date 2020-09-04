package com.zxf.bean2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAspect {
    @Before(value = "execution(* com.zxf.bean2.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        Object[] args=joinPoint.getArgs();
        String methodName=joinPoint.getSignature().getName();
        System.out.println("方法名:"+methodName+",方法参数:"+ Arrays.toString(args)+".....方法执行之前");
    }
    @After(value = "execution(* com.zxf.bean2.*.*(..))")
    public void afterMethod(){
        System.out.println("方法执行之后........");
    }
    @AfterReturning(value = "execution(* com.zxf.bean2.*.*(..))",returning = "result")
    public void afterRetunMethd(JoinPoint joinPoint,Object result){
        System.out.println("后置返回:"+result);
    }
    @Around(value = "execution(* com.zxf.bean2.*.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        Object result=null;
        try{
            System.out.println("环绕前置");
            result=joinPoint.proceed();
            return result;
        }catch (Throwable e){
            System.out.println("环绕异常");
        }finally {
            System.out.println("环绕后置");
        }
        return null;
    }
}
