package aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import metier.Compteur;

@Aspect

public aspect log4 {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	@Pointcut("execution(* *.*ncrementer(..))")
	public void logOperation() {
	}

	@Around("logOperation()")
	public Object aroundHello(ProceedingJoinPoint joinPoint) throws Throwable {
		
		logger.info("in around before " + joinPoint);
		logger.info("in around before " + joinPoint.getSignature().getName());
		
		Compteur c=(Compteur)joinPoint.getTarget();
		logger.info("Around before is running !"+c.toString());		
		Object ret = joinPoint.proceed();
		logger.info("Around after is running !"+c.toString());
		return ret;
	}


}
