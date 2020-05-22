package obulaSpringAOP.obulaSpringAOP;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethod implements MethodBeforeAdvice,AfterReturningAdvice,MethodInterceptor
{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("HijackBeforeMethod : Before method hijacked!");
		
	}

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("HijackBeforeMethod : After method hijacked!");
		
	}

	

	public Object invoke(MethodInvocation invocation) throws Throwable {
	System.out.println("method name :"+invocation.getMethod().getName()); 	
	System.out.println("method arguments:"+Arrays.toString(invocation.getArguments()));
	System.out.println("HijackBeforeMethod : Before method hijacked!");
	try {
		Object result=invocation.proceed();
		System.out.println("HijackBeforeMethod : After method hijacked!");
		return result;
	}catch (IllegalArgumentException e) {
		System.out.println("HijackBeforeMethod : Throw exception hijacked!");
		throw e;
	}
	}

}
