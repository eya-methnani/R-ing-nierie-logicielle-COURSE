package aspects;


import java.util.logging.Logger;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class log3Aspect {
	
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Pointcut("execution(* *.*.rretirer(..))")
	public void logOperation() {
	}
	
	 @Around("logOperation()")
	    public Object aroundHello(ProceedingJoinPoint joinPoint) throws Throwable {
		 logger.info("in around before " + joinPoint);
		 logger.info("in around before " + joinPoint.getSignature().getName());
		 	
	       logger.info("Around before is running !");
	       Object ret = joinPoint.proceed();	        
	       logger.info("Around after is running !");
	       return ret;
	    }


}
