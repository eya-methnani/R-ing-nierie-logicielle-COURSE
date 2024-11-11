package aspects;

import metier.CompteBancaire;
import java.util.logging.Logger;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import metier.CompteBancaire;

@Aspect
public class log4Aspect {
	
	private Logger logger = Logger.getLogger(this.getClass().getName());
	@Pointcut("execution(* *.*.rretirer(..)) ") 
	public void logOperation() {
	}
	
	 @Around("logOperation()")
	    public Object aroundHello(ProceedingJoinPoint joinPoint) throws Throwable {
		 
		 CompteBancaire c=(CompteBancaire) joinPoint.getTarget();
		 //logger.info("in around before " + joinPoint);
		 
		 //logger.info("in around before " + joinPoint.getSignature().getName());
		 
		 
		 logger.info("before retirer:" + c.getSolde());
		 logger.info("in around before" + joinPoint);
		 	
	       //logger.info("Around before is running !");
		 logger.info("method called:" +joinPoint.getSignature().getName());
	       
	       Object ret = joinPoint.proceed();	
	       
	       //logger.info("Around after is running !");
	       
	       logger.info("after retirer" + c.getSolde());
	       
	       return ret;
	    }


}
