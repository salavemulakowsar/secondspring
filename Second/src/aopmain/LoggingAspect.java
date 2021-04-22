package aopmain;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	//one aspect can contain multiple advices
	
		//@Before("execution(* aop.model..*.*(..))")   --- for all methods of all classes present in this package and its subpackages

		//@Before("execution(public String aop.model.Triangle.getName())")
		//@Before("execution(* aop..*.*(..))")  --for aop and its subpackages
		
		//@Before("execution(* aop..*.*(..))")
		
		//@Before("execution(public String aop.model.*.getName())")  --- for all getName methods in all classes within the package aop.model
		//@Before("execution(public * aop.model.*.getName())")  --- irrespective of return type
		//@Before("execution(public * aop.model.*.get*())")   --- for all methods which start with get
		
		/*
		 * @Before("execution(* aopmodel..*.get*())") public void loggingAdvice() {
		 * System.out.println("writing log before method is executed"); }
		 * 
		 * @Before("allCircleMethods()") public void loggingAdvice(JoinPoint joinPoint)
		 * { String methodName = joinPoint.toLongString();
		 * if(methodName.contains("getDia")) {
		 * System.out.println("writing log for getdia method b4 its executed"); } else
		 * if(methodName.contains("setName")) {
		 * System.out.println("writing log for setName method b4 its executed");
		 * 
		 * 
		 * } }
		 */
		/*
		 * @AfterReturning("allCircleMethods()") public void
		 * adviceAfterCircleMethodsComplete() {
		 * System.out.println("after a circle method returns"); }
		 * 
		 * @AfterThrowing("args(name)") public void adviceAfterExceptionThrown(String
		 * name) { S
		 ystem.out.println("advice after exception is thrown:"+name);
	}*/

	/*
	 * @AfterReturning(pointcut="args(name)", returning="returnString")
	 * 
	 * public void StringArgsMethods(String name,String returnString) {
	 * System.out.println("i/p String ="+name +"\n o/p String="+returnString); }
	 */
	/*
	 * @AfterThrowing(pointcut="args(name)",throwing="ex") public void
	 * exceptionAdvice(String name, RuntimeException ex) {
	 * System.out.println("Exception is being thrown:"+ex); }
	 */
	
	 @Pointcut("execution(* aopmodel..*.get*())") public void allGetters() {}
	 
		@Pointcut("within(aopmodel.Circle)")
		public void allCircleMethods() {}
	
		
		/*
		 * @Before("methodsStringArgs(name)") public void stringArgsAdvice(String name)
		 * { System.out.
		 * println("advice for all methods which accept a string as an argument "+name);
		 * }
		 */

		@Pointcut("args(name)")
		public void methodsStringArgs(String name) {}
		@Around("@annotation(aopmodel.Loggable)")
		//@Around("allGetters()")
		public void myAroundAdvice(ProceedingJoinPoint pjp) 
		{
		try {
			System.out.println("before advice");
			pjp.proceed();
			System.out.println("after method returns advice");
		} 
		catch (Throwable e) {
			System.out.println("after throwing");
		}
		System.out.println("finally advice");
		}	
		
}
