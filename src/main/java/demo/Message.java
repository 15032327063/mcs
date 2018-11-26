package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Message {
	@Before("execution(* productNote*(..))")
	public void before(JoinPoint jp){
		System.out.println(jp.getSignature().toLongString());//查看切入的方法
		System.out.println("前置通知");
	}
	@After("execution(* productNote*(..))")
	public void after(JoinPoint jp){
		System.out.println("后置通知");
	}
	
	@AfterReturning("execution(* productNote*(..))")
	public void afterReturn(JoinPoint jp){
		System.out.println("后置通知2");
	}
	
	@AfterThrowing("execution(* productNote*(..))")
	public void throwing(){
		System.out.println("异常通知");
	}
	
	
	@Around("execution(* productNote*(..))")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		
		
			joinPoint.proceed();
			System.out.println("环绕通知");
		
	}
}
