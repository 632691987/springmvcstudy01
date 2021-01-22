package springtest.aoppoc.aspectannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* springtest.aoppoc.aspectxml.CustomerBo.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("LoggingAspect::logBefore()");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

	@After("execution(* springtest.aoppoc.aspectxml.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("LoggingAspect::logAfter()");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
	
	@AfterReturning(pointcut = "execution(* springtest.aoppoc.aspectxml.CustomerBo.addCustomerReturnValue(..))", returning= "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		System.out.println("LoggingAspect::logAfterReturning()");
		System.out.println("Method returned value is : " + result);
		System.out.println("******");
	}
	
	@AfterThrowing(pointcut = "execution(* springtest.aoppoc.aspectxml.CustomerBo.addCustomerThrowException(..))", throwing= "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		System.out.println("LoggingAspect::logAfterThrowing()");
		System.out.println("Exception : " + error);
		System.out.println("******");
	}
	
	@Around("execution(* springtest.aoppoc.aspectxml.CustomerBo.addCustomerAround(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("LoggingAspect::logAround");
		System.out.println("Around before is running!");
		joinPoint.proceed();
		System.out.println("Around after is running!");
	}
	
}