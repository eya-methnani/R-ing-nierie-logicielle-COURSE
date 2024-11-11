package aspects;




import java.util.logging.Logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect

public class log1Aspect {
	private Logger logger = Logger.getLogger(this.getClass().getName());
			
	@Pointcut("call (* incrementer(..))")
			
	public void logIncrementation() { }
			
	@Before("logIncrementation()")
			
	public void avant() {		
		logger.info("Avant incrementation");
		}
			
	@After("logIncrementation()")
			
	public void après() {
		logger.info("Après incrementation");
		
	}	
	
	
	
	@Pointcut("call (* decrementer(..))")
	
	public void logdecrementation() { }
			
	@Before("logdecrementation()")
			
	public void avant1() {		
		logger.info("Avant decrementation");
		}
			
	@After("logdecrementation()")
			
	public void après1() {
		logger.info("Après decrementation");
			
		
	}
			
}


