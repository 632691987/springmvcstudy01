package springtest.javaconfig.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import springtest.javaconfig.annotations.LockedCourse;

@Aspect
@Component
public class LockingAspect extends AbstractAspect {
	
	@Pointcut("execution(* springtest.javaconfig.service.FunctionService.*(..))")
	public void anyMethod() {
	}

	/**
	 * Get the input parameter
	 */
	@Before("anyMethod() && @annotation(lockedCourse)")
	public void checkCourseIsLocked(JoinPoint jp, LockedCourse lockedCourse) {
		System.out.println("===============================checkCourseIsLocked start");
		String ledgerCode = getParameterValue(jp.getSignature(), jp.getArgs(), lockedCourse.ledgerCode());
		String username = getParameterValue(jp.getSignature(), jp.getArgs(), lockedCourse.username());
		System.out.println("FunctionService::checkCourseIsLocked");
		System.out.println("ledgerCode:" + ledgerCode);
		System.out.println("username  :" + username);
		System.out.println("orLockedByRequester  :" + lockedCourse.orLockedByRequester());
		System.out.println("===============================checkCourseIsLocked end");
	}

	/**
	 * Get the annotated value
	 */
	@Before("anyMethod() && @annotation(lockedCourse)")
	public void checkCourseIsLocked2(JoinPoint jp, LockedCourse lockedCourse) {
		System.out.println("===============================checkCourseIsLocked2 start");
		System.out.println("FunctionService::checkCourseIsLocked2");
		System.out.println("ledgerCode:" + lockedCourse.ledgerCode());
		System.out.println("username  :" + lockedCourse.username());
		System.out.println("orLockedByRequester  :" + lockedCourse.orLockedByRequester());
		System.out.println("===============================checkCourseIsLocked2 end");
	}
}